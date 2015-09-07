package com.rhcloud.jobsnetwork.service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rhcloud.jobsnetwork.entity.Category;
import com.rhcloud.jobsnetwork.entity.Job;
import com.rhcloud.jobsnetwork.repository.CategoryRepository;
import com.rhcloud.jobsnetwork.repository.JobRepository;

@Transactional
@Service
public class InitializeDatabaseService {

	@Autowired
	private JobRepository jobRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@PostConstruct
	public void initialize() {
		
		Job job1 = new Job();
		
		job1.setTitle("Mobile App Dev");
		job1.setCompany("Google Inc");
		job1.setLocation("San Jose");		
		jobRepository.save(job1);
		
		Category category = new Category();
		
		category.setName("Android App Dev");
		category.setJob(job1);		
		categoryRepository.save(category);
		
		Category category2 = new Category();
		category2.setName("iOS App Dev");
		category2.setJob(job1);		
		categoryRepository.save(category2);
		
		
		
	}
}

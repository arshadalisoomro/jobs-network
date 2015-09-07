package com.rhcloud.jobsnetwork.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.rhcloud.jobsnetwork.entity.Job;
import com.rhcloud.jobsnetwork.interfaces.IDatabaseCrud;
import com.rhcloud.jobsnetwork.repository.CategoryRepository;
import com.rhcloud.jobsnetwork.repository.JobRepository;

@Service
public class JobService implements IDatabaseCrud<Job>{

	@Autowired
	private JobRepository jobRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public void save(Job obj) {
		// TODO Auto-generated method stub
		jobRepository.save(obj);
	}

	@Override
	public List<Job> findAll() {
		// TODO Auto-generated method stub		
		return jobRepository.findAll();
	}

	public Job findJobById(Integer id) {
		// TODO Auto-generated method stub
		return jobRepository.findOne(id);
	}
	
	public Job findJobWithCategories(Integer id) {
		// TODO Auto-generated method stub
		Job job = findJobById(id);		
		job.setCategories(categoryRepository.findByJob(job, 
				new PageRequest(0, 15, Direction.DESC, "createdAt")));		
		return job;
	}

}

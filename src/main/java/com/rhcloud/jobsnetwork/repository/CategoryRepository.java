package com.rhcloud.jobsnetwork.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.rhcloud.jobsnetwork.entity.Category;
import com.rhcloud.jobsnetwork.entity.Job;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
	List<Category> findByJob(Job job, Pageable pageable); 
}

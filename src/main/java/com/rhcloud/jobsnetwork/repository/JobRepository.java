package com.rhcloud.jobsnetwork.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rhcloud.jobsnetwork.entity.Job;

public interface JobRepository extends JpaRepository<Job, Integer> {
	
}

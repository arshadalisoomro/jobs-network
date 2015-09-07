package com.rhcloud.jobsnetwork.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.rhcloud.jobsnetwork.interfaces.TableName;

/**
 * Entity implementation class for Entity: Category
 *
 */
@Entity
@Table( name = TableName.CATEGORY_TABLE)
public class Category {

	   
	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "job_id")
	private Job job;
	
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}
   
}

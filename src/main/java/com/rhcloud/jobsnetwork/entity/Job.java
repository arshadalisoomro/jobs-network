package com.rhcloud.jobsnetwork.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.rhcloud.jobsnetwork.interfaces.TableName;

/**
 * Entity implementation class for Entity: Job
 *
 */
@Entity
@Table( name = TableName.JOB_TABLE)
public class Job {

	   
	@Id
	@GeneratedValue
	private Integer id;
	
	private String title;
	
	private String description;
	
	private String location;
	
	private String company;
	
	
	private String url;
	
	@Column(name = "to_apply")
	private String toApply;
	
	private String email;
	
	@Column(name = "created_at")
	private Date createdAt;
	
	@OneToMany(mappedBy = "job")
	private List<Category> categories;
	
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}



	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getToApply() {
		return toApply;
	}

	public void setToApply(String toApply) {
		this.toApply = toApply;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
   
}

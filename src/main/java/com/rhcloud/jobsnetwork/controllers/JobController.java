package com.rhcloud.jobsnetwork.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rhcloud.jobsnetwork.entity.Job;
import com.rhcloud.jobsnetwork.service.CategoryService;
import com.rhcloud.jobsnetwork.service.JobService;

@Controller
public class JobController {
	
	@Autowired
	private JobService jobService;
	
	@Autowired
	private CategoryService categoryService;
	
	@ModelAttribute("job")
	public Job constructJob() {
		return new Job();
	}
	
	@RequestMapping(value = "/jobs", method = RequestMethod.GET)
	public String showJobs(Model model) {
		model.addAttribute("jobs", jobService.findAll());
		return "jobs";
	} 
	
	@RequestMapping(value = "/jobs/{id}", method = RequestMethod.GET)
	public String showJobDetail(Model model, @PathVariable Integer id) {
		model.addAttribute("job", jobService.findJobWithCategories(id));
		return "job-detail";
	} 
	
	@RequestMapping(value = "/show-add-job", method = RequestMethod.GET)
	public String showJobForm(Model model) {
		model.addAttribute("categories", categoryService.findAll());
		return "add-job";
	} 
	
	@RequestMapping(value = "/show-add-job", method = RequestMethod.POST)
	public String addJobDetail(@ModelAttribute("job") Job job) {
		jobService.save(job);
		return "redirect:/jobs";
	} 

}

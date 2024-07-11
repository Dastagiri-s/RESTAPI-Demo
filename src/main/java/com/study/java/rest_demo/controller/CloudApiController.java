package com.study.java.rest_demo.controller;

import com.study.java.rest_demo.Service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import com.study.java.rest_demo.model.CloudVendor;

import java.util.List;


@RestController
@RequestMapping("/cloudvendor")
public class CloudApiController
{

	CloudVendorService cvs;

	public CloudApiController(CloudVendorService cvs)
	{
		this.cvs = cvs;
	}


	@GetMapping("{vendorId}")
	public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId)
	{

		return cvs.getCloudVendorById(vendorId);
	}

	@GetMapping
	public List<CloudVendor> getAllCloudVendor()
	{
		return cvs.getAllCloudVendors();
	}


	@PostMapping
	public String createCloudVendorDetails(@RequestBody CloudVendor cv)
	{
		cvs.createCloudVendor(cv);
		return "Cloud vendor Created successfully";
	}
	
	@PutMapping
	public String updateCloudVendorDetails(@RequestBody CloudVendor cv)
	{
		cvs.updateCloudVendor(cv);

		return "Cloud vendor updated Successfully";
	}
	
	@DeleteMapping("{vendorId}")
	public String DeleteCloudVendorDetails(@PathVariable("vendorId") String vendorId)
	{
		
		cvs.deleteCloudVendorById(vendorId);
		return "cloud vendor deleted successfully";
		
	}

}

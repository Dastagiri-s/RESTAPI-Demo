package com.study.java.rest_demo.Service.Impl;

import com.study.java.rest_demo.Service.CloudVendorService;
import com.study.java.rest_demo.model.CloudVendor;
import com.study.java.rest_demo.repository.CloudVendorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CloudVendorServiceImpl implements CloudVendorService
{

    CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository)
    {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor)
    {
        cloudVendorRepository.save(cloudVendor);
        return "Cloud Vendor created Successfully";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor)
    {
        cloudVendorRepository.save(cloudVendor);
        return "cloud vendor updated successfully";
    }

    @Override
    public String deleteCloudVendorById(String cloudVendorId)
    {
        cloudVendorRepository.deleteById(cloudVendorId);
        return "cloud vendor id is deleted successfully";
    }

    @Override
    public CloudVendor getCloudVendorById(String cloudVendorById)
    {

        return  cloudVendorRepository.findById(cloudVendorById).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendors()
    {
        return cloudVendorRepository.findAll();
    }
}

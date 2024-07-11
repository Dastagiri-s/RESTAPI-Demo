package com.study.java.rest_demo.Service;

import com.study.java.rest_demo.model.CloudVendor;

import java.util.List;

public interface CloudVendorService
{
    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public String deleteCloudVendorById(String cloudVendorId);
    public CloudVendor getCloudVendorById(String cloudVendorById);
    public List<CloudVendor> getAllCloudVendors();
}

package com.study.java.rest_demo.repository;

import com.study.java.rest_demo.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CloudVendorRepository extends JpaRepository<CloudVendor,String>
{


}

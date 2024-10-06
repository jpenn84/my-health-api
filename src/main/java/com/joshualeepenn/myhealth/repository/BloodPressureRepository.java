package com.joshualeepenn.myhealth.repository;

import com.joshualeepenn.myhealth.model.BloodPressure;
import org.springframework.data.repository.CrudRepository;


public interface BloodPressureRepository extends CrudRepository<BloodPressure, Integer> {
}

package com.joshualeepenn.myhealth.repository;

import com.joshualeepenn.myhealth.model.BloodPressure;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BloodPressureRepository extends JpaRepository<BloodPressure, Integer> {
}

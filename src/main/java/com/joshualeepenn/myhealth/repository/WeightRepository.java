package com.joshualeepenn.myhealth.repository;

import com.joshualeepenn.myhealth.model.Weight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeightRepository extends JpaRepository<Weight, Integer> {
}

package com.joshualeepenn.myhealth.repository;

import com.joshualeepenn.myhealth.model.Pulse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PulseRepository extends JpaRepository<Pulse, Integer> {
}

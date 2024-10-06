package com.joshualeepenn.myhealth.repository;

import com.joshualeepenn.myhealth.model.Pulse;
import org.springframework.data.repository.CrudRepository;

public interface PulseRepository extends CrudRepository<Pulse, Integer> {
}

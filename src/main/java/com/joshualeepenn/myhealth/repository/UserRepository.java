package com.joshualeepenn.myhealth.repository;

import com.joshualeepenn.myhealth.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}

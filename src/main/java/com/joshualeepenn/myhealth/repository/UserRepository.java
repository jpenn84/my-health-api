package com.joshualeepenn.myhealth.repository;

import com.joshualeepenn.myhealth.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}

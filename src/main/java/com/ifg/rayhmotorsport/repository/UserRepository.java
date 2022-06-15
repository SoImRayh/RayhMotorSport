package com.ifg.rayhmotorsport.repository;

import com.ifg.rayhmotorsport.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

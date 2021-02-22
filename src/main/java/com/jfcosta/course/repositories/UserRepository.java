package com.jfcosta.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jfcosta.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

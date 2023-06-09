package com.minhaempresa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minhaempresa.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

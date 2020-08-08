package com.lunionsoft.course1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lunionsoft.course1.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

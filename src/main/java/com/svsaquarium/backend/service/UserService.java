package com.svsaquarium.backend.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.svsaquarium.backend.entity.User;
@Repository
public interface UserService extends JpaRepository<User, Integer> {

}

package com.gym.tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gym.tracker.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
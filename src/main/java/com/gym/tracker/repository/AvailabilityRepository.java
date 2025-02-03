package com.gym.tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gym.tracker.model.Availability;

public interface AvailabilityRepository extends JpaRepository<Availability, Long> {
}
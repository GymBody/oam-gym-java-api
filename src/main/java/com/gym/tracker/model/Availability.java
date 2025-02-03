package com.gym.tracker.model;

import jakarta.persistence.*;
import lombok.Data;
import java.sql.Time;

@Data
@Entity
@Table(name = "availability")
public class Availability {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "day_of_week", nullable = false)
    private String dayOfWeek;

    @Column(name = "start_time", nullable = false)
    private Time startTime;

    @Column(name = "end_time", nullable = false)
    private Time endTime;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
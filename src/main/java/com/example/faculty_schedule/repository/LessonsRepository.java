package com.example.faculty_schedule.repository;

import com.example.faculty_schedule.models.Lessons;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonsRepository extends JpaRepository<Lessons, Integer> {
}

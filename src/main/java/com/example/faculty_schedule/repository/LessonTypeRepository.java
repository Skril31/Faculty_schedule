package com.example.faculty_schedule.repository;

import com.example.faculty_schedule.models.LessonType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonTypeRepository extends JpaRepository<LessonType, Integer> {
}

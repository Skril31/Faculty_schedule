package com.example.faculty_schedule.repository;

import com.example.faculty_schedule.models.Lesson_type;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonTypeRepository extends JpaRepository<Lesson_type, String> {
}

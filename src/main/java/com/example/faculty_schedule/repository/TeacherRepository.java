package com.example.faculty_schedule.repository;

import com.example.faculty_schedule.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
}

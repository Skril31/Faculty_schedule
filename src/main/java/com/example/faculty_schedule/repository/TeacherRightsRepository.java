package com.example.faculty_schedule.repository;

import com.example.faculty_schedule.composite_keys.Teacher_rightsPK;
import com.example.faculty_schedule.models.Teacher_rights;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRightsRepository extends JpaRepository<Teacher_rights, Teacher_rightsPK> {
}

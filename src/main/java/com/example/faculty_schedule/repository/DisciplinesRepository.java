package com.example.faculty_schedule.repository;

import com.example.faculty_schedule.models.Disciplines;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisciplinesRepository extends JpaRepository<Disciplines, Integer> {
}

package com.example.faculty_schedule.repository;

import com.example.faculty_schedule.models.Groups;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Groups, Integer> {
}

package com.example.faculty_schedule.repository;

import com.example.faculty_schedule.models.Groups;
import com.example.faculty_schedule.models.Lessons;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LessonsRepository extends JpaRepository<Lessons, Integer> {
    List<Lessons> findLessonsByGroupsIdGroupAndWeekDay(Integer id, String day);
    List<Lessons> findLessonsByGroupsIdGroupAndWeekDayOrderByStartTime(Integer id, String day);
    List<Lessons> findLessonsByGroupsIdGroup(Integer id);
    List<Lessons> findLessonsByGroupsIdGroupOrderByStartTime(Integer id);
}

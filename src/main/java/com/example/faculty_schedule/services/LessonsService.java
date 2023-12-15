package com.example.faculty_schedule.services;

import com.example.faculty_schedule.models.Lessons;

import java.util.List;

public interface LessonsService {
    void create(Lessons lessons);

    List<Lessons> readAll();

    Lessons read(Integer id);

    boolean update(Lessons lessons,Integer id);

    boolean delete(Integer id);

    List<Lessons> findLessonsByGroupsIdGroupAndWeekDay(Integer id, String day);
    List<Lessons> findLessonsByGroupsIdGroupAndWeekDayOrderByStartTime(Integer id, String day);

    List<Lessons> findLessonsByGroupsIdGroup(Integer id);
    List<Lessons> findLessonsByGroupsIdGroupOrderByStartTime(Integer id);
}

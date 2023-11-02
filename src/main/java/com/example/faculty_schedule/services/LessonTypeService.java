package com.example.faculty_schedule.services;

import com.example.faculty_schedule.models.LessonType;

import java.util.List;

public interface LessonTypeService {
    void create(LessonType lessonType);


    List<LessonType> readAll();


    LessonType read(Integer id);


    boolean update(LessonType lessonType,Integer id);


    boolean delete(Integer id);
}

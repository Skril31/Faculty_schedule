package com.example.faculty_schedule.services;

import com.example.faculty_schedule.models.Lessons;

import java.util.List;

public interface LessonsService {
    void create(Lessons lessons);


    List<Lessons> readAll();


    Lessons read(Integer id);


    boolean update(Lessons lessons,Integer id);


    boolean delete(Integer id);
}

package com.example.faculty_schedule.services;

import com.example.faculty_schedule.models.TeacherRights;

import java.util.List;

public interface TeacherRightsService {
    void create(TeacherRights teacherRights);


    List<TeacherRights> readAll();


    TeacherRights read(Integer id);


    boolean update(TeacherRights teacherRights,Integer id);


    boolean delete(Integer id);
}

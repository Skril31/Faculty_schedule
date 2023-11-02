package com.example.faculty_schedule.services;

import com.example.faculty_schedule.models.Disciplines;
import com.example.faculty_schedule.models.Groups;

import java.util.List;

public interface GroupsService {
    void create(Groups groups);


    List<Groups> readAll();


    Groups read(Integer id);


    boolean update(Groups groups,Integer id);


    boolean delete(Integer id);
}

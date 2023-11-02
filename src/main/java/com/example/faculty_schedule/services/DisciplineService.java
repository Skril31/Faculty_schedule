package com.example.faculty_schedule.services;

import com.example.faculty_schedule.models.Disciplines;

import java.util.List;

public interface DisciplineService {
    void create(Disciplines disciplines);


    List<Disciplines> readAll();


    Disciplines read(String id);


    boolean update(Disciplines disciplines,String id);


    boolean delete(String id);
}

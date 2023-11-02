package com.example.faculty_schedule.services;

import com.example.faculty_schedule.models.Lessons;
import com.example.faculty_schedule.repository.LessonsRepository;

import java.util.List;
import java.util.Optional;

public class LessonsServiceImp implements LessonsService{
    private final LessonsRepository lessonsRepository;
    LessonsServiceImp(LessonsRepository lessonsRepository){
        this.lessonsRepository = lessonsRepository;
    }
    @Override
    public void create(Lessons lessons) {
        lessonsRepository.save(lessons);
    }

    @Override
    public List<Lessons> readAll() {
        return lessonsRepository.findAll();
    }

    @Override
    public Lessons read(Integer id) {
        Optional<Lessons> lessons = lessonsRepository.findById(id);
        if(lessons.isPresent()){
            return lessons.get();
        }
        return null;
    }

    @Override
    public boolean update(Lessons lessons, Integer id) {
        if (lessonsRepository.existsById(id)){
            lessons.setId(id);
            lessonsRepository.save(lessons);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        if (lessonsRepository.existsById(id)){
            lessonsRepository.deleteById(id);
            return true;
        }
        return false;
    }
}

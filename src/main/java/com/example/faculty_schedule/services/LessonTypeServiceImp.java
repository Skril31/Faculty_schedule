package com.example.faculty_schedule.services;

import com.example.faculty_schedule.models.LessonType;
import com.example.faculty_schedule.repository.LessonTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LessonTypeServiceImp implements LessonTypeService{
    private final LessonTypeRepository lessonTypeRepository;
    LessonTypeServiceImp(LessonTypeRepository lessonTypeRepository){
        this.lessonTypeRepository = lessonTypeRepository;
    }
    @Override
    public void create(LessonType lessonType) {
        lessonTypeRepository.save(lessonType);
    }

    @Override
    public List<LessonType> readAll() {
        return lessonTypeRepository.findAll();
    }

    @Override
    public LessonType read(Integer id) {
        Optional<LessonType> lessonType = lessonTypeRepository.findById(id);
        if(lessonType.isPresent()){
            return lessonType.get();
        }
        return null;
    }

    @Override
    public boolean update(LessonType lessonType, Integer id) {
        if (lessonTypeRepository.existsById(id)){
            lessonType.setId(id);
            lessonTypeRepository.save(lessonType);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        if (lessonTypeRepository.existsById(id)){
            lessonTypeRepository.deleteById(id);
            return true;
        }
        return false;
    }
}

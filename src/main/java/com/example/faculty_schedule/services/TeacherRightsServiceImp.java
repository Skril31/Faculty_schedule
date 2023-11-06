package com.example.faculty_schedule.services;

import com.example.faculty_schedule.models.LessonType;
import com.example.faculty_schedule.models.TeacherRights;
import com.example.faculty_schedule.repository.TeacherRightsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherRightsServiceImp implements TeacherRightsService{
    private final TeacherRightsRepository teacherRightsRepository;
    TeacherRightsServiceImp(TeacherRightsRepository teacherRightsRepository){
        this.teacherRightsRepository = teacherRightsRepository;
    }
    @Override
    public void create(TeacherRights teacherRights) {
        teacherRightsRepository.save(teacherRights);
    }

    @Override
    public List<TeacherRights> readAll() {
        return teacherRightsRepository.findAll();
    }

    @Override
    public TeacherRights read(Integer id) {
        Optional<TeacherRights> teacherRights = teacherRightsRepository.findById(id);
        if(teacherRights.isPresent()){
            return teacherRights.get();
        }
        return null;
    }

    @Override
    public boolean update(TeacherRights teacherRights, Integer id) {
        if (teacherRightsRepository.existsById(id)){
            teacherRights.setId(id);
            teacherRightsRepository.save(teacherRights);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        if (teacherRightsRepository.existsById(id)){
            teacherRightsRepository.deleteById(id);
            return true;
        }
        return false;
    }
}

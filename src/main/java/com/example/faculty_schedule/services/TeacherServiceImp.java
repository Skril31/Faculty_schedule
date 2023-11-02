package com.example.faculty_schedule.services;

import com.example.faculty_schedule.models.Teacher;
import com.example.faculty_schedule.repository.TeacherRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherServiceImp implements TeacherService{
    private final TeacherRepository teacherRepository;
    TeacherServiceImp(TeacherRepository teacherRepository){
        this.teacherRepository = teacherRepository;
    }
    @Override
    public void create(Teacher teacher) {
        teacherRepository.save(teacher);
    }

    @Override
    public List<Teacher> readAll() {
        return teacherRepository.findAll();
    }

    @Override
    public Teacher read(int id) {
        Optional<Teacher> teachers = teacherRepository.findById(id);
        if(teachers.isPresent()){
            return teachers.get();
        }
        return null;
    }

    @Override
    public boolean update(Teacher teacher, int id) {
        if (teacherRepository.existsById(id)){
            teacher.setId_teacher(id);
            teacherRepository.save(teacher);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        if (teacherRepository.existsById(id)){
            teacherRepository.deleteById(id);
            return true;
        }
        return false;
    }
}

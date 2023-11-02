package com.example.faculty_schedule.services;

import com.example.faculty_schedule.models.Disciplines;
import com.example.faculty_schedule.repository.DisciplinesRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DisciplineServiceImp implements DisciplineService{
    private final DisciplinesRepository disciplinesRepository;
    DisciplineServiceImp(DisciplinesRepository disciplinesRepository){
        this.disciplinesRepository = disciplinesRepository;
    }
    @Override
    public void create(Disciplines disciplines) {
        disciplinesRepository.save(disciplines);
    }

    @Override
    public List<Disciplines> readAll() {
        return disciplinesRepository.findAll();
    }

    @Override
    public Disciplines read(Integer id) {
        Optional<Disciplines> disciplines = disciplinesRepository.findById(id);
        if(disciplines.isPresent()){
            return disciplines.get();
        }
        return null;
    }

    @Override
    public boolean update(Disciplines disciplines, Integer id) {
        if (disciplinesRepository.existsById(id)){
            disciplines.setId(id);
            disciplinesRepository.save(disciplines);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        if (disciplinesRepository.existsById(id)){
            disciplinesRepository.deleteById(id);
            return true;
        }
        return false;
    }
}

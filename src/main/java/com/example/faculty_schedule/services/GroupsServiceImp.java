package com.example.faculty_schedule.services;

import com.example.faculty_schedule.models.Groups;
import com.example.faculty_schedule.repository.GroupRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GroupsServiceImp implements GroupsService{
    private final GroupRepository groupRepository;
    GroupsServiceImp(GroupRepository groupRepository){
        this.groupRepository = groupRepository;
    }
    @Override
    public void create(Groups groups) {
        groupRepository.save(groups);
    }

    @Override
    public List<Groups> readAll() {
        return groupRepository.findAll();
    }

    @Override
    public Groups read(Integer id) {
        Optional<Groups> groups = groupRepository.findById(id);
        if(groups.isPresent()){
            return groups.get();
        }
        return null;
    }

    @Override
    public boolean update(Groups groups, Integer id) {
        if (groupRepository.existsById(id)){
            groups.setId(id);
            groupRepository.save(groups);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        if (groupRepository.existsById(id)){
            groupRepository.deleteById(id);
            return true;
        }
        return false;
    }
}

package com.example.faculty_schedule.controllers;

import com.example.faculty_schedule.models.Groups;
import com.example.faculty_schedule.services.GroupsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GroupsController {
    private final GroupsService groupsService;
    GroupsController(GroupsService groupsService){
        this.groupsService = groupsService;
    }
    @PostMapping(value = "/group")
    public ResponseEntity<?> create(@RequestBody Groups groups){
        groupsService.create(groups);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/group")
    public ResponseEntity<List<Groups>> readAll(){
        final List<Groups> groups = groupsService.readAll();

        return groups != null && !groups.isEmpty()
                ? new ResponseEntity<>(groups,HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/group/{id}")
    public ResponseEntity<Groups> read(@PathVariable(name = "id") int id){
        final Groups groups = groupsService.read(id);

        return groups != null
                ? new ResponseEntity<>(groups,HttpStatus.OK)
                :new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping(value = "/group/{id}")
    public ResponseEntity<?> update(@PathVariable(name = "id") int id,@RequestBody Groups groups){
        final boolean updated = groupsService.update(groups,id);

        return updated
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

    @DeleteMapping(value = "/group/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") int id){
        final boolean deleted = groupsService.delete(id);

        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }
}

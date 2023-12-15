package com.example.faculty_schedule.controllers;

import com.example.faculty_schedule.models.TeacherRights;
import com.example.faculty_schedule.services.TeacherRightsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeacherRightsController {
    private final TeacherRightsService teacherRightsService;

    TeacherRightsController(TeacherRightsService teacherRightsService){
        this.teacherRightsService = teacherRightsService;
    }
    @PostMapping(value = "/right")
    public ResponseEntity<?> create(@RequestBody TeacherRights teacherRights){
        teacherRightsService.create(teacherRights);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/right")
    public ResponseEntity<List<TeacherRights>> readAll(){
        final List<TeacherRights> teacherRights = teacherRightsService.readAll();

        return teacherRights != null && !teacherRights.isEmpty()
                ? new ResponseEntity<>(teacherRights,HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/right/{id}")
    public ResponseEntity<TeacherRights> read(@PathVariable(name = "id") int id){
        final TeacherRights teacherRights= teacherRightsService.read(id);

        return teacherRights != null
                ? new ResponseEntity<>(teacherRights,HttpStatus.OK)
                :new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping(value = "/right/{id}")
    public ResponseEntity<?> update(@PathVariable(name = "id") int id,@RequestBody TeacherRights teacherRights){
        final boolean updated = teacherRightsService.update(teacherRights,id);

        return updated
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

    @DeleteMapping(value = "/right/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") int id){
        final boolean deleted = teacherRightsService.delete(id);

        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }
}

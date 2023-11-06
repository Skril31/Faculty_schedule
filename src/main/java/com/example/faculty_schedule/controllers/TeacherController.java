package com.example.faculty_schedule.controllers;

import com.example.faculty_schedule.models.Teacher;
import com.example.faculty_schedule.services.TeacherService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeacherController {
    private final TeacherService teacherService;
    TeacherController(TeacherService teacherService){
        this.teacherService = teacherService;
    }

    @PostMapping(value = "/teacher")
    public ResponseEntity<?> create(@RequestBody Teacher teacher){
        teacherService.create(teacher);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/teacher")
    public ResponseEntity<List<Teacher>> readAll(){
        final List<Teacher> teachers = teacherService.readAll();

        return teachers != null && !teachers.isEmpty()
                ? new ResponseEntity<>(teachers,HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/teacher/{id}")
    public ResponseEntity<Teacher> read(@PathVariable(name = "id") int id){
        final Teacher teacher = teacherService.read(id);

        return teacher != null
                ? new ResponseEntity<>(teacher,HttpStatus.OK)
                :new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping(value = "/teacher/{id}")
    public ResponseEntity<?> update(@PathVariable(name = "id") int id,@RequestBody Teacher teacher){
        final boolean updated = teacherService.update(teacher,id);

        return updated
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

    @DeleteMapping(value = "/teacher/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") int id){
        final boolean deleted = teacherService.delete(id);

        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }
}

package com.example.faculty_schedule.controllers;

import com.example.faculty_schedule.models.Lessons;
import com.example.faculty_schedule.services.LessonsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LessonsController {
    private final LessonsService lessonsService;
    LessonsController(LessonsService lessonsService){
        this.lessonsService = lessonsService;
    }

    @PostMapping(value = "/lessons")
    public ResponseEntity<?> create(@RequestBody Lessons lessons){
        lessonsService.create(lessons);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/lessons")
    public ResponseEntity<List<Lessons>> readAll(){
        final List<Lessons> lessons = lessonsService.readAll();

        return lessons != null && !lessons.isEmpty()
                ? new ResponseEntity<>(lessons,HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}

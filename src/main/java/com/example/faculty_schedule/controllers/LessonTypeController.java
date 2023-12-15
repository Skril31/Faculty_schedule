package com.example.faculty_schedule.controllers;

import com.example.faculty_schedule.models.LessonType;
import com.example.faculty_schedule.services.LessonTypeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LessonTypeController {
    private final LessonTypeService lessonTypeService;
    LessonTypeController(LessonTypeService lessonTypeService){
        this.lessonTypeService = lessonTypeService;
    }
    @PostMapping(value = "/type")
    public ResponseEntity<?> create(@RequestBody LessonType lessonType){
        lessonTypeService.create(lessonType);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/type")
    public ResponseEntity<List<LessonType>> readAll(){
        final List<LessonType> lessonTypes = lessonTypeService.readAll();

        return lessonTypes != null && !lessonTypes.isEmpty()
                ? new ResponseEntity<>(lessonTypes,HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/type/{id}")
    public ResponseEntity<LessonType> read(@PathVariable(name = "id") int id){
        final LessonType lessonType = lessonTypeService.read(id);

        return lessonType != null
                ? new ResponseEntity<>(lessonType,HttpStatus.OK)
                :new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping(value = "/type/{id}")
    public ResponseEntity<?> update(@PathVariable(name = "id") int id,@RequestBody LessonType lessonType){
        final boolean updated = lessonTypeService.update(lessonType,id);

        return updated
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

    @DeleteMapping(value = "/type/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") int id){
        final boolean deleted = lessonTypeService.delete(id);

        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }
}

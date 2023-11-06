package com.example.faculty_schedule.controllers;

import com.example.faculty_schedule.models.Disciplines;
import com.example.faculty_schedule.services.DisciplineService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DisciplinesController {
    private final DisciplineService disciplineService;
    DisciplinesController(DisciplineService disciplineService){
        this.disciplineService = disciplineService;
    }
    @PostMapping(value = "/disciplines")
    public ResponseEntity<?> create(@RequestBody Disciplines disciplines){
        disciplineService.create(disciplines);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/disciplines")
    public ResponseEntity<List<Disciplines>> readAll(){
        final List<Disciplines> disciplinesses = disciplineService.readAll();

        return disciplinesses != null && !disciplinesses.isEmpty()
                ? new ResponseEntity<>(disciplinesses,HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/disciplines/{id}")
    public ResponseEntity<Disciplines> read(@PathVariable(name = "id") int id){
        final Disciplines disciplines = disciplineService.read(id);

        return disciplines != null
                ? new ResponseEntity<>(disciplines,HttpStatus.OK)
                :new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping(value = "/disciplines/{id}")
    public ResponseEntity<?> update(@PathVariable(name = "id") int id,@RequestBody Disciplines disciplines){
        final boolean updated = disciplineService.update(disciplines,id);

        return updated
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

    @DeleteMapping(value = "/disciplines/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") int id){
        final boolean deleted = disciplineService.delete(id);

        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }
}

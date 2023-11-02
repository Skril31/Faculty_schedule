package com.example.faculty_schedule.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "Lesson_type")
public class Lesson_type {
    @Id
    @Column(name = "type")
    private String type;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "type")
    private List<Teacher_rights> teacherRights;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "type")
    private List<Lessons> lessons;
}

package com.example.faculty_schedule.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "Lesson_type")
public class LessonType {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "type")
    private String type;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "type")
    private List<TeacherRights> teacherRights;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "type")
    private List<Lessons> lessons;
}

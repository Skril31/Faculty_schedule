package com.example.faculty_schedule.models;

import com.example.faculty_schedule.composite_keys.Teacher_rightsPK;
import jakarta.persistence.*;

@Entity
@Table(name = "Teacher_rights")
@IdClass(Teacher_rightsPK.class)
public class Teacher_rights {
    @Id
    @ManyToOne
    @JoinColumn(name = "teacher", referencedColumnName = "id")
    private Teacher teacher;
    @Id
    @ManyToOne
    @JoinColumn(name = "type", referencedColumnName = "type")
    private Lesson_type type;
    @Id
    @ManyToOne
    @JoinColumn(name = "discipline", referencedColumnName = "name")
    private Disciplines discipline;
}

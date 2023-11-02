package com.example.faculty_schedule.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "teacher_rights")
@Getter
@Setter
public class TeacherRights {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "id_teacher", referencedColumnName = "id")
    private Teacher teacher;
    @ManyToOne
    @JoinColumn(name = "id_type", referencedColumnName = "id")
    private LessonType type;
    @ManyToOne
    @JoinColumn(name = "id_discipline", referencedColumnName = "id")
    private Disciplines discipline;
}

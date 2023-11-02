package com.example.faculty_schedule.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Teacher_rights")
@Getter
@Setter
public class TeacherRights {
    @Id
    @Column(name = "id")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "teacher", referencedColumnName = "id")
    private Teacher teacher;
    @ManyToOne
    @JoinColumn(name = "type", referencedColumnName = "id")
    private LessonType type;
    @ManyToOne
    @JoinColumn(name = "discipline", referencedColumnName = "id")
    private Disciplines discipline;
}

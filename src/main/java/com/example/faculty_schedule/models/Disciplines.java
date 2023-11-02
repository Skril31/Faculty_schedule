package com.example.faculty_schedule.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "Disciplines")
public class Disciplines {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "discipline")
    private List<TeacherRights> teacherRights;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "disciplines")
    private List<Lessons> lessons;
}

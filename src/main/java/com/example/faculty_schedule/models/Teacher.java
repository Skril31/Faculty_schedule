package com.example.faculty_schedule.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "Teachers")
public class Teacher implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_teacher;
    @Column(name = "firstname")
    private String firstname;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "patronymic")
    private String patronymic;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "teacher")
    private List<TeacherRights> teacherRights;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "teacher")
    private List<Lessons> lessons;

}

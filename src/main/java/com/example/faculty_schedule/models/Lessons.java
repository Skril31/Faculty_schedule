package com.example.faculty_schedule.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
@Entity
@Table(name = "Lessons")
@Getter
@Setter
public class Lessons implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "week_day")
    private String week_day;
    @Column(name = "auditorium")
    private String auditorium;
    @Column(name = "start_time")
    private String start_time;
    @Column(name = "end_time")
    private String end_time;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_teacher")
    private Teacher teacher;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "group")
    private Groups groups;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "type")
    private LessonType type;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "name")
    private Disciplines disciplines;

}

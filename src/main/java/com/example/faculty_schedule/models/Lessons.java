package com.example.faculty_schedule.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Time;

@Getter
@Setter
@Entity
@Table(name = "lessons")
public class Lessons implements Serializable{
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "week_day")
    private String weekDay;
    @Column(name = "auditorium")
    private String auditorium;
    @Column(name = "start_time")
    private Time startTime;
    @Column(name = "end_time")
    private Time endTime;

    @Override
    public String toString() {
        return super.toString();
    }

    @ManyToOne
    @JoinColumn(name = "id_teacher")
    private Teacher teacher;
    @ManyToOne
    @JoinColumn(name = "id_group")
    private Groups groups;
    @ManyToOne
    @JoinColumn(name = "id_type")
    private LessonType type;
    @ManyToOne
    @JoinColumn(name = "id_discipline")
    private Disciplines disciplines;


}

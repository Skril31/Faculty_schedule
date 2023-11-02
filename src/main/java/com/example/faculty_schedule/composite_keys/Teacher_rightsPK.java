package com.example.faculty_schedule.composite_keys;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
@Getter
@Setter
@EqualsAndHashCode
public class Teacher_rightsPK implements Serializable {
    private Integer teacher;
    private String discipline;
    private String type;

    public Teacher_rightsPK(){}
    public Teacher_rightsPK(Integer teacher, String discipline, String type){
        this.teacher = teacher;
        this.discipline = discipline;
        this.type = type;
    }
}

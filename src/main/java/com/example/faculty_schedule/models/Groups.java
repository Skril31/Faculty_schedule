package com.example.faculty_schedule.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "Groups")
public class Groups {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "group")
    private String group;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "groups")
    private List<Lessons> lessons;
}

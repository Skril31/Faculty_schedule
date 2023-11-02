package com.example.faculty_schedule.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "groups")
public class Groups {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "group")
    private String group;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "groups")
    @JsonIgnore
    private List<Lessons> lessons;
}

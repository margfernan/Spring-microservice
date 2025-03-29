package com.training.schoolservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String schoolName;

    private String location;

    private String principalName;


}

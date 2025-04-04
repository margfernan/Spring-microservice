package com.training.studentservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class School {

    private int id;

    private String schoolName;

    private String location;

    private String principalName;
}

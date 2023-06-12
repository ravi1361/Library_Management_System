package com.example.librarymanagementsystem.DTO.RequestDtos;

import com.example.librarymanagementsystem.enums.Department;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class StudentRequestDtos {
    private String name;

    private int age;

    private Department department;

    private String mobNo;
}


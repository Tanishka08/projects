package com.example.Another.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Student 
{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer iD;
private String first_Name;
private String last_Name;
private String email;
}

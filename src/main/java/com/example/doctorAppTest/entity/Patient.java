package com.example.doctorAppTest.entity;

import jakarta.persistence.*;
import lombok.*;

//@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
//@Table(name = "patient")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    private Integer age;
//    private String city;
//    private String email;
//    private String disease;
//    private String notes;
}

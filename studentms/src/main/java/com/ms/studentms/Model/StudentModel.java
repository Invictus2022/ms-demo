package com.ms.studentms.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Entity
@Table(name = "studentdb")
public class StudentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Setter
    @Column(name = "first_name",nullable = false)
    private  String first_name;
    @Column(name = "last_name",nullable = false)
    private  String last_name;
    @Column(name = "email",nullable = false)
    private  String email;
    @Setter
    @Column(name = "school_id")
    private Long school_id;

}

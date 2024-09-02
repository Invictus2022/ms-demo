package com.ms.schoolms.Model;


import jakarta.persistence.Entity;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Builder
public class StudentModel {
    private String first_name;
    private  String last_name;
    private  String email;
}

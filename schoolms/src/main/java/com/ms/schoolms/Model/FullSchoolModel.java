package com.ms.schoolms.Model;


import jakarta.persistence.Entity;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Builder
public class FullSchoolModel {
    private String name;
    private  String email;
    private List<StudentModel> student;

}

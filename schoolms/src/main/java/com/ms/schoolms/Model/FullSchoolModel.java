package com.ms.schoolms.Model;


import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FullSchoolModel {
    private String name;
    private  String email;
    private List<StudentModel> student;

}

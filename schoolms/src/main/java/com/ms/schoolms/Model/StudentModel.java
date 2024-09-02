package com.ms.schoolms.Model;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentModel {
    private String first_name;
    private  String last_name;
    private  String email;
}

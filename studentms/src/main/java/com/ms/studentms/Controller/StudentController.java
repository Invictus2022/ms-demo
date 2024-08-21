package com.ms.studentms.Controller;


import com.ms.studentms.Model.StudentModel;
import com.ms.studentms.Service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/student")
public class StudentController {

    @Autowired
    private StudentServiceImpl service;

    @PostMapping("/add")
    public ResponseEntity<String> postStudent(StudentModel Model){
        return service.postStudent(Model);
    }

    @GetMapping
    public  ResponseEntity<List<StudentModel>> getStudents(){
        return service.getStudents();
    }

}

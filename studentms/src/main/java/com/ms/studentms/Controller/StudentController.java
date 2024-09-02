package com.ms.studentms.Controller;


import com.ms.studentms.Model.StudentModel;
import com.ms.studentms.Service.StudentServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/student")
public class StudentController {


    private final StudentServiceImpl service;

    public StudentController(StudentServiceImpl service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<String> postStudent(@RequestBody StudentModel studentModel){
        return service.postStudent(studentModel);
    }

    @GetMapping
    public  ResponseEntity<List<StudentModel>> getStudents(){
        return service.getStudents();
    }

    @GetMapping("/{school_id}")
    public  ResponseEntity<List<StudentModel>> getStudentsBySchool(@PathVariable("school_id") Long schoolId){
        return service.getStudentsBySchool(schoolId);
    }

}

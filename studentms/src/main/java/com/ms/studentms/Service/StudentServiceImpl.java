package com.ms.studentms.Service;

import com.ms.studentms.Model.StudentModel;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface StudentServiceImpl {
    ResponseEntity<String> postStudent(StudentModel Model);

    ResponseEntity<List<StudentModel>> getStudents();
}

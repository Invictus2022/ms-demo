package com.ms.schoolms.StudentClient;


import com.ms.schoolms.Model.StudentModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "student-service" , url = "${application.config.students-url}")
public interface StudentClient {

    @GetMapping("/{school_id}")
    ResponseEntity<List<StudentModel>> getStudentsBySchool(@PathVariable("school_id") Long schoolId);

}

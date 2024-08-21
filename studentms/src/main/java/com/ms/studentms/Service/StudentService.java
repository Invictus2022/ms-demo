package com.ms.studentms.Service;

import com.ms.studentms.Model.StudentModel;
import com.ms.studentms.Repository.StudentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService implements StudentServiceImpl {

    @Autowired
    private final StudentRepo repo;

    public StudentService(StudentRepo repo) {
        this.repo = repo;
    }


    public ResponseEntity<String> postStudent(@RequestBody StudentModel Model) {
        try {
            repo.save(Model);
            return new ResponseEntity<>("Student successfuly added", HttpStatus.OK);

        } catch (Exception e) {
            return  new ResponseEntity<>("Unable to add student",HttpStatus.BAD_REQUEST);
        }
    }


    public ResponseEntity<List<StudentModel>> getStudents(){
        return new ResponseEntity<>(repo.findAll(),HttpStatus.OK);
    }

}

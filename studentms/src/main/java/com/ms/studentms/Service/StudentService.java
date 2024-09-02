package com.ms.studentms.Service;

import com.ms.studentms.Model.StudentModel;
import com.ms.studentms.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements StudentServiceImpl {

    @Autowired
    private final StudentRepo repo;

    public StudentService(StudentRepo repo) {
        this.repo = repo;
    }

    @Override
    public ResponseEntity<String> postStudent(StudentModel studentModel) {
        try {
            repo.save(studentModel);
            return new ResponseEntity<>("Student successfuly added", HttpStatus.OK);

        } catch (Exception e) {
            return  new ResponseEntity<>("Unable to add student",HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<List<StudentModel>> getStudents(){
        return new ResponseEntity<>(repo.findAll(),HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<StudentModel>> getStudentsBySchool(Long schoolId){
            return  new ResponseEntity<>(repo.getStudentsBySchool(schoolId),HttpStatus.OK);
    }

}

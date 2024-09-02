package com.ms.schoolms.Service;


import com.ms.schoolms.Model.FullSchoolModel;
import com.ms.schoolms.Model.SchoolModel;
import com.ms.schoolms.Model.StudentModel;
import com.ms.schoolms.Repository.SchoolRepository;
import com.ms.schoolms.StudentClient.StudentClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SchoolService implements SchoolServiceImpl {
    @Autowired
    private final SchoolRepository repository;
    private  final StudentClient studentClient;
    private  final FullSchoolModel fullSchoolModel;

    public SchoolService(SchoolRepository repository, StudentClient studentClient,
                         FullSchoolModel fullSchoolModel){
        this.repository = repository;
        this.studentClient = studentClient;
        this.fullSchoolModel = fullSchoolModel;
    }

    @Override
    public ResponseEntity<List<SchoolModel>> getSchool(){
        try {
            return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ResponseEntity<String> postSchool(SchoolModel model){
        try {
            repository.save(model);
            return new ResponseEntity<>("Schoold successfully added",HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>("Invalid data", HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<String> deleteSchool(Long id){
        Optional<SchoolModel> model = repository.findById(id);
        if (model.isPresent()){
            repository.deleteById(id);
            return new  ResponseEntity<>("Succesfully deleted",HttpStatus.OK);
        }else {
            return new ResponseEntity<>("Invalid School id",HttpStatus.BAD_REQUEST);
        }
    }

    public ResponseEntity<FullSchoolModel> getSchoolWithStudents(Long schoolId){
        SchoolModel school;
        school = repository.findById(schoolId)
                .orElse(
                        SchoolModel.builder()
                                .name("NOT_FOUND")
                                .email("NOT_FOUND")
                                .build()
                );
        ResponseEntity<List<StudentModel>> studRes = studentClient.getStudentsBySchool(schoolId);
        List<StudentModel> students = studRes.getBody();

        FullSchoolModel fullSchoolModel = FullSchoolModel.builder()
                .name(school.getName())
                .email(school.getEmail())
                .student(students)
                .build();

        return new ResponseEntity<>(fullSchoolModel,HttpStatus.OK) ;
    }

}

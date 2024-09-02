package com.ms.studentms.Repository;


import com.ms.studentms.Model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepo extends JpaRepository<StudentModel,Long> {
    List<StudentModel> getStudentsBySchool(Long schoolId);
}

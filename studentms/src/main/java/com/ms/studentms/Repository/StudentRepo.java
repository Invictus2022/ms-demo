package com.ms.studentms.Repository;


import com.ms.studentms.Model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<StudentModel,Long> {
}

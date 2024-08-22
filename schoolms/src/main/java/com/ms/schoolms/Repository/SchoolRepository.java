package com.ms.schoolms.Repository;


import com.ms.schoolms.Model.SchoolModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SchoolRepository extends JpaRepository<SchoolModel, Long> {
}

package com.ms.schoolms.Service;


import com.ms.schoolms.Model.SchoolModel;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface SchoolServiceImpl {

    ResponseEntity<List<SchoolModel>> getSchool();

    ResponseEntity<String> postSchool(SchoolModel model);

    ResponseEntity<String> deleteSchool(Long id);
}

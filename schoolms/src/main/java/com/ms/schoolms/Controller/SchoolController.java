package com.ms.schoolms.Controller;


import com.ms.schoolms.Model.SchoolModel;
import com.ms.schoolms.Service.SchoolServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( value = "/school")
public class SchoolController {

    @Autowired
    private final SchoolServiceImpl service;

    public SchoolController(SchoolServiceImpl service){
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<SchoolModel>> getSchool(){
        return service.getSchool();
    }
    @PostMapping
    public  ResponseEntity<String> postSchool(@RequestBody SchoolModel model){
        return service.postSchool(model);
    }

    @DeleteMapping("/{id}")
    public  ResponseEntity<String> deleteSchool(@PathVariable("id") Long id){
        return service.deleteSchool(id);
    }

}

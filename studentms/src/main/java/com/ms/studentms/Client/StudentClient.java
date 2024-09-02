package com.ms.studentms.Client;


import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "student_service", url = "${application.config.students_url}")
public interface StudentClient {

}

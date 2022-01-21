package com.example.simplerest.controller;


import com.example.simplerest.dto.EnrollmentRequest;
import com.example.simplerest.service.EnrollmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class DummyController {

    @Autowired
    private EnrollmentServiceImpl enrollmentService;

    @GetMapping("/ships")
    public String getShips() {
        String jsonData = "{\n" +
                "   \"type\":\"FeatureCollection\",\n" +
                "   \"features\":[\n" +
                "      {\n" +
                "         \"type\":\"Feature\",\n" +
                "         \"geometry\":{\n" +
                "            \"type\":\"Point\",\n" +
                "            \"coordinates\":[\n" +
                "               44.662,\n" +
                "               37.3093\n" +
                "            ]\n" +
                "         },\n" +
                "         \"properties\":{\n" +
                "            \"description\":\"the ship shipname1 with 100 passengers    is heading to Port of New York\",\n" +
                "            \"type\":\"passenger\",\n" +
                "            \"Imo\":\"14537415\",\n" +
                "            \"receivedate\":\"2020-05-11 08:58:00.0\",\n" +
                "            \"velocity\":\"0.8\"\n" +
                "         }\n" +
                "      },\n" +
                "      {\n" +
                "         \"type\":\"Feature\",\n" +
                "         \"geometry\":{\n" +
                "            \"type\":\"Point\",\n" +
                "            \"coordinates\":[\n" +
                "               36.782,\n" +
                "               36.1973\n" +
                "            ]\n" +
                "         },\n" +
                "         \"properties\":{\n" +
                "            \"description\":\"the ship shipname2 with 5000GT   is heading to Port of Singapore\",\n" +
                "            \"type\":\"cargo\",\n" +
                "            \"Imo\":\"24589785\",\n" +
                "            \"receivedate\":\"2020-04-10 18:17:00.0\",\n" +
                "            \"velocity\":\"1.3\"\n" +
                "         }\n" +
                "      },\n" +
                "      {\n" +
                "         \"type\":\"Feature\",\n" +
                "         \"geometry\":{\n" +
                "            \"type\":\"Point\",\n" +
                "            \"coordinates\":[\n" +
                "               40.09,\n" +
                "               19.1273\n" +
                "            ]\n" +
                "         },\n" +
                "         \"properties\":{\n" +
                "            \"description\":\"the ship shipname1 with 100 passengers    is heading to Port of Long Beach\",\n" +
                "            \"type\":\"passenger\",\n" +
                "            \"Imo\":\"14537415\",\n" +
                "            \"receivedate\":\"2020-03-11 01:11:00.0\",\n" +
                "            \"velocity\":\"0.3\"\n" +
                "         }\n" +
                "      },\n" +
                "      {\n" +
                "         \"type\":\"Feature\",\n" +
                "         \"geometry\":{\n" +
                "            \"type\":\"Point\",\n" +
                "            \"coordinates\":[\n" +
                "               45.4413,\n" +
                "               28.1127\n" +
                "            ]\n" +
                "         },\n" +
                "         \"properties\":{\n" +
                "            \"description\":\"the ship shipname2 with 4000GT   is heading to Port of South Louisiana\",\n" +
                "            \"type\":\"cargo\",\n" +
                "            \"Imo\":\"24589785\",\n" +
                "            \"receivedate\":\"2020-01-11 16:28:00.0\",\n" +
                "            \"velocity\":\"0.7\"\n" +
                "         }\n" +
                "      },\n" +
                "      {\n" +
                "         \"type\":\"Feature\",\n" +
                "         \"geometry\":{\n" +
                "            \"type\":\"Point\",\n" +
                "            \"coordinates\":[\n" +
                "               36.6567,\n" +
                "               21.8253\n" +
                "            ]\n" +
                "         },\n" +
                "         \"properties\":{\n" +
                "            \"description\":\"the ship shipname1 with 600 passengers    is heading to Port of Hamburg\",\n" +
                "            \"type\":\"passenger\",\n" +
                "            \"Imo\":\"14537415\",\n" +
                "            \"receivedate\":\"2020-02-22 10:13:00.0\",\n" +
                "            \"velocity\":\"0.9\"\n" +
                "         }\n" +
                "      }\n" +
                "   ]\n" +
                "}";
        return jsonData;
    }

    @GetMapping("/encyrpt")
    public String showEncyrpt() {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        CharSequence sequence = "123";
        String encoded = passwordEncoder.encode(sequence);

        return "Encoded string:" + encoded;
    }

    @GetMapping("/enroll_test")
    public String sampleEnroll() {
        EnrollmentRequest enrollmentRequest=new EnrollmentRequest();
        enrollmentRequest.setStudentid(2);
        enrollmentRequest.setLectureid("2");
        enrollmentRequest.setRoomname("A-101");
        enrollmentService.enrollClass(enrollmentRequest);
        return "success";
    }


}

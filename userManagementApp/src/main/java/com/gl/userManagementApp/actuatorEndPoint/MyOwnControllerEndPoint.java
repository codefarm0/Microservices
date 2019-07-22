package com.gl.userManagementApp.actuatorEndPoint;

import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@RestControllerEndpoint(id = "controllerEndPoint")
public class MyOwnControllerEndPoint {

    @GetMapping("/message-from-solar")
    public ResponseEntity readEndPoint(){
        return  new ResponseEntity<>("This is Eagle!! Reporting from Jupiter", HttpStatus.OK);
    }
}
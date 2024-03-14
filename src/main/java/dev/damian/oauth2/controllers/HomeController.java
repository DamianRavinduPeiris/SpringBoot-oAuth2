package dev.damian.oauth2.controllers;

import dev.damian.oauth2.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/home")
public class HomeController {
    @Autowired
    private Response response;

    @GetMapping(path = "/public", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Response> publicRoute() {
        response.setStatusCode(HttpStatus.OK.value());
        response.setMessage("Public Route!");
        response.setData(null);
        return ResponseEntity.ok(response);


    }

    @GetMapping(path = "/secured", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Response> securedRoute() {

        response.setStatusCode(HttpStatus.OK.value());
        response.setMessage("Secured Route!");
        response.setData(null);
        return ResponseEntity.ok(response);
    }
}

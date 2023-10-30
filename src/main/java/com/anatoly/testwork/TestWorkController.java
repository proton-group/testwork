package com.anatoly.testwork;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestWorkController
{
    private static final String template = "Hello %s! %s";
    @GetMapping("/")
    public ResponseEntity getMethod(@RequestParam String name, @RequestParam String message) {
        return new ResponseEntity<String>(String.format(template, name, message), HttpStatus.OK);
    }
}
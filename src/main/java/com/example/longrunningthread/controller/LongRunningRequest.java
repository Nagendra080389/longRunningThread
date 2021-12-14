package com.example.longrunningthread.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LongRunningRequest {
    @GetMapping("/api/longRunningApiRequest")
    public String cancelDeployment(@RequestParam Integer delayInSeconds) throws Exception {
        Thread.sleep(delayInSeconds * 1000);
        return "Data Returned";
    }
}
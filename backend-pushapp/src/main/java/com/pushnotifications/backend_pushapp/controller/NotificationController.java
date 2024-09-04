package com.pushnotifications.backend_pushapp.controller;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pushnotifications.backend_pushapp.entity.NotificationRequest;
import com.pushnotifications.backend_pushapp.entity.NotificationResponse;
import com.pushnotifications.backend_pushapp.service.FCMService;

@RestController
public class NotificationController {

    @Autowired
    private FCMService fcmService;

    @PostMapping("/notification")
    public ResponseEntity sendNotification(@RequestBody NotificationRequest request)
            throws InterruptedException, ExecutionException {
        fcmService.sendMessageToToken(request);
        return new ResponseEntity<>(new NotificationResponse(HttpStatus.OK.value(), "Notification has been sent"),
                HttpStatus.OK);
    }
}

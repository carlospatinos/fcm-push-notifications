package com.pushnotifications.backend_pushapp.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NotificationRequest {
    private String title;
    private String body;
    private String token;
}

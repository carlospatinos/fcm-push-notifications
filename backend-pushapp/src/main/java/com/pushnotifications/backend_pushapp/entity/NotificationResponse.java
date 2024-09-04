package com.pushnotifications.backend_pushapp.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NotificationResponse {
    private int status;
    private String message;
}

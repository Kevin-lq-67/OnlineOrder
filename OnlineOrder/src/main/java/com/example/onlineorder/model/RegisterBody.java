package com.example.onlineorder.model;

public record RegisterBody(
        String email,
        String password,
        String firstName,
        String lastName
) {
}


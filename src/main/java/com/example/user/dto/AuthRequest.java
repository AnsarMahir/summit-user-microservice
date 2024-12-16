package com.example.user.dto;

public class AuthRequest {
    private String username;
    private String password;

    // Default constructor (important for JSON deserialization)
    public AuthRequest() {
    }

    // Getters and setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}


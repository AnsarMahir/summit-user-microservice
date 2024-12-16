package com.example.user.model;
import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.context.annotation.Primary;

@Getter
@Entity
@Table(name = "\"user\"")
public class User {
    @Getter
    @Id
    private String subId;
    private Boolean userConfirmed;
    private String refreshToken;

    public User() {

    }

    public void setSubId(String subId) {
        this.subId = subId;
    }

    public boolean isUserConfirmed() {
        return userConfirmed;
    }

    public void setUserConfirmed(boolean userConfirmed) {
        this.userConfirmed = userConfirmed;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public User(String subId, boolean userConfirmed, String refreshToken) {
        this.subId = subId;
        this.userConfirmed = userConfirmed;
        this.refreshToken = refreshToken;
    }

    public User(String subId, boolean userConfirmed) {
        this.subId = subId;
        this.userConfirmed = userConfirmed;
    }


}

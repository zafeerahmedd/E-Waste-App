package com.example.e_waste;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class user1 {
    private String name;
    private String email;
    private String details;

    public user1 (String name,String email,String details){
        this.name=name;
        this.email=email;
        this.details=details;

    }

    protected String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getDetails() {
        return details;
    }
}

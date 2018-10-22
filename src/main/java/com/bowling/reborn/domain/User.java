package com.bowling.reborn.domain;

public class User {
    private String userName;
    private Frames frames;

    public User(String userName, Frames frames) {
        this.userName = userName;
        this.frames = frames;
    }

    public String getUserName() {
        return this.userName;
    }
}

package com.bowling.reborn.domain;

import java.util.ArrayList;
import java.util.List;

public class Users {
    private List<User> userlist;

    public Users() {
        this.userlist = new ArrayList<>();
    }

    public Users addPlayer(User user) {
        this.userlist.add(user);
        return this;
    }

    public int totalUserSize() {
        return this.userlist.size();
    }

    public User getUser(int userNum) {
        return this.userlist.get(userNum);
    }
}

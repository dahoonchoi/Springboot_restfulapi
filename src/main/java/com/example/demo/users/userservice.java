package com.example.demo.users;

import java.util.ArrayList;

public interface userservice{
    void insertuser(usersvo vo);
    ArrayList<usersvo> getUser();
}
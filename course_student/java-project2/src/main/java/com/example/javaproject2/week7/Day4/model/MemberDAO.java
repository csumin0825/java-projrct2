package com.example.javaproject2.week7.Day4.model;

import com.example.javaproject2.week7.Day3.model.BaseDAO;

import java.util.Optional;

public class MemberDAO extends BaseDAO {

    public void initMember() {
    }

    public Optional<Member> login(String id, String pw) {
        return Optional.empty();
    }

    public void join(String id, String pw) {
    }

    public Optional<Member> logout(String id) {
        return null;
    }
}

package com.example.javaproject2.week7.Day3;

import com.example.javaproject2.week7.Day3.model.BaseDAO;
import com.example.javaproject2.week7.Day3.model.Person;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBMain extends BaseDAO {
    public static void main(String[] args) {
        DBMain dbMain = new DBMain();
        dbMain.initPerson();
        dbMain.insertPerson("leo");
        dbMain.insertPerson("yui");
        List<Person> personList = dbMain.findAllPerson();
        System.out.println(personList.toString());
    }

    private List<Person> findAllPerson() {
        List<Person> result = new ArrayList<>();
        String sql = "select id, name from person";
        try {
            getConn();
            psmt = conn.prepareStatement(sql);
            rs = psmt.executeQuery();
            while (rs.next()) {
                int id =rs.getInt("id");
                String name=rs.getString("name");
                result.add(new Person(id,name));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close();
        }
        return result;
    }

    public void getCodeName() {
        String sql = "SELECT id, name from person";
        try {
            getConn();
            psmt = conn.prepareStatement(sql);
            rs = psmt.executeQuery();
            while (rs.next()) {
                int id =rs.getInt("code");
                String name=rs.getString("name");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close();
        }

    }

    private int insertPerson(String name){
        int cnt = 0;
        String sql = "insert into person(name) vlaue(?)";
        try{
            getConn();
            psmt = conn.prepareStatement(sql);
            psmt.setString(1, name);
            psmt.executeUpdate();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }finally {
            close();
        }
        return cnt;
    }

    private void initPerson() {
        String sql= """
                    create table person(
                    id integer primary key autoincrement,
                    name string
                    """;
        try {
            getConn();
            smt = conn.createStatement();

            smt.executeUpdate("drop table if exists person");
            smt.executeUpdate(sql);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            close();
        }
    }

}

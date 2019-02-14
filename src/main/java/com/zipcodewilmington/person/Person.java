package com.zipcodewilmington.person;

import java.util.Date;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;

    private String gender;
    private Date birthDay;
    private String maritalStatus;



    public Person() {

        this.name = "";
        this.age = Integer.MAX_VALUE;


    }

    public Person(int age) {

        this.age =age;
    }

    public Person(String name) {

        this.name = name;
    }

    public Person(String name, int age) {

        this.age = age;
        this.name =name;
    }

    public Person(String name, int age, String maritalStatus, String gender, Date birthDay) {

        this.age = age;
        this.name =name;
        this.birthDay = birthDay;
        this.gender =gender;
        this.maritalStatus = maritalStatus;
    }

    public void setName(String name) {

        this.name = name;

    }

    public void setAge(int age) {

        this.age = age;


    }

    public String getName() {


        return name;
    }

    public Integer getAge() {


        return age;
    }

    public void setMaritalStatus(String maritalStatus) {


        this.maritalStatus = maritalStatus;
    }


    public String getMaritalStatus() {


        return maritalStatus;
    }

    public void setGender(String gender) {


        this.gender = gender;
    }



    public String getGender() {


        return gender;
    }

    public void setBirthDay(Date birthDay) {


        this.birthDay = birthDay;
    }



    public Date getBirthDay() {


        return birthDay;
    }
}

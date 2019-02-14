package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAllFive() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Adrish";
        String expectedMaritalStatus = "Not Married";
        String expectedGender = "Male";
        Date expectedBirthDay = new Date(2);

        // When
        Person person = new Person(expectedName, expectedAge, expectedMaritalStatus, expectedGender, expectedBirthDay);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();
        String actualMaritalStatus = person.getMaritalStatus();
        String actualGender = person.getGender();
        Date actualBirthDay = person.getBirthDay();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedGender, actualGender);
        Assert.assertEquals(expectedMaritalStatus, actualMaritalStatus);
    }

    @Test
    public void testSetMaritalStatus() {
        // Given
        Person person = new Person();
        String expected = "Married";

        // When
        person.setMaritalStatus(expected);
        String actual = person.getMaritalStatus();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetGender() {
        // Given
        Person person = new Person();
        String expected = "Female";

        // When
        person.setGender(expected);
        String actual = person.getGender();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetBirthDate() {
        // Given
        Person person = new Person();
        Date expected = new Date(9);

        // When
        person.setBirthDay(expected);
        Date actual = person.getBirthDay();

        // Then
        Assert.assertEquals(expected, actual);
    }


}

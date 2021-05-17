package edu.cyber.oop.domain;

import java.time.LocalDate;

public class Person
{
    private final String firstName;
    private final String lastName;
    private final LocalDate dateOfBirth;
    private final char gender;

    public Person(String firstName, String lastName, LocalDate dateOfBirth, char gender) {
        if (firstName == null || firstName.trim().isEmpty()) {
            throw new RuntimeException("Empty firstName is not correct");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender=" + gender +
                '}';
    }
}
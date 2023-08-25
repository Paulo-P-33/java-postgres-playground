package com.example;

import java.time.LocalDate;

public class Voter {
    private LocalDate birthDate;

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int age () {
        return LocalDate.now().getYear() - birthDate.getYear();
    }

    public String voter() {
        int age = age();
        if (age < 16) {
            return "Is not voter";
        }
        if (age > 15 && age < 18 || age > 70) {
            return "Is optional voter";
        }
        return "Required voter";
    }
}

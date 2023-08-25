package com.example;

import java.time.LocalDate;

public class AppVoter {
    public static void main(String[] args) {
        Voter voter = new Voter();
        voter.setBirthDate(LocalDate.of(1910, 9, 28));
        System.out.println();
        System.out.println(voter.voter());
        System.out.println();

    }
}

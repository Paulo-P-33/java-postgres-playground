package com.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AppLists {
    public static void main(String[] args) {
        List<Voter> listVoter = new ArrayList<>();
        Voter requiredVoter = new Voter();
        requiredVoter.setBirthDate(LocalDate.of(1996, 9, 28));

        Voter optionalVoter = new Voter();
        optionalVoter.setBirthDate(LocalDate.of(1900, 9, 28));

        Voter notVoter = new Voter();
        notVoter.setBirthDate(LocalDate.of(2020, 9, 28));

        listVoter.add(requiredVoter);
        listVoter.add(optionalVoter);
        listVoter.add(notVoter);
        
        for (Voter voter : listVoter) {
            System.out.println();
            System.out.println(voter.voter());
            System.out.println();
        }

    }   
}

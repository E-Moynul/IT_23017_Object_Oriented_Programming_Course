///it23017


package com.mycompany.codes.cpp;

import java.util.* ;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTime {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter mm_dd_yyyy = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String ch = now.format(mm_dd_yyyy);
        System.out.println("Date (MM/dd/yyyy): " + ch);

    }
}

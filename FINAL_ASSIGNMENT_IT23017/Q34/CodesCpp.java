///it23017
//".equals()" checks contents inside
//"==" checks memory addresses are same or not
//same strings are stored in same memory address
//unless they are declared as new

package com.mycompany.codes.cpp;

import java.util.* ;

public class CodesCpp {

    public static void main(String[] args) {
        
        String s1 = "This is ICT 2107 Java";
        String s2 = new String("This is ICT 2107 Java");
        String s3 = "This is ICT 2107 Java";

        System.out.println(s1.equals(s2));   // 1 (same contents)
        System.out.println(s1==s2);   // 0 (different address)
        System.out.println(s1==s3); // 1 (same address)
    }
}

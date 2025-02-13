///it23017
//BigInteger is a class in java which provides us the following utilities :
//it deals with large numbers
//it can represent integer of any size till memory exceeds
//various mathmetical operations can be performed on large numbers using it





package com.mycompany.codes.cpp;

import java.util.* ;
import java.math.* ;

public class CodesCpp {

    public static void main (String [] args)
    {
        BigInteger n ;
        
        n = BigInteger.valueOf(1) ;
        
        int nn,i ;
        Scanner sc=new Scanner(System.in) ;
        System.out.println("Enter a number") ;
        nn=sc.nextInt() ;
        
        for(i=1;i<=nn;i++)
        {
            n=n.multiply(BigInteger.valueOf(i)) ;
        }
        
        System.out.println(n);
    }
}

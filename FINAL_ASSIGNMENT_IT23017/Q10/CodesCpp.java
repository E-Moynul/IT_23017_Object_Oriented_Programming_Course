///it23017


package com.mycompany.codes.cpp;

import java.util.* ;

public class CodesCpp {

    public static void main (String [] args)
    {
        Scanner sc =new Scanner(System.in);
        
        String ch=sc.nextLine() ;
        
        int i,j,flag=0 ;
        for(i=0,j=ch.length();i<j;i++,j--)
        {
            if(ch.charAt(i)!=ch.charAt(j))
            {
                flag++ ;
                break ;
            }
        }
        if(flag==0)
        {
            System.out.println("Palindrome");
        }
        else System.out.println("Not Palindrome");
    }
}

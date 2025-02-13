///it23017
package com.mycompany.codes.cpp;

import java.util.* ;

public class CodesCpp {
    
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in) ;
        
        String ch ;
        
        System.out.println("Enter string");
        
        ch=sc.nextLine() ;
        
        for(int i=0;i<ch.length();i++)
        {
            char c=ch.charAt(i) ;
            if((c>='a'&&c<='z')||(c>='A'&&c<='Z'))
            {
                System.out.println("char");
            }
            else if(c==' ')
            {
                System.out.println("space");
            }
            else if(c>='0'&&c<='9')
            {
                System.out.println("digit");
            }
            else
            {
                System.out.println("sp_character");
            }
        }
    }
}

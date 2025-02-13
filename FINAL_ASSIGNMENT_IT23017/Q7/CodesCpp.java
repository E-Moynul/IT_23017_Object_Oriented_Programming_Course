///it23017
package com.mycompany.codes.cpp;

import java.util.* ;

public class CodesCpp {
    
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in) ;
        
        int a,b,c ;
        System.out.println("Give a,b,c");
        a=sc.nextInt() ;
        b=sc.nextInt() ;
        c=sc.nextInt() ;
        
        double discriminant = b*b-4*a*c;
        
        if (discriminant >= 0)
        {
            double root1 = (-b+Math.sqrt(discriminant))/(2*a);
            double root2 = (-b-Math.sqrt(discriminant))/(2*a);
            
            System.out.println(Math.min(root1, root2)) ;
        }
        else System.out.println("No roots");
    }
}

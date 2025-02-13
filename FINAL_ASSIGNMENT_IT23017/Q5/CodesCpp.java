///it23017
package com.mycompany.codes.cpp;

import java.util.* ;

public class CodesCpp {
    
    public static int calc(int[] ar)
    {
        int ans=0 ;
        for(int i=0;i<ar.length;i++)
        {
            ans+=ar[i] ;
        }
        return ans ;
    }
    
    public static void main (String [] args)
    {
        int ar[] = new int[5] ;
        ar[0]=5 ;
        ar[1]=55 ;
        ar[2]=555 ;
        ar[3]=5555 ;
        ar[4]=55555 ;
        
        System.out.println(calc(ar)) ;
    }
}

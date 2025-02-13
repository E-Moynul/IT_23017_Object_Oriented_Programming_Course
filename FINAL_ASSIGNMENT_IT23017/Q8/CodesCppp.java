///it23017


package com.mycompany.codes.cppp;

import java.util.* ;

public class CodesCppp {
    
    public static void add(int ar[])
    {
        int ans=0 ;
        for(int i=0;i<ar.length;i++)
        {
            ans+=ar[i] ;
        }
    }
    
    public static void main (String [] args)
    {
        int ar[] = new int[5] ;
        
        add(ar) ;/// array passing requires only the array name
    }
}

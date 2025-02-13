///it23017


package com.mycompany.codes.cpp;

import java.util.* ;

public class CodesCpp {
    
    static int findExtreme(String ch,int ... vector)
    {
        int ans=0,i,min_e=9999999,max_e=-9999999 ;
        
        for(i=0;i<vector.length;i++)
        {
            min_e=Math.min(vector[i], min_e) ;
            max_e=Math.max(vector[i], max_e) ;
        }
        
        if(ch=="smallest")
        {
            ans=min_e ;
        }
        else
        {
            ans=max_e ;
        }
        
        return ans ;
    }

    public static void main(String[] args) {
        
        System.out.println(findExtreme("smallest",5,55,555)) ;
        
        System.out.println(findExtreme("highest",5,55)) ;
    }
}

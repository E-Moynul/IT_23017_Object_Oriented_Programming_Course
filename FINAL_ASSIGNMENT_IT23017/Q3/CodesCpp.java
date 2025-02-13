///it23017
package com.mycompany.codes.cpp;

import java.util.* ;

public class CodesCpp {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter lower bound :") ;
        int n1=sc.nextInt() ;
        System.out.println("Enter upper bound :") ;
        int n2=sc.nextInt() ;
        
        for(int i=n1;i<=n2;i++)
        {
            int sum=0,nn=i ;
            while(nn>0)
            {
                int n=nn%10 ;
                int fact=1 ;
                for(int j=1;j<=n;j++)
                {
                    fact*=j ;
                }
                nn/=10 ;
                sum+=fact ;
            }
            if(sum==i)
            {
                System.out.println(i);
            }
        }
    }
}

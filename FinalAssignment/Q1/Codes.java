//it23017
package com.mycompany.codes.cpp;

import java.util.* ;
import java.io.* ;

class Codes
{
    public static void main(String [] args)
    {
        File fileob = new File("C:/Users/rr/Desktop/name/input.txt") ;
        int high=-9999999,ans=0 ;
        try
        {
            Scanner sc = new Scanner(fileob) ;
            sc.useDelimiter(",") ;
            while(sc.hasNext())
            {
                int n=sc.nextInt() ;
                if(high<n)high=n ;
            }
        }
        catch(Exception e)
        {
            System.out.println(e) ;
        }
        for(int i=1;i<=high;i++)ans+=i ;
        File fileobb = new File("C:/Users/rr/Desktop/name/output.txt") ;
        try
        {
            fileobb.createNewFile() ;
            PrintWriter writeob = new PrintWriter(fileobb) ;
            writeob.println("Highest Number :"+high) ;
            writeob.println("Summation :"+ans) ;
            writeob.close() ;
        }
        catch(Exception e)
        {
            System.out.println(e) ;
        }
    }
}

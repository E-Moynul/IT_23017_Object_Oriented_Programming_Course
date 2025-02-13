///it23017

///THIS PROGRAM MAKES SURE ONLY ONE INSTANCE CAN EXIST AT A TIME

package com.mycompany.codes.cpp;


public class singletonexample {
    
    public static singletonexample instance = new singletonexample() ;
    
    private singletonexample()///blocks creating objects of this class outside this class
    {
        
    }
    
    ///we can still create object of this class inside this class (line 1)
    
    public static singletonexample getter()  ///use getter to get the created object
    {
        return instance ;
    }
    
    void display()
    {
        System.out.println(5);
    }
    
}

-------------------------------------------------------------------

package com.mycompany.codes.cpp;

import java.util.* ;

public class CodesCpp {

    public static void main(String[] args) {
        
        singletonexample ob = singletonexample.getter() ;
        
        ob.display();
    }
}

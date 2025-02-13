it23017
-----------------------------------------------------------------------------
package com.mycompany.codes.cpp;


public class CodesCpp {
    public static void main (String [] args)
    {
        NewClass ob = new NewClass() ;
        
        System.out.println(ob.x) ;
        ob.display() ;
    }
}
-----------------------------------------------------------------------------

package com.mycompany.codes.cpp;


public class NewClass {
    
    static int x=5 ;
    
    static void display()
    {
        System.out.println(5) ;
    }
}
-----------------------------------------------------------------------------
output : 5 5

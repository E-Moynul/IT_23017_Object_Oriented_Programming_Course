///it23017


package com.mycompany.codes.cpp;

import java.util.* ;

public class CodesCpp {

    public static void main(String[] args) {
        for (int i = 0; i < 60; i++) {
            instance ob = new instance(1) ;
        }
    }
}
------------------------------------------------------
  
package com.mycompany.codes.cpp;


public class instance {
    
    public static int instanceCount=0 ;
    
    instance(int instanceCount)
    {
        this.instanceCount+=instanceCount ;
        
        if(this.instanceCount>50)
        {
            this.instanceCount=0 ;
        }
    }
    
}

///it23017

---------------------------------------------
interface X {
    default void show() {
        System.out.println("X's show");
    }
}
 
interface Y {
    default void show() {
        System.out.println("Y's show");
    }
}
 
public class Z implements X, Y {
}
---------------------------------------------
it is a faulty code which contains the error : DIAMOND PROBLEM

it occurs because of this : both X,Y contains same method show() ,
the compiler is unable to decide which to select

it can be resolved using this :
---------------------------------------------
OVERRIDE :

//override and do not use
public class Z implements X,Y{
    
    public void display()
    {
        System.out.println("Z");
    }
}

//override and use using [X.super] and [Y.super]
public class Z implements X,Y{
    
    public void display()
    {
        X.super.display() ;
        Y.super.display() ;
        System.out.println("Z") ;
    }
}

///IT_23017

import java.util.* ;

class Main
{
    static int fact(int n)
    {
        int i,ans=1 ;
        for(i=1;i<=n;i++)
        {
            ans*=i ;
        }
        return ans ;
    }
    
    static class factorian
    {
        int start,last,coutn=0 ;
        void facto()
        {
            int i ;
            for(i=start;i<=last;i++)
            {
                int ans=0,n=i ;
                while(n>0)
                {
                    ans+=fact(n%10) ;
                    n/=10 ;
                }
                if(ans==i)
                {
                    System.out.println(i+" is an answer") ;
                    coutn++ ;
                }
            }
        }
    }
    
    
    public static void main (String [] args)
    {
        int n1,n2,i,coutn=0 ;
        System.out.println("Enter your range :") ;
        Scanner sc = new Scanner (System.in) ;
        factorian object = new factorian() ;
        object.start=sc.nextInt() ;
        object.last=sc.nextInt() ;
        object.facto() ;
        System.out.println("COUNT : "+object.coutn) ;
    }
}

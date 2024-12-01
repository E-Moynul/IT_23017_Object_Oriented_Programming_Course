///IT23017
import java.util.* ;

class Main
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in) ;
        Scanner scc = new Scanner(System.in) ;
        int course ;
        System.out.println("Enter the number of courses ") ;
        course = sc.nextInt() ;
        Double total = 0.0 ;
        for(int i=1;i<=course;i++)
        {
            System.out.println("Enter marks for course :"+i) ;
            Double cur ;
            cur = scc.nextDouble() ;
            total+=cur ;
        }
        Double average = total / course ;
        String grade ;
        if(average>=90)
        {
            grade="A+" ;
        }
        else if(average>=80)
        {
            grade="A" ;
        }
        else if(average>=70)
        {
            grade="B" ;
        }
        else if(average>=60)
        {
            grade="C" ;
        }
        else if(average>=50)
        {
            grade="D" ;
        }
        else grade="F" ;
        Double cgpa ;
        if(grade=="A+")
        {
            cgpa=4.00 ;
        }
        else if(grade=="A")
        {
            cgpa=3.75 ;
        }
        else if(grade=="B")
        {
            cgpa=3.5 ;
        }
        else if(grade=="C")
        {
            cgpa=3.0 ;
        }
        else if(grade=="D")
        {
            cgpa=2.5 ;
        }
        else cgpa=0.00 ;
        System.out.println("Total : "+total) ;
        System.out.println("Average : "+average) ;
        System.out.println("Grade : "+grade) ;
        System.out.println("CGPA : "+cgpa) ;
    }
}

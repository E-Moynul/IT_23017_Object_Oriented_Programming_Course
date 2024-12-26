///IT23017
import java.util.* ;

class Main
{
    public static void main (String [] args)
    {
        Random random = new Random();
        
        int randomInt = random.nextInt(100);
        System.out.println("Random Integer: " + randomInt);
        
        float randomFloat = random.nextFloat();
        randomFloat+=randomInt ;
        System.out.println("Random Float: " + randomFloat);
        
        double randomDouble = random.nextDouble();
        randomDouble+=randomInt ;
        System.out.println("Random Double: " + randomDouble);
        
    }
}

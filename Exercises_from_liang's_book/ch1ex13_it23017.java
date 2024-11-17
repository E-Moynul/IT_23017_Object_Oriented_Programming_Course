public class ch1ex13_it23017 {
    public static void main(String[] args) {
        double a = 3.4;
        double b = 50.2;
        double c = 2.1;
        double d = 0.55;
        double e = 44.5;
        double f = 5.9;
        double n1 = (e * d - b * f) / (a * d - b * c);
        double n2 = (a * f - e * c) / (a * d - b * c);
        System.out.printf("The value for x is: %.2f", n1);
        System.out.println();
        System.out.printf("The value of y is: %.2f", n2);
    }
}

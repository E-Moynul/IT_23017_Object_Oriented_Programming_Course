public class ch1ex11_it23017 {
    public static void main(String[] args) {
        double b = 7.0;
        double d = 13.0;
        double immi = 45.0;
        double bp = another(b);
        double dp = another(d);
        double immip = another(immi);
        double cur = 312_032_486;
        for (int i = 1; i <= 5; i++) {
            cur += bp - dp + immip ;
            System.out.print("The population in year " + i + " will be ");
            System.out.printf("%1.0f", cur);
            System.out.println();
        }

    }
    public static double another(double n) {
        double s = 60 * 60 * 24 * 365 ;
        double ans = secondsInyear / n ;
        return ans ;
    }
}

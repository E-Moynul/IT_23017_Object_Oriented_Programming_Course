
public class ch1ex12_it23017 {
    public static void main(String[] args) {
        double h = 1;
        double m = 40;
        double s = 35;
        double t = 24;
        double k = t * 1.6;
        double conv = h * 60 + m + s / 60;
        double ans = 60 * k / conv ;
        System.out.println(ans);
    }
}

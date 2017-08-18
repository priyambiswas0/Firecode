import java.util.*;
class Pow {
    private static double pow(double x, int n) {
        double e = 1;
        if(n > 0)
            for(int i = 1; i <= n; i++)
                e *= x;
        else
            for(int i = -1; i >= n; i--)
                 e /= x;
        return e;
    }

    private static double pow2(double x, int n) {
        if(n == 0) return 1;
        if(n == 1) return x;
        return n < 0 ? 1/(x * pow2(x, -n-1)) : x * pow2(x, n-1);
    }

    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        int n = Integer.parseInt(args[1]);
        System.out.println(pow(x, n));
        System.out.println(pow2(x, n));
    }
}

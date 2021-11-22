package J01004_So_nguyen_to;

public class So_nguyen_to {
    public static boolean Check (int n) {
        if (n==2) return true;
        if (n<2 || n%2==0) return false;
        for (int i=3; i*i<=n; i+=2) {
            if (n%i==0) return false;
        }
        return true;
    }
}

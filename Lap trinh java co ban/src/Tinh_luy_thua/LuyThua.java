package Tinh_luy_thua;
/**
 *
 * @author hoangduongngg
 */
public class LuyThua {
    private double a, b;
    public LuyThua() {
    }
    public LuyThua(double a, double b) {
        this.a = a;
        this.b = b;
    }
    private double luythua(double a, double b) {
        double mod = Math.pow(10, 9) + 7;
        if (b==0) {
            return 1;
        }
        if (b%2==0) {
            return (luythua((a*a)% mod, b/2)) % mod;
        }
        else {
            return (a*luythua((a*a) %mod, b/2)) %mod;
        }
    }

    @Override
    public String toString() {
        return "" + luythua(a, b);
    }
}

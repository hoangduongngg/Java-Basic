package so_nguyen_to_lon_nhat;

import java.io.*;
import java.util.*;

public class So_nguyen_to_lon_nhat {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("DATA.in"));
        ArrayList <Integer> a = new ArrayList<>();
        while (in.hasNext()) {
            int num = in.nextInt();
            if (Check_NT(num)) a.add(num);
        }
        xuly(a);
    }
    
    public static void xuly(ArrayList <Integer> a) {
        Collections.sort(a, Collections.reverseOrder());
        int n = 0;
        for (int i=0; i<a.size(); i++) {
            int dem = 1;
            while (true) {
                if (i == a.size()-1 ) break;
                if (a.get(i) != a.get(i+1)) {
                    break;
                }
                dem++;
                i++;
            }
            
            System.out.println(a.get(i) + " " +  dem);
            n++;
            if (n==10) break;
        }
    }
    
    public static boolean Check_NT (Integer n) {
        if (n==2) return true;
        if (n%2==0 || n<2) return false;
        for (int i=3; i*i<=n; i++) {
            if (n%i==0) return false;
        }
        return true;
    }
}
package J01016_Chu_so_4_va_chu_so_7;

import java.util.Scanner;

/**
 *
 * @author hoangduongngg
 */
public class J01016 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if (Check(in.next()) == true) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
        
    }
    
    public static boolean Check (String n) {
        int count = 0;
        for (int i=0; i<n.length(); i++) {
            if (n.charAt(i)=='4' || n.charAt(i)=='7') {
                count ++;
                if (count>7){
                    return false;
                }
            }
        }
        if (count==4 || count==7) {
            return true;
        }
        return false;
        
    }
}

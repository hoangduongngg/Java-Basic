/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J02014_Diem_can_bang;

/**
 *
 * @author hoangduongngg
 */
public class Diem_can_bang {
    public static int Index (int a[], int n) {
            int sum =0;
            for (int i=1; i<=n; i++) sum+=a[i];
            int temp=a[1];
            for (int i=2; i<=n; i++) {
                if ((temp*2)==sum-a[i]) return i;
                else {
                    temp+=a[i];
                } 
            }
            return -1;    
    }
}

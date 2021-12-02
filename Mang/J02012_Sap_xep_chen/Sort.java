/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J02012_Sap_xep_chen;

/**
 *
 * @author hoangduongngg
 */
import java.util.*;
public class Sort {
    public static void Chen(int n, int a[]) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<n; i++) {
            System.out.print("Buoc " + i + ": ");
            list.add(a[i]);
            Collections.sort(list);
            list.forEach (x -> System.out.print(x+ " "));
            System.out.println();
        }
    }
}

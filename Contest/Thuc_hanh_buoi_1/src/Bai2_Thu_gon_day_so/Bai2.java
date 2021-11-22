/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2_Thu_gon_day_so;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hoangduongngg
 */
public class Bai2 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        int n = in.nextInt();
        for (int i=0; i<n; i++) {
            a.add(in.nextInt());
        }
        int flag=0;
        while (flag==0) {
            for (int i=0; i<a.size()-1; i++) {
                if ((a.get(i)+a.get(i+1))%2==0) {
                    a.remove(i);
                    a.remove(i);
                    flag=1;
                   // break;
                }
            }
            if (flag==1) flag=0;
            else flag=-1; //cho dung vong lap
            
        }
            
        System.out.println(a.size());
    }
}

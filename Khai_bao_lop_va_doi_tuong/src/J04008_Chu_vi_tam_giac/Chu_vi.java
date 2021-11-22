/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04008_Chu_vi_tam_giac;

/**
 *
 * @author hoangduongngg
 */
public class Chu_vi {
    private double a,b,c;
    
    public Chu_vi() {
    }
    public Chu_vi(Point p1, Point p2, Point p3) {
        this.a = p1.distance(p2);
        this.b = p2.distance(p3);
        this.c = p3.distance(p1);
    }

    @Override
    public String toString() {
        if (a+b>c && a+c>b && b+c>a) {
            return String.format("%.3f", a+b+c); 
        }
        return "INVALID";
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04010_Dien_tich_hinh_tron_ngoai_tiep;
/**
 *
 * @author hoangduongngg
 */
public class Dien_tich_hinh_tron_ngoai_tiep {
    private double a,b,c;
    public Dien_tich_hinh_tron_ngoai_tiep() {
    }
    public Dien_tich_hinh_tron_ngoai_tiep(Point p1, Point p2, Point p3) {
        this.a = p1.distance(p2);
        this.b = p2.distance(p3);
        this.c = p3.distance(p1);
    }
    
    private double dientich (double a, double b, double c) {
        return Math.sqrt( (a+b+c)*(a+b-c)*(-a+b+c)*(a-b+c) )/4;
    }
    private double S_tron_ngoai_tiep (double a, double b, double c) {
        double R = (a*b*c)/(dientich(a, b, c)*4);
        return Math.PI* Math.pow(R, 2);
    }    
    
    @Override
    public String toString() {
        if (a+b>c && a+c>b && b+c>a) {
            return String.format("%.3f", S_tron_ngoai_tiep(a, b, c) ); 
        }
        return "INVALID";
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04011_Bon_diem_tren_mat_phang;

/**
 *
 * @author hoangduongngg
 */
public class Poin_3{
    private double x,y,z;

    public Poin_3(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public Vector_3 vector (Poin_3 p1, Poin_3 p2 ) {
        Vector_3 res = new Vector_3 (p1.getX() - p2.getX(), p1.getY() - p2.getY(), p1.getZ() - p2.getZ());
        return res;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getZ() {
        return z;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setZ(double z) {
        this.z = z;
    }
    
    @Override
    public String toString() {
        return x + " " + y + " " + z;
    }
}

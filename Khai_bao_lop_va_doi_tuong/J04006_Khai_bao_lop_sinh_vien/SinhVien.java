/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J04006_Khai_bao_lop_sinh_vien;

/**
 *
 * @author hoangduongngg
 */
public class SinhVien {
    private String  ID, name, classID, DOB;
    private float gpa;

    public SinhVien(String name, String classID, String DOB, float gpa) {
        this.ID = "B20DCCN001";
        this.name = name;
        this.classID = classID;
        this.DOB = chuan_hoa_ngay(DOB);
        this.gpa = gpa;
    }
    
    private String chuan_hoa_ngay (String DOB) {
        String day[] = DOB.split("/");
        if (day[0].length()<2) day[0] = "0"+day[0];
        if (day[1].length()<2) day[1] = "0"+day[1];

        return day[0] + "/" + day[1] + "/" + day[2];
    }

    @Override
    public String toString() {
        return  ID + " " + name + " " + classID + " " + DOB + String.format(" %.2f", gpa);
    }

}

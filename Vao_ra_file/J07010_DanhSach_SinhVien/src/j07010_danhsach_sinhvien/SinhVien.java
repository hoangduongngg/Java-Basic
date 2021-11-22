package j07010_danhsach_sinhvien;
public class SinhVien {
    private String idString, name, classString, dobString;
    private Double gpa;

    public SinhVien(Integer stt, String name, String classString, String dobString, String gpa) {
        this.idString = xuly_stt(stt);
        this.name = name;
        this.classString = classString;
        this.dobString = xuly_dob(dobString);
        this.gpa = Double.parseDouble(gpa);
    }
    
    private String toString(Integer stt) {
        return "" + stt ;
    }
    private String xuly_stt (Integer stt) {
        String s = toString(stt);
        if (s.length() == 1) {
            s = "00" + s;
        }
        else if (s.length()==2) {
            s = "0" + s;
        }
        return "B20DCCN" + s;
    }

    private String xuly_dob (String dobString) {
        String list[] = dobString.split("/");
        if (list[0].length() == 1) list[0] = "0" + list[0];
        if (list[1].length() == 1) list[1] = "0" + list[1];
        return list[0] + "/" + list[1] + "/" + list[2];

        
    }
    
    @Override
    public String toString() {
        return idString + " " + name + " " + classString + " " + dobString + " " + String.format("%.2f", gpa);
    }
}
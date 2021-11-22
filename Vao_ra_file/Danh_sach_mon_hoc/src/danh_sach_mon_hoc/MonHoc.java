package danh_sach_mon_hoc;

public class MonHoc {
    private String IDString, Name;
    private Integer TinChi;

    public MonHoc(String IDString, String Name, String TinChi) {
        this.IDString = IDString;
        this.Name = Name;
        this.TinChi = Integer.parseInt(TinChi);
    }

    public String getIDString() {
        return IDString;
    }
    public String getName() {
        return Name;
    }
    public Integer getTinChi() {
        return TinChi;
    }

    @Override
    public String toString() {
        return IDString + " " + Name + " " + TinChi;
    }
}
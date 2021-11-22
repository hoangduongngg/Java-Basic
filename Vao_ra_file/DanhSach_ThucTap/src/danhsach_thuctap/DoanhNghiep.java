package danhsach_thuctap;

/**
 *
 * @author hoangduongngg
 */
public class DoanhNghiep {
    private String Ma, Ten;
    private Integer SoSV;

    public DoanhNghiep(String Ma, String Ten, String SoSV) {
        this.Ma = Ma;
        this.Ten = Ten;
        this.SoSV = Integer.parseInt(SoSV);
    }

    public String getMa() {
        return Ma;
    }

    public String getTen() {
        return Ten;
    }

    public Integer getSoSV() {
        return SoSV;
    }

    @Override
    public String toString() {
        return Ma + " " + Ten + " " + SoSV;
    } 
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_MAU_CRUD_OOP;

/**
 *
 * @author dungna29
 */
public class NguoiYeuMoi extends Nguoi{
    private String soThich;
    private double v1;
    private double v2;
    private double v3;

    public NguoiYeuMoi() {
    }

    public NguoiYeuMoi(String soThich, double v1, double v2, double v3, String ten, int ns, int gioiTinh, double canNang, String sdt) {
        super(ten, ns, gioiTinh, canNang, sdt);
        this.soThich = soThich;
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public String getSoThich() {
        return soThich;
    }

    public void setSoThich(String soThich) {
        this.soThich = soThich;
    }

    public double getV1() {
        return v1;
    }

    public void setV1(double v1) {
        this.v1 = v1;
    }

    public double getV2() {
        return v2;
    }

    public void setV2(double v2) {
        this.v2 = v2;
    }

    public double getV3() {
        return v3;
    }

    public void setV3(double v3) {
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return super.toString() + " ," + "soThich=" + soThich + ", v1=" + v1 + ", v2=" + v2 + ", v3=" + v3 + '}' + "[ "+checkCanNang(getCanNang())+" ]";
    }

    @Override
    public String checkCanNang(double canNang) {
        return canNang <= 50?"Quá gầy":canNang <= 80?"Quá bình thường":"Quá đáng yêu";
    }
    
    
    
}

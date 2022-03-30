/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_MAU_CRUD_OOP;

/**
 *
 * @author dungna29
 */
public class Nguoi {
    private String ten;
    private int ns;
    private int gioiTinh;
    private double canNang;
    private String sdt;

    public Nguoi() {
    }

    public Nguoi(String ten, int ns, int gioiTinh, double canNang, String sdt) {
        this.ten = ten;
        this.ns = ns;
        this.gioiTinh = gioiTinh;
        this.canNang = canNang;
        this.sdt = sdt;
    }

   

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNs() {
        return ns;
    }

    public void setNs(int ns) {
        this.ns = ns;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public double getCanNang() {
        return canNang;
    }

    public void setCanNang(double canNang) {
        this.canNang = canNang;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        return "{" + "ten=" + ten + ", ns=" + ns + ", gioiTinh=" + gioiTinh + ", canNang=" + canNang+", sdt=" + sdt;
    }
    
    public String checkCanNang(double canNang){
        return null;
    }
    
    
}

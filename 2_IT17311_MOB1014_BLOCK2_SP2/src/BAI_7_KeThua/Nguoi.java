/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_7_KeThua;

/**
 *
 * @author dungna29
 */

//Lớp cha cũng giố như các lớp khác.
public class Nguoi {
    //Bao gồm các thuộc tính chung thì đưa lên lớp cha.
    private String ten;
    private String tenDem;
    private String ho;
    private String sdt;
    private String cmt;

    public Nguoi() {
    }

    public Nguoi(String ten, String tenDem, String ho, String sdt, String cmt) {
        this.ten = ten;
        this.tenDem = tenDem;
        this.ho = ho;
        this.sdt = sdt;
        this.cmt = cmt;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTenDem() {
        return tenDem;
    }

    public void setTenDem(String tenDem) {
        this.tenDem = tenDem;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getCmt() {
        return cmt;
    }

    public void setCmt(String cmt) {
        this.cmt = cmt;
    }
    
    public void method1(String c){
        
    }
    public void method2(int a, int b){
        
    }
    private void method3(){
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_7_KeThua;

/*
- Lớp con
- Sử dụng từ khóa extends để kế thừa.
- Java || C# chỉ đơn kế thừa.
 */
public class SinhVien extends Nguoi{
    //Lớp con chỉ còn các thuộc tính đặc trưng riêng để miêu tả cho đối tượng
    private String msv;
    private String nganhHoc;

    public SinhVien() {
    }

    public SinhVien(String msv, String nganhHoc, String ten, String tenDem, String ho, String sdt, String cmt) {
        super(ten, tenDem, ho, sdt, cmt);
        this.msv = msv;
        this.nganhHoc = nganhHoc;
        
        //this: Dùng để tham chiếu đến các thuộc tính và phương thức của lớp hiện tại
        //super: Dùng để tham chiếu đến các thuộc tính và phương thức của lớp cha
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getNganhHoc() {
        return nganhHoc;
    }

    public void setNganhHoc(String nganhHoc) {
        this.nganhHoc = nganhHoc;
    }
    
    //Ghi đè phương thức của lớp cha
    //Alt +insert -> Override method chọn phương thức cần ghi đè

    @Override
    public void method2(int a, int b) {
        //Khi ghi đè phương thức ở lớp con được quyền code lại nội dung bên trong.
    }

    @Override
    public void method1(String c) {
        super.method1(c); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

   
    
    
}

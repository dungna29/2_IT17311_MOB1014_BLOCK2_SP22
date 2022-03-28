/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_6_Method_PhuongThuc;

import java.util.List;

/**
 *
 * @author dungna29
 */
public class S1_Method_Void {

    /*
         *  Bài Phương thức - Method
         *  Định nghĩa: 1 tập các câu lệnh cùng nhau thực hiện 1 tác vụ nào đó.
         *  LỢI ÍCH: - Giúp quản lý code tốt hơn
         *           - Tái sử dụng
         *
         *  Công thức chung:
         *  <Phạm vi truy cập> <Kiểu trả về> <Tên phương thức> (<Danh sách tham số>)
         *  {
         *          Body code
         *  }
    
         * <Phạm vi truy cập> - Access Modifier:Public,Private,Protected, Default
         *
         * <Kiểu trả về> : có 2 kiểu trả về và không trả về
         *          - Kiểu không trả về: void
         *          - Kiểu trả về: là giá trị(int,string,double....) hoặc tập giá trị(Array,List.....) hoặc đối tượng(class) và còn nhiều kiểu khác.
         *
         * <Tên phương thức>: Tên động từ viết thường + tên hàm viết hóa chữ cái đầu của từ
         * <Danh sách tham số>: Phương thức có thể có tham hoặc không tham số và lưu ý khi sử dụng tham số thì khi gọi phương thức thì phải truyền đúng vị trí của tham số.
     */
    public static void main(String[] args) {
        //Phần 1: Để gọi phương thức trong java phải biết Tên Phương Thức, Phương Thức đang nằm trong class nào.
        S1_Method_Void s1 = new S1_Method_Void();
        //s1.tinhTong; Sai vì kết thúc phải là ();
        s1.tinhTong();

        //Kinh nghiệm: Khi nào thì cần tách phương thức? Khi gặp phải 1 đoạn code được lặp đi lặp lại nhiều lần thì nên tách ra để tái sử dụng.
        //Phần 2: Phương thức có tham số:
        /*
            1. Phải truyền đủ tham số và đúng kiểu dữu liệu
            2. Đối với nạp chồng phương thức thì số lượng tham số hoặc kiểu dữ liệu tham số sẽ quyết định gọi vào phương thức nào.
         */
        //s1.tinhTong(0); Thiếu tham số lỗi
        s1.tinhTong(5, 7);
        s1.tinhTong(5, 7, 7);
        s1.tinhTong(5, 7, 8);
        s1.tinhTong(5, 7, "a");
    }

    //Phần 1: Method không trả về không tham số
    public void tinhTong() {//() = Không tham số
        int a = 5, b = 6;
        System.out.printf("%d + %d = %d", a, b, a + b);
    }

    //Phần 2: Method không trả về có tham số
    //Dưới đây là 1 phương thức nạp chồng overloading được phép giống tên phương thức nhưng khác tham số
    public void tinhTong(int a, int b) {
        System.out.printf("%d + %d = %d", a, b, a + b);
    }

    public void tinhTong(int a, int b, int c) {
        System.out.printf("%d + %d + %d = %d", a, b, c, a + b + c);
    }

    public void tinhTong(int a, int b, String c) {
        System.out.println("Phươg thức đang chờ code");
    }

    //Ngoài ra thì tham số có thể là rất nhiều kiểu dữ liệu khác nhau
    public void method1(int[] arr, List lst, List<Double> temp) {

    }
}

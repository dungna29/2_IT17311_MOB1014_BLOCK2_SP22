/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI1_LAMQUENVOIJAVA;

import java.util.Scanner;

/**
 *
 * @author dungna29
 */
public class BaiTap {
    /*
    Chương trình cho phép nhập họ và tên sinh viên, năm sinh, mã sinh viên từ bàn phím và xuất ra định dạng sau:
      “Chào bạn <<họ và tên>> | <<năm sinh>>  | <<mã sinh viên>> đến với chương trình lập trình đầu tiên.”
      Yêu cầu nhập đúng theo thứ tự đầu bài đưa ra.
    Năm sinh là số nguyên
    Msv là String.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ten,msv;
        int ns;
        
        System.out.println("Mời bạn nhập tên: ");
        ten = sc.nextLine();
        System.out.println("Mời bạn nhập ns: ");
        //ns = sc.nextInt();
        //Trôi lệnh chỉ xảy ra khi nhập 1 số và phía sau nó là nhập 1 chuỗi
        //Cách 1: Chống trôi
        //sc.nextLine();
        
        //Cách 2: Không cần quan tâm đến next Số chúng ta sẽ coi tất cả dữ liệu người dùng nhập là String.
        ns = Integer.parseInt(sc.nextLine());
        System.out.println("Mời bạn nhập msv: ");
        msv = sc.nextLine();
        
        System.out.printf("Chào bạn %s | %d | %s",ten,ns,msv);
    }
}

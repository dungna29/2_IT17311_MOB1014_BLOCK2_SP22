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
public class B4_NhapXuatDuLieuTuBanPhim {
    /*
       Bài 4: Nhập xuất dữ liệu từ bàn phím
    1. Xuất dữ liệu ra màn hình: In giá trị mặc định hoặc giá của biến ra màn hình
        + Công thức: sout + tab
        + System.out.println(<giá trị hoặc tập giá trị>);
        + System.out.print(<giá trị hoặc tập giá trị>);
        + System.out.printf("Chào các %s bạn đến với năm học %d",value,value);
    2. Nhập dữ liệu ra màn hình:
        + Sử dụng 1 Class: Scanner sc = new Scanner(System.in);
        + Để đọc dữ liệu thì cần định nghĩa rõ muốn lưu dữ liệu nào khi người dùng nhập.
        + Để lấy giá trị từ bàn phím: sc.next<Kiểu dữ liệu muốn>();
   */
    public static void main(String[] args) {
        //1. Xuất dữ liệu ra màn hình
        System.out.print("Tôi muốn học giỏi JAVA 1");
        System.out.println(" tại ngành PTPM");
        System.out.print(" SP2022 \t cùng thầy Dungna29 \n");
        
        String name = "Hoa";
        System.out.printf("Tôi tên: %s Sinh năm: %d \n",name,2003);//Không tự xuống dòng
        System.out.println("Tôi tên: " + name+ " Sinh năm: " + 2003);
        
        //2. Nhập dữ liệu từ bàn phím.
        //Viết 1 chương trình nhập tên và in ra 
        
        //Bước 1: Khai báo thư viện
        Scanner sc = new Scanner(System.in);
        
        //Bước 2: Xác định số lượng biến cần phải sử dụng.
        String name1;//
        
        //Bước 3: Hướng dẫn người sử dụng và gán giá trị
        System.out.print("Mời bạn nhập tên: ");
        name1 = sc.nextLine();//sc.nextLine() có kiểu dữ liệu là String. và hành động ở đây là đổ giá trị từ người dùng vào cho biến.
       
        //Bước 4: Thực thi
        System.out.printf("Chào bạn: %s \n",name1);
        
        
    }
}

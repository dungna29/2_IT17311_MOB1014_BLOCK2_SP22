/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_MAU_CRUD_OOP;

import java.util.Scanner;

/**
 *
 * @author dungna29
 */
public class Main {
    public static void main(String[] args) {
        NguoiYeuMoiService nycService = new NguoiYeuMoiService();
        Scanner sc = new Scanner(System.in);
        String input;
        do {            
            
            System.out.println("Chương trình quản lý NY Mới");
            System.out.println("1. Thêm mới NY");
            System.out.println("2. Sửa NY");
            System.out.println("3. Xoá NY");
            System.out.println("4. Tìm kiếm NY");
            System.out.println("5. Xuất ds NY");
            System.out.println("6. Thoát");
            System.out.print("Mời bạn chọn chức năng: ");
            input = sc.nextLine();
            switch (input) {
                case "1":
                    nycService.them();
                    break;
                case "2":
                     nycService.suaNY();
                    break;
                case "3":
                     nycService.xoa();
                    break;
                case "4":
                     nycService.timKiem();
                    break;
                case "5":
                     nycService.timKiem();
                    break;
                case "6":
                    System.out.println("Hẹn gặp lại");
                    break;
                default:
                    System.out.print("Mời bạn chọn lại chức năng. ");
            }
        } while (!input.equals(6));
    }
}

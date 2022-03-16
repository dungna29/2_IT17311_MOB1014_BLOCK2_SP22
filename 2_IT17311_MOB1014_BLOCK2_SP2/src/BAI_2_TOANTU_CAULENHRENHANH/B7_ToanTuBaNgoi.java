/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_2_TOANTU_CAULENHRENHANH;

import java.util.Scanner;

/**
 *
 * @author dungna29
 */
public class B7_ToanTuBaNgoi {

    /*
       Cách sử dụng:
        <Biểu thức> ? <Giá trị true> : <Giá trị false>;
        <Biểu thức>: Có thể có 1 hoặc nhiều biểu thức
        <Giá trị true>: Luôn nằm sau dấu ? và phụ thuộc vào kiểu dữ liệu của biến.
        <Giá trị false>: Luôn nằm sau dấu :    
     */
    public static void main(String[] args) {
        String temp1 = 8 > 9 ? "Đúng" : "Sai";
        int temp2 = 8 > 9 ? 1 : 0;
        boolean temp3 = 8 > 9 ? true : false;
        double temp4 = 8 > 9 ? 8.9 : 8.8;
        /*
            * Bài tập: Viết 1 chương trình khi nhập thông tin 1 người xác định được là ANH, CHỊ, EM, BẠN.
            * Cố định lại Tuổi và Giới Tính của bản thân
         */
        int namSinhBanThan = 2002, gioiTinh = 1;//Cố định 1 = Nam | 0 = Nữ
        //Yêu cầu nhập vào TÊN - NĂM SINH - GIỚI TÍNH có thể xác định được tên gọi như ở trên.
        //+1 điểm vào ASS1 ASS2 cho 4 bạn code nhanh và đúng nhất sử dụng toán tử 3 ngôi.
        Scanner sc = new Scanner(System.in);
        while (true) {            
            String tenBan;
            int nsBan, gtBan;
            System.out.print("Mời bạn nhập tên: ");
            tenBan = sc.nextLine();
            System.out.print("Mời bạn nhập ns: ");
            nsBan = Integer.parseInt(sc.nextLine());
            System.out.print("Mời bạn nhập giới tính: ");
            gtBan = Integer.parseInt(sc.nextLine());
            
            String temp=(namSinhBanThan > nsBan && gtBan == 1)?"Anh":
                    (namSinhBanThan > nsBan && gtBan == 0)?"Chị":
                    (namSinhBanThan < nsBan && gtBan == 1)?"Em Trai":
                    (namSinhBanThan < nsBan && gtBan == 0)?"Em Gái":"Bạn";
            System.out.printf("Chào %s %s \n",temp,tenBan);
        }

    }
}

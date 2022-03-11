/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI1_LAMQUENVOIJAVA;

/**
 *
 * @author dungna29
 */
public class B3_EpKieu {

    /*
        1. Ép kiểu từ String về Số
        2. Ép kiểu giữa các các số với nhau
     */
    public static void main(String[] args) {
        //1. Ép kiểu String về số
        String a = "1", b = "2", c;
        c = a + b;//=12 Cộng chuỗi
        System.out.println("a + c = " + c);//=12
        //int d = a + b;//Lỗi vì 1 biến kiểu số nguyên không thể = Chuỗi

        //Integer.parseInt(a) = Hành động ép kiểu từ chuỗi về số
        int d = Integer.parseInt(a) + Integer.parseInt(b);
        System.out.println("a + b = " + d);//=

        //Bắt buộc phải học thuộc hết các kiểu dữ liệu
        //Ngoài ra còn rất nhiều cách ép kiểu dữ liệu khác nhau từ String về số
        //Integer.parseInt(<String>)
        //Double.parseDouble(<String>)
        //Float.parseFloat(<String>)
        //Byte.parseByte(<String>)
        //..........
        
        //2. Ép kiểu giữa các số
        int n1 = 5;
        double n2 = 5.6;
        n2 = n1;//Ép kiểu tự động
        // n1 = n2; Không thể đổ giá trị của kiểu dữ liệu lớn về nhỏ
        n1 = (int) n2;//Mất đi phần thập phân của double

    }
}

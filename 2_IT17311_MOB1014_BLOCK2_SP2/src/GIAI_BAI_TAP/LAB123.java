/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GIAI_BAI_TAP;

import java.util.Scanner;

/**
 *
 * @author dungna29
 */
public class LAB123 {

    static Scanner _sc = new Scanner(System.in);

    public static void main(String[] args) {
        bai1();
    }

    static void bai0() {
        int k1, k2;
        System.out.println("Mời nhập khoảng 1: ");
        k1 = Integer.parseInt(_sc.nextLine());//8
        System.out.println("Mời nhập khoảng 2: ");
        k2 = Integer.parseInt(_sc.nextLine());//6
        //Cách 1: Sử dụng hoán vị
        if (k1 > k2) {
            int temp = k1;
            k1 = k2;
            k2 = temp;
        }
        //Min, Max
        for (int i = Math.min(k1, k2); i < Math.max(k1, k2); i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d", i, j, i * j);
            }

        }
    }

    static void bai1() {
        int arrNumber[];//Khai báo
        System.out.println("Mời nhập số lượng: ");
        arrNumber = new int[Integer.parseInt(_sc.nextLine())];//Khởi tạo mảng với 1 số lượng phần tử do người dùng nhập vào.
        for (int i = 0; i < arrNumber.length; i++) {
            System.out.printf("Mời bạn nhập phần tử: arr[%d]: ", i);
            arrNumber[i] = Integer.parseInt(_sc.nextLine());
        }

        for (int i = 0; i < arrNumber.length; i++) {
            System.out.print(((arrNumber[i] % 2 == 0) ? arrNumber[i] : "") + " ");
        }
        System.out.println("");
        for (int x : arrNumber) {
            System.out.print(((x % 2 != 0) ? x : "") + " ");
        }
    }
}

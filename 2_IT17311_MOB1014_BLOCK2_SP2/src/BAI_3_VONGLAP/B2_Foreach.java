/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_3_VONGLAP;

/**
 *
 * @author dungna29
 */
public class B2_Foreach {

    /*
    Cách gõ: fore + tab
    
    Công thức:  
    for (String arg : args) {
            
        }
    String arg: Kiểu dữ liệu và tên biến, tên biến sẽ đại diện là 1 giá trị
    args: Là Collection hoặc là 1 Array
     */
    public static void main(String[] args) {
        int[] arrNumbers = {1, 2, 3, 4};
        //Cách 1: For
        for (int i = 0; i < arrNumbers.length; i++) {
            System.out.print(arrNumbers[i] + " ");
        }
        System.out.println("");
        //Cách 2: foreach = fore + tab
        for (var x : arrNumbers) {
            System.out.print(x + " ");
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_8_XuLyChuoi;

/**
 *
 * @author dungna29
 */
public class S3_SoSanhChuoi {
    public static void main(String[] args) {
        String[] arrNames = {"abc","ABC","adea","eadc"};
        
        for (String x : arrNames) {
            if (x.equalsIgnoreCase("abc")) {
                System.out.print(x + " ");
            }
        }
        System.out.println("");
        for (String x : arrNames) {
            if (x.startsWith("a")) {
                System.out.print(x + " ");
            }
        }
         System.out.println("");
        for (String x : arrNames) {
            if (x.toLowerCase().contains("a".toLowerCase())) {
                System.out.print(x + " ");
            }
        }
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_8_XuLyChuoi;

import java.text.Normalizer;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author dungna29
 */
public class S2_MotVaiViDu {
    //Bài 1: Viết 1 chương trình nhập vào Full Name sao đó viết hoa chữ cái đầu của từ lên.  nguyen thi hoa = Nguyen Thi Hoa
    //Bài 2: Viết 1 chương trình zen mã tự động như sinh viên tại FPOLY.  nguyễn thị hoa = HoaNTPHXXX
    //Giải quyết 2 bài trên dựa vào lý thuyết xử lý chuỗi thầy đã up.
    //10h Chữa hoặc gọi bạn nào lên chữa
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {            
            String input;
            System.out.print("Mời bạn nhập tên: ");
            input = sc.nextLine();
            System.out.printf("Tên bạn vừa nhập %s \n",vietHoaFullName(input));
            System.out.printf("Msv %s \n",zenMSVFpoly(input,"001235"));
        } while (true);
        
    }
    public static String zenMSVFpoly(String text,String ms){//nguyen thi hoa
        String temp = text.trim().toLowerCase();//nguyen thi hoa
       String[] arrNames = temp.split("\\s+");//Tách chuỗi thành mảng
       String msv = vietHoaChuCaiDau(arrNames[arrNames.length-1]);//Hoa
        for (int i = 0; i < arrNames.length-1; i++) {
            msv +=String.valueOf(arrNames[i].charAt(0)).toUpperCase();
        }
        return unAccent(msv) + "PH" + ms;
    }
    public static String vietHoaFullName(String text){// nguyEn thi hoa
       String temp = text.trim().toLowerCase();//nguyen thi hoa
       String[] arrNames = temp.split("\\s+");//Tách chuỗi thành mảng
       String FullName = "";
        for (String x : arrNames) {
            FullName += vietHoaChuCaiDau(x)+" ";
        }
        return FullName;
    }
    
    public static String vietHoaChuCaiDau(String text){// dUNG
        String temp = text.trim().toLowerCase();//dung
        return String.valueOf(temp.charAt(0)).toUpperCase()+temp.substring(1);
    }
     public static String unAccent(String s) {//Convert từ tiếng việt có dấu về tiếng việt 0 dấu
    String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
    Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
    return pattern.matcher(temp).replaceAll("").replaceAll("Đ", "D").replace("đ", "");
  }
}

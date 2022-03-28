/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_6_Method_PhuongThuc;

/**
 *
 * @author dungna29
 */
public class S2_Method_TraVe {
     /*
  Phương thức trả về
           *  Công thức chung:
         *  <Phạm vi truy cập> <Kiểu trả về> <Tên phương thức> (<Danh sách tham số>)
         *  {
         *          Body code
                  return <Giá trị có kiểu của phương thức>;
         *  }
   */
    public static void main(String[] args) {
        //Phần 1: Cách dùng tư duy tên và vị trí giống như void
        
        //Cách sử dụng:
        int a = 5;
        System.out.println((a + 7));
        //Phải coi phương thức trả về nó là 1 giá trị, hoặc tập giá trị, đối tượng.......
       S2_Method_TraVe s2=  new S2_Method_TraVe();
       s2.tinhTong(5, 7);//Không thực hiện hành động nào khi thực hiện xong bên trong phương thức với phương thức trên là 1 giá trị không thể tự in giá trị nó.
        System.out.println(s2.tinhTong(5, 7)+2000);
        
       int arr[] = s2.getYeas1900_2022();
        for (int i = 0; i < s2.getYeas1900_2022().length; i++) {
            System.out.println(s2.getYeas1900_2022()[i]);
        }
    }
    
    //Phần 1: Phương thức trả về 1 tập giá trị năm 1900=>2022
    public int[] getYeas1900_2022(){
        int[] arrYears = new int[2023 - 1900];
        int temp = 1900;
        for (int i = 0; i < arrYears.length; i++) {
            arrYears[i] = temp;
            temp++;
        }
        return arrYears;
    }
    public int tinhTong(int a,int b){
        return a+b;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_4_Array_ArrayList_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author dungna29
 */
public class B4_List {
    /*
    Bài List
        - Định nghĩa: List Interface trong Java kế thừa Collection và nó cung cấp các phương thức 
                      để thao tác với các phần tử trong danh sách.
    
        + Phương thứ List    
                    - void add(int index, Object obj) || add(object value) Chèn obj vào trong List đang gọi tại index đã cho. 
                        Bất kỳ phần tử nào đã tồn tại trước tại hoặc trên điểm chèn bị bỏ qua. Vì thế, 
                        không có phần tử nào bị ghi đè.
                    - boolean addAll(int index, Collection c)	Chèn tất cả phần tử của c vào trong List
                        đang gọi tại chỉ mục đã cho. Bất kỳ phần tử nào đã tồn tại trước tại hoặc trên điểm
                        chèn bị bỏ qua. Vì thế, không có phần tử nào bị ghi đè. Trả về true nếu List đang gọi
                        thay đổi và nếu không trả về false.
                    - object get(int index)	Trả về đối tượng được lưu giữ tại index đã 
                        cho bên trong Collection đang gọi.
                    - int indexOf(Object obj)	Trả về index của sự xuất hiện đầu tiên của obj trong List đang gọi.
                        Nếu obj không là một phần tử trong list, -1 được trả về.
                    - int lastIndexOf(Object obj) Trả về index của sự xuất hiện đầu tiên của obj trong List 
                        đang gọi. Nếu obj không là một phần tử trong list, -1 được trả về
                    - ListIterator listIterator()	Sử dụng để trả về một Iterator mà bắt đầu từ phần 
                        tử đầu tiên của list.
                    - ListIterator listIterator(int index)	Sử dụng để trả về một Iterator mà phần tử bắt 
                        đầu từ chỉ số index chỉ định.
                    - object remove(int index)	Gỡ bỏ phần tử tại index từ List đang gọi và trả về phần tử 
                        bị xóa đó. List kết quả được compact lại. Đó là, các chỉ mục của dãy phần tử phụ bị 
                        lượng giảm đi 1.
                    - object set(int index, Object obj)	Gán obj tới vị trí được xác định bởi index bên trong 
                        List đang gọi.
                    - List subList(int start, int end)	Trả về một list mà bao gồm các phần tử từ start tới 
                        end-1 trong List đang gọi. Các phần tử trong list trả về cũng được tham chiếu bởi đối
                        tượng đang gọi.                        
    */
    public static void main(String[] args) {
        //Phần 1: List có định kiểu và không định kiểu
        //Cách gõ: List
        
        //Phần 2: List Khai báo
        //2.1 Không định kiểu
        List lstKhongDinhKieu = new ArrayList();//Khởi tạo 1 ArrayList
        List arrLst1;//Khai báo
        arrLst1 = new ArrayList();//Khởi tạo  mới dùng đc
        
        //2.2 Có định kiểu
        //ArrayList<int> arr;//Sai Phải sử dụng lớp Bao trong tình huống này
        List<Integer> lstInteger = new ArrayList<>();
        List<String> lstLstString = new ArrayList<String>();//Khai báo tường minh
        List<Double> lstLstDouble = new ArrayList<>();//Khai báo tường minh
        
        //Phần 3: Gán giá trị thông qua phương thức add()
        lstKhongDinhKieu.add(1);
        lstKhongDinhKieu.add(1.2);
        lstKhongDinhKieu.add(true);
        lstKhongDinhKieu.add("java");
        lstKhongDinhKieu.add('2');
       
        lstLstString.add("JAVA 1");//Phải add đúng kiểu dữ liệu
        lstLstString.add("JAVA 2");
        lstLstString.add("JAVA 3");
        lstLstString.add(0, "JAVA 4");//Chèn giá trị vào vị trí và dịch chuyển giá trị ở index 0 nếu có vên bên phải.
        
        //Phần 4:Truy xuất phần tử phải có index và sử dụng phương thức get(index)
        System.out.println(lstLstString.get(0));// JAVA 4
        
        //lstLstString.size() = Số phần tử trong mảng
        for (int i = 0; i < lstLstString.size(); i++) {
            System.out.println(lstLstString.get(i));
        }
        for (var x : lstKhongDinhKieu) {
            System.out.println(x);
        }
        
        //Phần 5: Một vài phương thức hay sử dụng
        lstLstString.remove(0);//Xoá phần tử ở index 0
        lstLstString.clear();//Xoá tất cả các phần tử trong danh sách
        lstLstString = new ArrayList<>();//Khởi tạo lại cũng làm dữ liệu trong danh sách bị xoá.
        
        //Collections
        Collections.sort(lstLstString);//Sắp xếp xuôi
        Collections.reverse(lstLstString);//Đảo ngược danh sách
        
        if (lstInteger.isEmpty()) {//arrLstInteger.isEmpty() = true nếu danh sách không có phần tử nào
            System.out.println("Danh sách không có phần tử nào");
        }
    }
}

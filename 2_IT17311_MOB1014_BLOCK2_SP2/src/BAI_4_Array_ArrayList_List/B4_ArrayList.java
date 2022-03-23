/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_4_Array_ArrayList_List;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author dungna29
 */
public class B4_ArrayList {
    /*
    Bài ArrayList
        - Định nghĩa: Lớp ArrayList trong java được sử dụng như một mảng động để lưu trữ các phần tử. 
                      ArrayList được tạo với một kích cỡ ban đầu. Khi kích cỡ này bị vượt, collection 
                      tự động được tăng. Khi các đối tượng bị gỡ bỏ, ArrayList có thể bị giảm kích cỡ.
        + Lưu ý:
                -   Có thể chứa các phần tử trùng lặp.
                -   Duy trì thứ tự của phần tử được thêm vào.
                -   Không đồng bộ (non-synchronized).
                -   Cho phép truy cập ngẫu nhiên, tốc độ truy xuất (get) phần tử nhanh vì nó lưu dữ liệu theo chỉ mục.
                -   Thao tác thêm/ xóa (add/ remove) phần tử chậm vì cần nhiều sự dịch chuyển nếu bất kỳ phần tử nào thêm/ xoá khỏi danh sách.
    
        + Phương thứ ArrayList    
                - boolean add(Object o)	Thêm phần tử được chỉ định vào cuối một danh sách.
                - void add(int index, Object element) || add(Object value) Chèn một phần tử được chỉ định 
                  tại vị trí (index) được chỉ định vào danh sách. 
                  Ném IndexOutOfBoundsException nếu index này ở bên ngoài dãy (index < 0 hoặc index > size()).
                - boolean addAll(Collection c)	Thêm tất cả các phần tử trong collection được chỉ định vào 
                  cuối của danh sách gọi phương thức, theo thứ tự chúng được trả về bởi bộ lặp iterator.
                - boolean addAll(int index, Collection c)	Thêm tất cả các phần tử trong collection được 
                  chỉ định vào danh sách gọi phương thức, bắt đầu từ vị trí đã chỉ định. 
                  Ném NullPointerException nếu collection đã cho là null.
                - Object get(int index)	Trả về phần tử tại index đã cho. 
                  Ném IndexOutOfBoundsException nếu index đã cho là ở bên ngoài dãy 
                  (index < 0 hoặc index >= size()).
                - int indexOf(Object o)	Lấy vị trí (index) trong danh sách với sự xuất hiện đầu tiên
                của phần tử được chỉ định, hoặc -1 nếu danh sách không chứa phần tử này.
                - int lastIndexOf(Object o) Lấy vị trí (index) trong danh sách với sự xuất hiện cuối
                cùng của phần tử được chỉ định, hoặc -1 nếu danh sách không chứa phần tử này.
                - Object remove(int index) Gỡ bỏ phần tử tại index đã cho. 
                Ném IndexOutOfBoundsException nếu index ở ngoài dãy (index < 0 hoặc index >= size()).
                - void retainAll(Collection c)	Xóa những phần tử không thuộc collection c và 
                không thuộc list hiện tại khỏi list hiện tại. 
                Ném NullPointerException nếu collection đã cho là null.
                - void removeAll(Collection c)	Xóa những phần tử thuộc collection c và thuộc list hiện 
                tại khỏi list hiện tại. Ném NullPointerException nếu collection đã cho là null.
                - Object set(int index, Object element)	Thay thế phần tử tại vị trí đã cho trong list này với phần tử đã xác định. Ném IndexOutOfBoundsException nếu index ở ngoài dãy (index < 0 hoặc index >= size()).
                - Object[] toArray()	Chuyển một danh sách sang mảng và trả về một mảng chứa tất cả các phần tử trong danh sách này theo đúng thứ tự. Ném NullPointerException nếu mảng này là null.
                - Object[] toArray(Object[] a)	Chuyển một danh sách sang mảng và trả về một mảng chứa tất cả các phần tử trong danh sách này theo đúng thứ tự. Kiểu runtime là của mảng trả về giống như mảng đã xác định.
                - Object clone()	Tạo một bản sao của ArrayList.
                - void clear()	Xóa tất cả các phần tử từ danh sách.
                - void trimToSize()	Cắt dung lượng của thể hiện ArrayList này là kích thước danh sách hiện tại.
   */
    public static void main(String[] args) {
        //Phần 1: ArrayList có định kiểu và không định kiểu
        //Cách gõ: ArrayL
        
        //Phần 2: ArrayList Khai báo
        //2.1 Không định kiểu
        ArrayList arrLstKhongDinhKieu = new ArrayList();//Khởi tạo 1 ArrayList
        ArrayList arrLst1;//Khai báo
        arrLst1 = new ArrayList();//Khởi tạo  mới dùng đc
        
        //2.2 Có định kiểu
        //ArrayList<int> arr;//Sai Phải sử dụng lớp Bao trong tình huống này
        ArrayList<Integer> arrLstInteger = new ArrayList<>();
        ArrayList<String> arrLstString = new ArrayList<String>();//Khai báo tường minh
        ArrayList<Double> arrLstDouble = new ArrayList<>();//Khai báo tường minh
        
        //Phần 3: Gán giá trị thông qua phương thức add()
        arrLstKhongDinhKieu.add(1);
        arrLstKhongDinhKieu.add(1.2);
        arrLstKhongDinhKieu.add(true);
        arrLstKhongDinhKieu.add("java");
        arrLstKhongDinhKieu.add('2');
       
        arrLstString.add("JAVA 1");//Phải add đúng kiểu dữ liệu
        arrLstString.add("JAVA 2");
        arrLstString.add("JAVA 3");
        arrLstString.add(0, "JAVA 4");//Chèn giá trị vào vị trí và dịch chuyển giá trị ở index 0 nếu có vên bên phải.
        
        //Phần 4:Truy xuất phần tử phải có index và sử dụng phương thức get(index)
        System.out.println(arrLstString.get(0));// JAVA 4
        
        //arrLstString.size() = Số phần tử trong mảng
        for (int i = 0; i < arrLstString.size(); i++) {
            System.out.println(arrLstString.get(i));
        }
        for (var x : arrLstKhongDinhKieu) {
            System.out.println(x);
        }
        
        //Phần 5: Một vài phương thức hay sử dụng
        arrLstString.remove(0);//Xoá phần tử ở index 0
        arrLstString.clear();//Xoá tất cả các phần tử trong danh sách
        arrLstString = new ArrayList<>();//Khởi tạo lại cũng làm dữ liệu trong danh sách bị xoá.
        
        //Collections
        Collections.sort(arrLstString);//Sắp xếp xuôi
        Collections.reverse(arrLstString);//Đảo ngược danh sách
        
        if (arrLstInteger.isEmpty()) {//arrLstInteger.isEmpty() = true nếu danh sách không có phần tử nào
            System.out.println("Danh sách không có phần tử nào");
        }
    }
}

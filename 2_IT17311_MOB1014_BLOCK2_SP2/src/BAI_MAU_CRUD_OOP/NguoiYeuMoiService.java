/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_MAU_CRUD_OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author dungna29
 */
//Lớp này sẽ bao gồm các phương thức phục vụ cho đối tượng như: Thêm, Sửa, Xoá, Lấy danh sách......
public class NguoiYeuMoiService {
    //Tất cả các biến toàn cục phải khai báo trên đầu
    private Scanner _sc;
    private List<NguoiYeuMoi> _lstNYMoi;
    private NguoiYeuMoi _NYMoi;
    private String _input;
    
    public NguoiYeuMoiService() {
        _sc = new Scanner(System.in);
        _lstNYMoi = new ArrayList<>();
        fake5Data();//Khi gọi lớp Service thì List sẽ có sẵn 5 đối tượng
    }
    private void fake5Data(){
        _lstNYMoi.add(new NguoiYeuMoi("Chơi game", 70, 60, 70, "A", 2000, 0, 60,"09812"));
        _lstNYMoi.add(new NguoiYeuMoi("Đi chơi", 70, 60, 70, "B", 2001, 0, 70,"09712"));
        _lstNYMoi.add(new NguoiYeuMoi("Xem phim", 70, 60, 70, "C", 2002, 0, 80,"09813"));
        _lstNYMoi.add(new NguoiYeuMoi("Nghe Nhạc", 70, 60, 70, "D", 2003, 0, 90,"09812"));
        _lstNYMoi.add(new NguoiYeuMoi("Lập trình", 70, 60, 70, "E", 2004, 0, 100,"09512"));
    }
    public void them(){
        System.out.print("Mời bạn nhập số lượng: ");
        _input = _sc.nextLine();
        for (int i = 0; i < Integer.parseInt(_input); i++) {
            _NYMoi = new NguoiYeuMoi();//Phải khởi tạo đối tượng mới dùng đc
            System.out.print("Mời nhập tên: ");
            _NYMoi.setTen(_sc.nextLine());
            System.out.print("Mời nhập vòng 1: ");
            _NYMoi.setV1(Double.parseDouble(_sc.nextLine()));
            System.out.print("Mời nhập vòng 2: ");
            _NYMoi.setV2(Double.parseDouble(_sc.nextLine()));
            System.out.print("Mời nhập vòng 3: ");
            _NYMoi.setV3(Double.parseDouble(_sc.nextLine()));
            System.out.print("Mời nhập sở thích: ");
            _NYMoi.setSoThich(_sc.nextLine());
            System.out.print("Mời nhập năm sinh: ");
            _NYMoi.setNs(Integer.parseInt(_sc.nextLine()));
            System.out.print("Mời nhập giới tính (1 = Nam | 0 = Nữ): ");
            _NYMoi.setGioiTinh(Integer.parseInt(_sc.nextLine()));
            System.out.print("Mời nhập cân nặng: ");
             _NYMoi.setCanNang(Double.parseDouble(_sc.nextLine()));
            System.out.print("Mời nhập sdt: ");
            _NYMoi.setSdt(_sc.nextLine());
            //Sau khi nhập xong phải thêm đối tượng vào List
            _lstNYMoi.add(_NYMoi);
        }
    }
    public void xuatDs(){
        for (NguoiYeuMoi x : _lstNYMoi) {
            System.out.println(x.toString());
        }
    }
    
    public void xoa(){
        System.out.print("Mời bạn nhập sđt: ");
        _input = _sc.nextLine();
        for (int i = 0; i < _lstNYMoi.size(); i++) {
            if (_lstNYMoi.get(i).getSdt().equals(_input)) {
               _lstNYMoi.remove(i);
                System.out.println("Xoá thành công");
               break;//Tại sao phải break ở đây
               //Làm sao để in ra được câu không tìm thấy khi người dùng truyền không đúng số điện thoại cần tìm.
            }
        }
    }
    //Về nhà làm cho thầy chức năng sửa và tìm kiếm.
    
    
}

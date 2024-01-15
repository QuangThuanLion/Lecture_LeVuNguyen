package bai_9.map;

import java.util.HashMap;
import java.util.Map;

public class PersonMap {
    public static void main(String[] args) {
        //Viết chương trình cho phép lưu trữ số chứng minh nhân dân(cmnd)
        //và tên của người sở hữu cmnd đó. Chương trình có những tính năng sau:
    
        //1. thêm thông tin người dùng (cmnd + tên)
        //2. In ra thong tin nguoi dung
        //3. Cập nhật tên người dùng theo số cmnd
        //4. Xóa thông tin người dùng khỏi tập hợp.
        //5. Truy xuất tên người dùng thông qua số cmnd
        
        //6: kiem tra xem voi so CMND 123673 co ton tai trong tap hop hay khong
        //   neu ton tai thi in ra thong tin cua nguoi do, khong thi message
        //   --> khong ton tai so CMND nay
    
        Map<Integer, String> persons = new HashMap<>();
        persons.put(12345, "Henry");
        persons.put(23456, "Lily");
        persons.put(34567, "Lucy");
        persons.put(45678, "Jack");
    
        System.out.println(persons);
        persons.replace(34567, "Lucy_update");
        persons.remove(45678);
        String Lily = persons.get(23456);
        System.out.println("person: " + Lily);
    
        boolean containsKey = persons.containsKey(123673);
        System.out.println(containsKey ? persons.get(123673) : "Not found");
    }
}

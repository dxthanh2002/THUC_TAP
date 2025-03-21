package Coding48;

import java.util.List;

public interface ISaveable {
    // write code here
    List<String> write();  // Trả về danh sách các giá trị của đối tượng
    void read(List<String> savedValues);  // Đọc danh sách giá trị và cập nhật đối tượng
}

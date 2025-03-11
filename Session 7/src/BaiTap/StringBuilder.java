package BaiTap;

 class StringBuilderExample {
    public static void main(String[] args) {
        // Khởi tạo một StringBuilder
        StringBuilder sb = new StringBuilder("Hello");

        // 1. Thêm chuỗi vào cuối
        sb.append(" World");
        System.out.println(sb);  // Output: Hello World

        // 2. Chèn chuỗi vào vị trí cụ thể
        sb.insert(5, ",");
        System.out.println(sb);  // Output: Hello, World

        // 3. Xóa một phần chuỗi
        sb.delete(5, 6);
        System.out.println(sb);  // Output: Hello World

        // 4. Thay thế một phần chuỗi
        sb.replace(6, 11, "Java");
        System.out.println(sb);  // Output: Hello Java

        // 5. Đảo ngược chuỗi
        sb.reverse();
        System.out.println(sb);  // Output: avaJ olleH

        // 6. Lấy độ dài chuỗi
        System.out.println("Length: " + sb.length());  // Output: Length: 10
    }
}


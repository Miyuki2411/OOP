import java.util.*;

// Main
public class Main {
    public static void main(String[] args) {
        // Khởi tạo sinh viên
        Student sv1 = new Student("Nguyễn Văn An", "SV001", "nvan@edu.vn");
        Student sv2 = new Student("Trần Thị Bình", "SV002", "ttbinh@edu.vn");
        Student sv3 = new Student("Lê Minh Châu", "SV003", "lmchau@edu.vn");
        Student sv4 = new Student("Phạm Thị Dung", "SV004", "ptdung@edu.vn");

        // Khởi tạo giảng viên
        Teacher gv1 = new Teacher("Nguyễn Thị Hoa", "GV001", "nthoa@uni.vn", "TS.");
        Teacher gv2 = new Teacher("Trần Văn Nam", "GV002", "tvnam@uni.vn", "PGS.TS.");

        // Khởi tạo advisor
        Advisor ad1 = new Advisor("Hoàng Minh Tuấn", "hmtuan@company.com", "Công ty ABC");
        Advisor ad2 = new Advisor("Võ Thị Lan", "vtlan@tech.vn", "VN Tech");

        // Tạo danh sách khóa luận
        ListSortable<KLTN<Student, ?>> danhSach = new ListSortable<>();

        // Thêm khóa luận
        danhSach.add(new KLTN<>(sv1, gv1, "Xây dựng hệ thống quản lý thư viện"));
        danhSach.add(new KLTN<>(sv2, ad1, "Ứng dụng AI nhận diện khuôn mặt"));
        danhSach.add(new KLTN<>(sv3, gv2, "Phát triển app thương mại điện tử"));
        danhSach.add(new KLTN<>(sv4, ad2, "Blockchain trong tài chính"));

        // In danh sách đã sắp xếp
        danhSach.print();
    }
}
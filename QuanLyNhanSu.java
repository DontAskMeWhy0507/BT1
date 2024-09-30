public class QuanLyNhanSu {
    public static class GiangVien {
        public String hoTen;
        public int namSinh;
    }

    public static class SinhVien extends GiangVien {
        public String maSinhVien;
    }

    public static class Person {
        public String hoTen;
        public int namSinh;
    }

    public static void main(String[] args) {
        GiangVien gv = new GiangVien();
        gv.hoTen = "Nguyen Van A";
        gv.namSinh = 1990;
        
        SinhVien sv = new SinhVien();
        sv.hoTen = "Nguyen Van B";
        sv.namSinh = 1991;
        sv.maSinhVien = "SV001";

        Person p = new Person();
        p.hoTen = "Nguyen Van C";
        p.namSinh = 1992;
    }
}
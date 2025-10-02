package OOP.tuan2.TH_tuan2.bai1;

import java.util.Comparator;

public class GiaoVien {
    private String ten;
    private int nhom;

    public String getName() { return ten; }
    public void setName(String ten) { this.ten = ten; }
    public int getNhom() { return nhom; }
    public void setNhom(int nhom) { this.nhom = nhom; }

    public GiaoVien(String ten, int nhom) {
        this.ten = ten;
        this.nhom = nhom;
    }
    public GiaoVien() {}

    public static Comparator<GiaoVien> Ten = new Comparator<GiaoVien>() {
        @Override
        public int compare(GiaoVien o1, GiaoVien o2) {
            return o1.ten.compareTo(o2.ten);
        }
    };

    public static Comparator<GiaoVien> Nhom = new Comparator<GiaoVien>() {
        @Override
        public int compare(GiaoVien o1, GiaoVien o2) {
            if (o1.nhom > o2.nhom) return -1;
            else if (o1.nhom == o2.nhom) return 0;
            else return 1;
        }
    };
}
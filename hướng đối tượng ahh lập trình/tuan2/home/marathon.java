import java.util.Scanner;

public class marathon {
    private int soao;
    private String hoten,maso;
    public class thoigian{
        int Gio=0,phut=0,giay=0;
    }
    private thoigian batdau,ketthuc;
    public String getmaso(){
        return this.maso;
    }
    public int getsoao(){
        return this.soao;
    
    }
    public String getTen(){
        return this.hoten;
    }
    public thoigian getGioBatdau(){
        return this.batdau;
    }
    public thoigian getGioKetThuc(){
        return this.ketthuc;
    }
    public void setMaSo(String id){
        this.maso=id;
    }
    public void setSoAo(int number){
        this.soao=number;
    }
    public void setHoTen(String name){
        this.hoten=name;
    }
    public void setBatDau(thoigian Start){
        this.batdau=Start;
    }
    public void setKetThuc(thoigian end){
        this.ketthuc=end;
    }
    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        thoigian temp=new thoigian();
        System.out.print("nhap ma so thi sinh:");setMaSo(scanner.next());
        System.out.print("nhap so ao:");setSoAo(scanner.nextInt());
        String name=scanner.nextLine();
        do {
            System.out.print("Nhap ho ten thi sinh: ");
            name = scanner.nextLine();
        } while (name.trim().isEmpty());
        setHoTen(name);
        System.out.println("nhap thoi gian bat dau:");
        System.out.print("Gio:");temp.Gio=scanner.nextInt();
        System.out.print("Phut:");temp.phut=scanner.nextInt();
        System.out.print("Giay:");temp.giay=scanner.nextInt();
        setBatDau(temp);
        System.out.println("Nhap thoi Gian Ket Thuc:");
        System.out.print("Gio:");temp.Gio=scanner.nextInt();
        System.out.print("Phut:");temp.phut=scanner.nextInt();
        System.out.print("Giay:");temp.giay=scanner.nextInt();
        setKetThuc(temp);
    }
    public void xuat(){
        thoigian temp=getGioBatdau();
        System.out.println("ma so:"+getmaso());
        System.out.println("so ao:"+getsoao());
        System.out.println("ho ten:"+getTen());
        System.out.println("thoi gian bat dau:"+temp.Gio+" Gio "+temp.phut+" Phut "+ temp.giay+" Giay");
        temp=getGioKetThuc();
        System.out.println("thoi gian ket thuc:"+temp.Gio+" Gio "+temp.phut+" Phut "+ temp.giay+" Giay");
    }
    public void thanhtich(){
        thoigian temp=null,batdau=getGioBatdau(),ketthuc=getGioKetThuc();
        temp.Gio=ketthuc.Gio-batdau.Gio;temp.phut=ketthuc.phut-batdau.phut;temp.giay=ketthuc.giay-batdau.giay;
        if(temp.Gio>1 && temp.phut>30 && temp.giay > 0) System.out.println("khong dat");
        else System.out.println("vua tro choi");
    }
    public void kiemtra(){
        thoigian batdau=getGioBatdau(),ketthuc=getGioKetThuc();
        if((batdau.Gio<0||batdau.Gio>=24||batdau.phut<0||batdau.phut>=60||batdau.giay<0||batdau.giay>60) && (ketthuc.Gio<0||ketthuc.Gio>=24||ketthuc.phut<0||ketthuc.phut>=60||ketthuc.giay<0||ketthuc.giay>60) && (batdau.Gio>ketthuc.Gio || batdau.phut>ketthuc.phut || batdau.giay>ketthuc.giay )) System.out.println("khong hop le");
        else System.out.println("hop le");
    }
}

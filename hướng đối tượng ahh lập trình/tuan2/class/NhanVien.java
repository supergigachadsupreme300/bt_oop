import java.util.Scanner;
public class NhanVien {
    private String MS,name;
    private int cong;
    private char loai;
    static int luong=200000;

    public String getMS(){
        return MS;
    }
    public String getname(){
        return name;
    }
    public int getcong(){
        return cong;
    }
    public char getloai(){
        return loai;
    }
    public int getluong(){
        return luong;
    }
    public void setMS(String MaSo){
        this.MS=MaSo;
    }
    public void setname(String Name){
        this.name=Name;
    }
    public void setcong(int Cong){
        this.cong=Cong;
    }
    public void setLoai(char loai){
        this.loai=loai;
    }

    public void nhap(){
        Scanner scanner=new Scanner(System.in);
        String tMS,tname;
        int tcong;
        char tloai;
        do{
            System.out.print("Nhap ma so:");
            tMS=scanner.next();
            System.out.print("\nNhap Ten:");
            tname=scanner.next();
            System.out.print("\nNhap so ngay cong:");
            tcong=scanner.nextInt();
            if(tcong>26)tloai='A';
            else if(tcong>=22&&tcong<=26)tloai='B';
            else tloai='C';
        }while(cong<0||tMS.length()<=0||tname.length()<=0);
        setLoai(tloai);
        setMS(tMS);
        setname(tname);
        setcong(tcong);
    }
    public int Luong(){
        return getcong()*getluong();
    }
    public float thuong(){
        if(getloai()=='A'){
            return (float)Luong()/100*5;
        }
        else if(getloai()=='B'){
            return (float) Luong()/100*2;
        }
        else return 0;
    }
    public void xuat(){
        System.out.println("Ma nhan Vien:"+getMS());
        System.out.println("Ten:"+getname());
        System.out.println("So ngay cong:"+getcong());
        System.out.println("Luong"+Luong());
        System.out.println("Thuong:"+thuong());
    }
}

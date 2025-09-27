import java.util.Scanner;

public class Nuoc {
    private String name,donvi;
    private int Soluong;
    private float DonGia,thue;

    public String getname(){
        return name;
    }
    public String getdonvi(){
        return donvi;
    }
    public int getSoluong(){
        return Soluong;
    }
    public float getDonGia(){
        return DonGia;
    }
    public float getThue(){
        return thue;
    }
    public void setname(String Name){
        this.name=Name;
    }
    public void setdonvi(String Donvi){
        this.donvi=Donvi;
    }
    public void setSoluong(int soluong){
        this.Soluong=soluong;
    }
    public void setDonGia(float dongia){
        this.DonGia=dongia;
    }
    public void setthue(float Thue){
        this.thue=Thue;
    }
    public Nuoc(String Name,String Donvi,int soluong,float dongia,float Thue){
        this.name=Name;
        if(Donvi!="thung"&&Donvi!="chai"&&Donvi!="lon")this.donvi="ket";
        else this.donvi=Donvi;
        this.Soluong=soluong;
        this.DonGia=dongia;
        this.thue=Thue;
    }
    public float ThanhTien(){
        float DVT;
        if(getdonvi()=="ket"||getdonvi()=="thung") DVT=(float)getSoluong()*getDonGia()*getThue();
        else if(getdonvi()=="chai") DVT=(float)getSoluong()*(getDonGia()/20)*getThue();
        else DVT=(float)getSoluong()*(getDonGia()/24)*getThue();
        return DVT;
    }
    public void nhap(){
        Scanner scanner=new Scanner(System.in);
        do{
            System.out.println("Nhap Don gia:");
            setDonGia(scanner.nextFloat());
            System.out.println("Nhap So Luong");
            setSoluong(scanner.nextInt());
            System.out.println("Nhap don vi:");
            setdonvi(scanner.next());
            System.out.println("Nhap ten:");
            setname(scanner.next());
            System.out.println("Nhap thue:");
            setthue(scanner.nextFloat());
        }while(getDonGia()<0||getSoluong()<0||getThue()<0||getname().length()<0||getdonvi().length()<0);
    }
    public void xuat(){
        System.out.println("Don gia:"+getDonGia());
        System.out.println("soluong"+getSoluong());
        System.out.println("thue:"+getThue());
        System.out.println("don vi:"+getdonvi());
        System.out.println("ten"+getname());
    }
}

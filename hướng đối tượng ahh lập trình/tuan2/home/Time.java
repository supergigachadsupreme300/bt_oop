package tuan2.home;
import java.util.Scanner;
public class Time {
    private int gio,phut,giay;
    private boolean sang;
    private String KieuGio;
    public int getGio(){
        return gio;
    }
    public int getPhut(){
        return phut;
    }
    public int getGiay(){
        return giay;
    }
    public boolean getDay(){
        return sang;
    }
    public String getKieuGio(){
        return KieuGio;
    }
    public void setGio(int hour){
        this.gio=hour;
    }
    public void setPhut(int minute){
        this.phut=minute;
    }
    public void setGiay(int second){
        this.giay=second;
    }
    public void setDay(boolean day){
        this.sang=day;
    }
    public void setKieuGio(String khung){
        this.KieuGio=khung;
    }
    public void nhap(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("chon khung gio(12/24):");setKieuGio(scanner.next());
        if (getKieuGio().equals("24")) Nhap24();
        else Nhap12();
    }
    public void Nhap24(){
        int hour = 0,minute=0,second=0;
        Scanner scanner=new Scanner(System.in);
        do{
            System.out.print("Nhap gio:");hour=scanner.nextInt();
            System.out.print("\nNhap phut:");minute=scanner.nextInt();
            System.out.print("\nNhap giay:");second=scanner.nextInt();
        }while(hour<0||hour>=24||minute<0||minute>=60||second<0||second>=60);
        setGio(hour);setPhut(minute);setGiay(second);
    }
    public void Nhap12(){
        int hour = 0,minute=0,second=0;
        String buoi;
        Scanner scanner=new Scanner(System.in);
        do{
            System.out.print("Nhap gio:");hour=scanner.nextInt();
            System.out.print("nhap buoi(sang/chieu):");buoi=scanner.next();
            System.out.print("\nNhap phut:");minute=scanner.nextInt();
            System.out.print("\nNhap giay:");second=scanner.nextInt();
        }while(hour<0||hour>=12||minute<0||minute>=60||second<0||second>=60);
        setGio(hour);setPhut(minute);setGiay(second);if (buoi.equals("sang")) setDay(true); 
    }
    public void Xuat(){
        if (getKieuGio().equals("12")) {
            if (getDay()) {
                System.out.println(getGio()+":"+getPhut()+":"+getGiay()+"AM");
            }
            else{
                System.out.println(getGio()+":"+getPhut()+":"+getGiay()+"PM");
            }
        }
        else System.out.println(getGio()+":"+getPhut()+":"+getGiay());
    }
    public boolean Check(){
        int hour=getGio(),minute=getPhut(),second=getGiay();
        if(getKieuGio().equals("12") && !(hour<0||hour>=12||minute<0||minute>=60||second<0||second>=60) ){return true;}
        else if(getKieuGio().equals("24") && !(hour<0||hour>=24||minute<0||minute>=60||second<0||second>=60)){return true;}
        else return false;
    }
    public void TangGio24(){
        Scanner scanner = new Scanner(System.in);
        String donvi;
        int amount;
        System.out.println("Nhap don vi(Gio/Phut/Giay):");donvi=scanner.next();
        System.out.println("so luong tang:");amount=scanner.nextInt();
        int overlap;
        if(donvi.equals("Gio")){
            setGio(getGio()+amount);
            while(getGio()>24) setGio(getGio()-24);
        }
        else if(donvi.equals("Phut")){
            setPhut(getPhut()+amount);
            while(getPhut()>60) {
                setPhut(getPhut()-60);
                setGio(getGio()+1);
                if(getGio()>24) setGio(getGio()-24);
            }
        }
        else if(donvi.equals("Giay")){
            setGiay(getGiay()+amount);
            while(getGiay()>60) {
                setGiay(getGiay()-60);
                setPhut(getPhut()+1);
                while(getPhut()>60) {
                setPhut(getPhut()-60);
                setGio(getGio()+1);
                if(getGio()>24) setGio(getGio()-24);
                }
            }
        }
    }
    public void TangGio(){
        Scanner scanner = new Scanner(System.in);
        String donvi;
        int amount;
        System.out.println("Nhap don vi(Gio/Phut/Giay):");donvi=scanner.next();
        System.out.println("so luong tang:");amount=scanner.nextInt();
        int overlap;
        if(getKieuGio().equals("24")){
            if(donvi.equals("Gio")){
                setGio(getGio()+amount);
                while(getGio()>24) setGio(getGio()-24);
            }
            else if(donvi.equals("Phut")){
                setPhut(getPhut()+amount);
                while(getPhut()>60) {
                    setPhut(getPhut()-60);
                    setGio(getGio()+1);
                    if(getGio()>24) setGio(getGio()-24);
                }
            }
            else if(donvi.equals("Giay")){
                setGiay(getGiay()+amount);
                while(getGiay()>60) {
                    setGiay(getGiay()-60);
                    setPhut(getPhut()+1);
                    while(getPhut()>60) {
                    setPhut(getPhut()-60);
                    setGio(getGio()+1);
                    if(getGio()>24) setGio(getGio()-24);
                    }
                }
            }
        }
        else{
            if(donvi.equals("Gio")){
                setGio(getGio()+amount);
                while(getGio()>12) {setGio(getGio()-24);setDay(!getDay());}
            }
            else if(donvi.equals("Phut")){
                setPhut(getPhut()+amount);
                while(getPhut()>60) {
                    setPhut(getPhut()-60);
                    setGio(getGio()+1);
                    if(getGio()>12) {setGio(getGio()-12);setDay(!getDay());}
                }
            }
            else if(donvi.equals("Giay")){
                setGiay(getGiay()+amount);
                while(getGiay()>60) {
                    setGiay(getGiay()-60);
                    setPhut(getPhut()+1);
                    while(getPhut()>60) {
                    setPhut(getPhut()-60);
                    setGio(getGio()+1);
                    if(getGio()>12) {setGio(getGio()-12);setDay(!getDay());}
                    }
                }
            }
        }
    Xuat();       
    }
    public void GiamGio24(){
        Scanner scanner = new Scanner(System.in);
        String donvi;
        int amount;
        System.out.println("Nhap don vi(Gio/Phut/Giay):");donvi=scanner.next();
        System.out.println("so luong giam:");amount=scanner.nextInt();
        int overlap;
        if(donvi.equals("Gio")){
            setGio(getGio()-amount);
            while(getGio()<0) setGio(getGio()+24);
        }
        else if(donvi.equals("Phut")){
            setPhut(getPhut()-amount);
            while(getPhut()<0) {
                setPhut(getPhut()+60);
                setGio(getGio()-1);
                if(getGio()<0) setGio(getGio()+24);
            }
        }
        else if(donvi.equals("Giay")){
            setGiay(getGiay()-amount);
            while(getGiay()<0) {
                setGiay(getGiay()+60);
                setPhut(getPhut()-1);
                while(getPhut()<0) {
                setPhut(getPhut()+60);
                setGio(getGio()-1);
                if(getGio()<0) setGio(getGio()+24);
                }
            }
        }
    }
    public void GiamGio(){
        if (getKieuGio().equals("24")) {
            Scanner scanner = new Scanner(System.in);
            String donvi;
            int amount;
            System.out.println("Nhap don vi(Gio/Phut/Giay):");donvi=scanner.next();
            System.out.println("so luong giam:");amount=scanner.nextInt();
            int overlap;
            if(donvi.equals("Gio")){
                setGio(getGio()-amount);
                while(getGio()<0) setGio(getGio()+24);
            }
            else if(donvi.equals("Phut")){
                setPhut(getPhut()-amount);
                while(getPhut()>60) {
                    setPhut(getPhut()+60);
                    setGio(getGio()-1);
                    if(getGio()<0) setGio(getGio()+24);
                }
            }
            else if(donvi.equals("Giay")){
                setGiay(getGiay()-amount);
                while(getGiay()<0) {
                    setGiay(getGiay()+60);
                    setPhut(getPhut()-1);
                    while(getPhut()<0) {
                    setPhut(getPhut()+60);
                    setGio(getGio()-1);
                    if(getGio()<0) setGio(getGio()+24);
                    }
                }
            }
        }
        else{
        Scanner scanner = new Scanner(System.in);
        String donvi;
        int amount;
        System.out.println("Nhap don vi(Gio/Phut/Giay):");donvi=scanner.next();
        System.out.println("so luong giam:");amount=scanner.nextInt();
        int overlap;
        if(donvi.equals("Gio")){
            setGio(getGio()-amount);
            while(getGio()<0) {setGio(getGio()+24);setDay(!getDay());}
        }
        else if(donvi.equals("Phut")){
            setPhut(getPhut()-amount);
            while(getPhut()>60) {
                setPhut(getPhut()+60);
                setGio(getGio()-1);
                if(getGio()<0) {setGio(getGio()+24);setDay(!getDay());}
            }
        }
        else if(donvi.equals("Giay")){
            setGiay(getGiay()-amount);
            while(getGiay()<0) {
                setGiay(getGiay()+60);
                setPhut(getPhut()-1);
                while(getPhut()<0) {
                setPhut(getPhut()+60);
                setGio(getGio()-1);
                if(getGio()<0) {setGio(getGio()+24);setDay(!getDay());}
                }
            }
        }
        }
        
    }
}
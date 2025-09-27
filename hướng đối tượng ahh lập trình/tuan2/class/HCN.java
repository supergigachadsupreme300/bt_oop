
import java.util.Scanner;

public class HCN {
    private float dai,rong;
    public float getDai(){
        return dai;
    }
    public float getRong(){
        return rong;
    }
    public void setDai(float dai){
        this.dai=dai;
    }
    public void setRong(float rong){
        this.rong=rong;
    }
    public HCN() {
        dai=0;
        rong=0;
    }
    public void nhap(){
        Scanner scanner= new Scanner(System.in);
        do{
            setDai(scanner.nextFloat());
            setRong(scanner.nextFloat()); 
        }while(dai<0||rong<0);
        
    }
    public double ChuVi(){
        return (this.getDai()+this.getRong())*2;
    }
    public double DienTich(){
        return this.getDai()*this.getRong();
    }
    public void xuat(){
        System.out.println("HCN co chu vi:" +ChuVi()+" va dien tich:"+DienTich());
    }
}

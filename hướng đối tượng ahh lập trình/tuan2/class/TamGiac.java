import java.util.Scanner;

public class TamGiac {
    double a,b,c;
    public double geta(){
        return a;
    }
    public double getb(){
        return b;
    }
    public double getc(){
        return c;
    }
    public void seta(double a){
        this.a=a;
    }
    public void setb(double b){
        this.b=b;
    }
    public void setc(double c){
        this.c=c;
    }
    public void nhap(){
        Scanner scanner= new Scanner(System.in);
        double c1,c2,c3;
        do{
            c1=scanner.nextFloat();
            c2=scanner.nextFloat();
            c3=scanner.nextFloat();
            seta(c1);
            setb(c2); 
            setc(c3);
        }while(c1<0||c2<0||c3<0||c1+c2<c3||c2+c3<c1||c1+c3<c2);
    }
    public double chuvi(){
        return geta()+getb()+getc();
    }
    public double dientich(){
        double p=chuvi()/2;
        return Math.sqrt(p*(p-geta())*(p-getc())*(p-getb()));
    }
    public void xuat(){
        System.out.println("tam giac co chu vi:"+ chuvi()+" va dien tich:"+dientich());
    }
}

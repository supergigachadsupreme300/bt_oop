import java.util.Scanner;
public class bai1d{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n;
        do{
            System.out.print("nhap so:");
            n = scan.nextInt();
        }while(n==0);
        
        int s=0;
        while(n!=0){
            n/=10;
            s++;
        }
        System.out.println("so chu so:"+s);
    }
}
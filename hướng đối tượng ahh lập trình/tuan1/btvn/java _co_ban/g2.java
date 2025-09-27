import java.util.Scanner;

public class g2 {
    public static void main(String[] args){
        System.out.print("Nhap N:");
        Scanner scan = new Scanner(System.in);
        int S=0;
        int n = scan.nextInt();
        for( int i=0;i<=n;i++){
            S+=i;
        }
    }
}

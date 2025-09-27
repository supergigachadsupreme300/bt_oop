import java.util.Scanner;
public class bai1c{
    public static void main(String[] args){
        System.out.print("nhập n:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("ước của "+ n);
        for(int i=1;i<=n;i++){
            if(n%i==0) System.out.print(i + " ");
        }
    }
}
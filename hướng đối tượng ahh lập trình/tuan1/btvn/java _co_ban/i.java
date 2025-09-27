import java.util.Scanner;
public class i
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("vui long nhap x:");
        int x = scan.nextInt();
        int sum = 0;
        for (int i = 1; i <= x / 2; i++) {
            if (x % i == 0) {
                sum += i; // Cộng các ước
            }
        }
        if(sum==x){
            System.out.print("day la so hoan thien");
        }
        else{
            System.out.print("day khong phai so hoan thien");
        }
    }
}
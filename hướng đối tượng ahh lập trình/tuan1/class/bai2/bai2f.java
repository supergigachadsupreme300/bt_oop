import java.util.Random;
public class bai2f{
    public static void main(String[] args){
        Random random = new Random();
        int arraySize=15;
        int a[]= new int[arraySize];
        for(int i=0;i<arraySize;i++){
            a[i]=random.nextInt(99);
            System.out.print(a[i]+ " ");
        }
        System.out.println("\n");
        for(int i=0;i<arraySize;i++){
            if(a[i]/10==1) System.out.println("Vi tri "+i+": "+a[i]); 
        }
    }
}
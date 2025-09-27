import java.util.Random;

public class bai3 {
    public static void main(String[] args){

        int []ds = new int[10];
        for(int i = 0; i < 10; i++){
            Random rd = new Random();
            ds[i] = rd.nextInt(100);
            System.out.print(ds[i]+" ");
        }

        for(int i = 0; i < ds.length;i++)
            if(ds[i] == 50)
                System.out.println("trong ds chua 50 so");
        System.out.println("trong ds khong chua 50 so");
        




    }
}
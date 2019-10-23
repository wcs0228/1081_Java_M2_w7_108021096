import java.util.Scanner;
    public class Main02 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scn =new Scanner(System.in);
        int n =scn.nextInt();
        for(int i = 0;i<=n;i+=3)
        {
            sum = sum+i;
        }
        System.out.println(sum);
    }



    }

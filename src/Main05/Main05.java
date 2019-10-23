package Main05;

import java.util.Scanner;
public class Main05 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scn =new Scanner(System.in);
        int n =scn.nextInt();
        for(int i = 1;i<=n;i++)
        {
            sum = sum+i*(i+1);
        }
        System.out.println(sum);
    }



}

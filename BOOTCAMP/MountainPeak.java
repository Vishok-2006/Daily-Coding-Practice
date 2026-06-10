package BOOTCAMP;


import java.util.Scanner;


public class MountainPeak {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        if(n<3) System.out.println("false");
        int i=0;
        while(i+1<n && arr[i]<arr[i+1]){
            i++;
        }
        if(i==0 || i == n-1){
            System.out.println("false");
        }
        while(i+1<n && arr[i]>arr[i+1]){
            i++;
        }
        if(i==n-1) System.out.println("true");
    }
}

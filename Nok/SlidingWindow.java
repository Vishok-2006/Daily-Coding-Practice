package Nok;

import java.util.Scanner;

public class SlidingWindow {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int [] arr=new int[n];
    for(int i=0;i<n;i++){
       arr[i]=sc.nextInt();
        
    }
    int sum=0;
    int max=Integer.MIN_VALUE;

    if (n >= k) {
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        max = sum;

        for (int i = k; i < n; i++) {
            sum += arr[i] - arr[i - k];
            if (sum > max) {
                max = sum;
            }
        }
    }

    System.out.println(max);
    sc.close();
}
}

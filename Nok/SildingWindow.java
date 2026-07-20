package Nokia;

import java.util.Scanner;

public class SildingWindow {
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
    int [] sw=new int[k];
    for(int i=0;i<n;i++){
      
        for(int j=i;j<sw.length;i++){
            sum+=csum-arr[i-k] +arr[i];
        
        if(max<sum){
            max=sum;
            sw[]

        }
    }
    }
    

    }
    System.out.println(max);
}
}

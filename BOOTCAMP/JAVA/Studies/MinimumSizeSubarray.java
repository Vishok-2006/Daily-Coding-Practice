package Studies;


import java.util.Scanner;

public class MinimumSizeSubarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int[] arr=new int[t-1];
        for(int i=0;i<t-1;i++){
            arr[i]=sc.nextInt();
        }
        int n=minSubArrayLen(t,arr);
        System.out.println(n);
        sc.close();
    }

    public static int minSubArrayLen(int t, int[] arr) {
       for(int i=arr.length-1;i>=0;i--){
        int sum=0;
        int c=0;
        for(int j=i;j>=0;j--){
              sum+=arr[j];
              c++;
              if(sum>=t) return c;
        }
       }
       return 0;
    }
}


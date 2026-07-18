package Studies;
 import java.util.*;
public class SubArrayInBinary {
   

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       sc.close();
        for(int i=0;i<n;i++){
            int i0=0;
        int i1=0;
            for(int j=i;j<=n;j++){
                if(arr[j]==0) i0++;
                else i1++;
                if(i0==2 &&i1==2){
                    System.out.print(i+" to "+j);
                    return;
                }
                else if(i0==1 && i1==3){
                    i1=1;
                }
            }
        }
        System.out.print("No such subarray");
    }
}


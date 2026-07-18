import java.util.*;
public class SelfDestructiveNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);


        String str=sc.nextLine();
    //    boolean t=true;
   sc.close();
            int n=Integer.parseInt(str);
     

// ========================================================================

//                   USING INTEGER

// ========================================================================


        // int n=sc.nextInt();
         int sum=0;
        int c=0;
        while(n!=0){
            int r=n%10;
            sum+=r;
            c++;
            n=n/10;
        }
         System.out.println(sum);
            System.out.println(c);
// ======================================================================

//                     USING ARRAYS

// ======================================================================

        // int[] arr=new int[n];
       
        // for(int i=0;i<n;i++){
        //    arr[i]=sc.nextInt();
        // }
        // for(int i=0;i<n;i++){
        //     if(arr[i]<=n){
        //         sum+=arr[i];
        //         c++;
        //     }
        // }
        if(sum==c){
            System.out.println("Self Destructive Number");
        } else {
            System.out.println("Not a Self Destructive Number");
        }
    }
}
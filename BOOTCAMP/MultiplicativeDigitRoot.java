import java.util.*;
public class MultiplicativeDigitRoot {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int res=0;
        int t=n;
        while(n>9){
          int mul=1;
        
        while(n>0){
              int r=n%10;
            mul*=r;
            n/=10;
            
        }
           res++;
                n=mul;
                
            
        
    }
        System.out.print(n);
    }
}

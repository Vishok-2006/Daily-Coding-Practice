import java.util.*;
public class MultiplicativeDigitRoot {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>9){
          int mul=1;
        
        while(n>0){
              int r=n%10;
            mul*=r;
            n/=10;
            
        }    
                n=mul;
  
    }
    sc.close();
        System.out.print(n);
    }
}

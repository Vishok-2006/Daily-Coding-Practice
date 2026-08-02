package Practice;
import java.util.*;
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("The Count Is :"+Count(n));
        sc.close();
  }
    public static int Count(int n){
           if(n==0){
           return 0;
           }
           return 1+Count(n/10);
    }
}

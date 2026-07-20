// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class kilogram {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int y=sc.nextInt();
       int n=out(y);
       System.out.println(n);
       sc.close();
    }
    
    public static int out( int y){
         Set<Integer> l=new HashSet<>();
       l.add(0);
       for(int i=0;i<y;i++){
           Set<Integer> t=new HashSet<>();
           for(int k:l){
               t.add(k+3);
               t.add(k*2);
           }
           l=t;
       }
       return l.size();
    
    }
}
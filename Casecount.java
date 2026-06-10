 import java.util.*;
public class Casecount {
   

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
       int t=0;
       
       char [] a=str.toCharArray();
       for(int i=0;i<str.length()-1;i++){
           if(Character.isUpperCase(a[i])&& Character.isLowerCase(a[i+1]) || Character.isLowerCase(a[i])&& Character .isUpperCase(a[i+1])){
               t++;
           }
       }
       
       System.out.println(t);
   sc.close();
    }
}


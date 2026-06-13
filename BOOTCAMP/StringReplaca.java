import java.util.*;
public class StringReplaca {
   public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String sub = sc.nextLine();
    int count= (s.length() - s.replaceAll(sub, "").length())/sub.length();
    System.out.println(count);
    System.out.println(s.replaceAll(sub, ""));
    
}    
}

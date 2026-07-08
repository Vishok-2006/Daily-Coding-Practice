import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Isisomaorphic {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        boolean b=isIsomorphic(s,t);
        System.out.print(b);
    }
   
    public static boolean isIsomorphic(String s, String t) {
        Set<Character> s1=new HashSet<>();
        Set<Character> s2 =new HashSet<>();
        for(char c: s.toCharArray()){
            s1.add(c);
        }
        for(char c: t.toCharArray()){
            s2.add(c);
        }
        if(s1.size()==s2.size()) return true;
        else return false;
    }
}


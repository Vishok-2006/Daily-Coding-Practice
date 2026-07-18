package Studies;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ValidAnagram {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        boolean b=isAnagram(s,t);
        System.out.print(b);
        sc.close();
    }
    
    public static boolean isAnagram(String s, String t) {
        Map<Character,Integer> m1=new HashMap<>();
        Map<Character,Integer> m2=new HashMap<>();
        if(s.length()!=t.length()) return false;
        for(char c: s.toCharArray()){
            m1.put(c,m1.getOrDefault(c,0)+1);
        }
        for(char c: t.toCharArray()){
            m2.put(c,m2.getOrDefault(c,0)+1);
        }
        for(char c: s.toCharArray()){
            if(m1.get(c)!=m2.get(c)){
                return false;
            }
        }
           return true;
    }
}


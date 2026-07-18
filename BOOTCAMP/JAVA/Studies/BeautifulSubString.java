package Studies;

import java.util.*;

public class BeautifulSubString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        int count=0;
         sc.close();
        for(int i=0;i<n;i++){
            Map<Character,Integer> m=new HashMap<>();
            Set<Character> st=new HashSet<>();
               for(int j=i;j<n;j++){
                   char c=s.charAt(j);
                   st.add(c);
                   m.put(c,m.getOrDefault(c,0)+1);
            }
            boolean t=true; 
            for(int j=i;j<n-1;j++){
                t=true;
                 if (m.get(s.charAt(j)) != m.get(s.charAt(j+1)) || !st.contains(s.charAt(j))){
                     t=false;
                     break;
              }
          }
          if(t) count++;
        }
        System.out.println(count);
    }
}

import java.util.HashMap;
import java.util.Map;

public class MaximumNumberOfBallons {
    public static void main(String[] args) {
        String s="loonbalxballpoon";
        int n= maxNumberOfBalloons(s);
        System.out.print(n);

    }
    
    public static int maxNumberOfBalloons(String text) {
        
        char[] ch =text.toCharArray();
        
        Map<Character,Integer> m=new HashMap<>();
        for(int i=0;i<ch.length;i++){
            m.put(ch[i],m.getOrDefault(ch[i],0)+1);
        }
         int b = m.getOrDefault('b', 0);
        int a = m.getOrDefault('a', 0);
        int l = m.getOrDefault('l', 0) / 2;
        int o = m.getOrDefault('o', 0) / 2;
        int n = m.getOrDefault('n', 0);

        return Math.min(Math.min(Math.min(b, a), Math.min(l, o)), n);

    }
}


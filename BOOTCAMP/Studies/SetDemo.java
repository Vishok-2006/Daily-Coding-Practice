package Studies;
import java.util.*;
public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> s=new LinkedHashSet<>();
        s.add(10);
        s.add(90);
        s.add(40);
        s.add(60);
        s.add(50);
        System.out.println(s);
        for(int i:s){
            System.out.println(i);
        }
    }
}

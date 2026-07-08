package Studies;
import java.util.*;
public class ArrayListdemo {
    public static void main(String[] args){
        List<String> l = new ArrayList<>();
        List<String> l2 = new ArrayList<>();
        l.add("Hello");
        l.add("World");
        l.add("Java");
        System.out.println(l);
        l.add(2, "Code");
        l.set(3,"python");
        // l.remove(3);
        // l.clear();
        l2.addAll(l);


        System.out.println(l2);


        System.out.println(l);

        l2.remove("Code");
        l.retainAll(l2);
        List<Integer> l3 = new ArrayList<>();
        l3.add(5);
        l3.add(2);
        l3.add(8);
        l3.add(1);
        System.out.println(l3);
        l3.sort(null);

        System.out.println(l3.contains(2));




    }
}

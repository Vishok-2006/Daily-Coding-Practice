
import java.util.*;


public class LinkedListCmpare{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        Map<Integer,Integer> m=new HashMap<>();
        int t=2;
        
        for(int i=0;i<n;i++){
            
             if(i==t){
                t+=2;
                int a=sc.nextInt();
                continue;
             }
             l1.add(sc.nextInt());
            m.put(l1.get(i),m.getOrDefault(l1.get(i),0)+1);
        }
        int m2 = sc.nextInt();
        for(int i=0;i<m2;i++){
            l2.add(sc.nextInt());
            m.put(l2.get(i),m.getOrDefault(l2.get(i),0)+1);
        }
        System.out.println("First linked lists:");
        for(int i=0;i<l1.size();i++){
            int l = l1.get(i);
            System.out.print(l+" ");
        }
        System.out.println();
        System.out.println("Common element in the linked lists:");
        for(int i=0;i<l2.size();i++){
            if(m.get(l2.get(i))>1){
                System.out.print(l2.get(i)+" ");
            }
        }
    }
}
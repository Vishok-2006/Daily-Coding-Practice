import java.util.*;

public class SubSet {
    public static void main(String[] args) {
   
        int[] num={1,2,3,};
       
        System.out.println( subsets(num));

       
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
       
        res.add(new ArrayList<>());
        for(int i: nums){
            int size=res.size();
            for(int j=0;j<size;j++){
                List<Integer> s=new ArrayList<>(res.get(j));
                s.add(i);
                res.add(s);
            }
            
        
        }
        return res;
    }
    
     
     

}


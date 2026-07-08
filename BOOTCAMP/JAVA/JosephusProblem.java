import java.util.*;
public class JosephusProblem {
    public static void main(String[] args) {
       
// =======================================================================

//                 USING FORMULA

// =========================================================================


        int n=7;
        int k=3;
        int ans=0;
        for(int i=2;i<=n;i++){
            ans=(ans+k)%i;
        }
        System.out.println(ans+1);

// =========================================================================

//                 USING LIST

// =========================================================================

        List<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(i+1);
        }
        int i=0;
        while(l.size()>1){
               i=(i+k-1)%l.size();
               l.remove(i);
        }
           System.out.println(l.get(0));

        

















    }
}

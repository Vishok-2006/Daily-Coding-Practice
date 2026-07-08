import java.util.Arrays;
public class MaximumIceCreamBars {
    public static void main(String[] args) {
       int coins=56;
         int[] c={7,3,3,6,6,6,10,5,9,2};
        int n=sums(c,coins);
        System.out.println(n);
    }
    public static int sums(int[] c,int coins){
        int sum=0;
        int count=0;
         Arrays.sort(c);
        if(c[0]>coins) return 0;
        for(int i=0;i<c.length;i++){
             
                count=0;
                sum=0;
            for(int j=0;j<c.length;j++){
                sum+=c[j];
                
                if(sum>coins){
                    sum-=c[j];
                    return count;
                }
                count++;
            }
            if(sum==coins|| i==c.length-1){
                 break;
            }
        }
        return count;
    }
    public static int numbs(int[] c,int coins){
          return coins;
    }
}


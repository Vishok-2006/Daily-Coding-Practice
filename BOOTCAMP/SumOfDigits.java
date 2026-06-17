public class SumOfDigits {
    public static void main(String[] args){
        int n=197;
        int m=3;
        int [] arr=new int[3];
        int t=n;
        
        int res = 0;
        int i=0;
        while(n>0){
            int rem = n%10;
            arr[i]=rem;
            n/=10;
            i++;
        }

        
        }
    }
}
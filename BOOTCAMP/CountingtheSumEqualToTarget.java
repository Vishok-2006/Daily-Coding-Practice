public class CountingtheSumEqualToTarget {

    
    public static void main(String[] args) {
    
        int[] arr={0,1,0,1,0,1};
        int count0=0;
        int count1=0;
        int c=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[j]==0){
                    count0++;
                }
                else{
                    count1++;
                }
            }
            if(count0==count1) c+=2;
            if(max<c) max=c;
        }
        System.out.print(max);
    
    
    }
}
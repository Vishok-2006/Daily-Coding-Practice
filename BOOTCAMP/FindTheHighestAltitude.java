public class FindTheHighestAltitude {
    public static void main(String[] args) {
        int[] g = {-5, 1, 5, 0, -7};
          int n=g.length;
        int[] arr=new int[n+1];
        arr[0]=0;
        int max=Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
             arr[i+1]=g[i]+g[i-1];
             if(arr[i+1]>max) max=arr[i];
                 
            }
          System.out.println(max);
    }
}

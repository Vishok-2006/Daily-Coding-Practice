import java.util.*;
public class TimeNeedToBuyTickets {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int time =0;
        for(int i=0;i<arr.length;i++){
            if(i<=k){
                time+=Math.min(arr[i],arr[k]);
            }
            else{
                time+=Math.min(arr[i],arr[k]-1);
            }


        }
        System.out.println(time);















        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            q.offer(i);

        }
        
        while(!q.isEmpty()){
              time++;
              int i=q.poll();
              arr[i]--;
              if(arr[i]>0){
                q.offer(i);
              }
                if(i==k&& arr[i]==0){
                    System.out.println(time);
                    
                }
              }
        
        System.out.println(time);
    }
}

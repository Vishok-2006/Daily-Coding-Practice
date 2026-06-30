import java.util.*;

public class MatrixMultiplication{
   public static void main(String[] args){




 Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[m*n];
        int[][] num=new int[m][n];
        int b=0;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                num[i-1][j-1]=i*j;
                arr[b]=i*j;
                b++;
            
        }
    }
    for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(num[i][j]+" ");
            
        }
        System.out.println();
    }
    Arrays.sort(arr);
        System.out.println(arr[k-1]);

    }
}
import java.util.*;
public class ZigZag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int n = sc.nextInt();
        StringBuilder[] sb = new StringBuilder[n];
        for(int i=0;i<n;i++){
            sb[i]=new StringBuilder();
        }
        int cr=0;
        boolean m=false;
        
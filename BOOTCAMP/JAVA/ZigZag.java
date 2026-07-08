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
        for(char c: s.toCharArray()){
            sb[cr].append(c);
            if(cr==0 || cr==n-1){
                m= !m;
            }
            if(m){
                cr++;
            }
            else{
                cr--;
            }

        }
        StringBuilder ans = new StringBuilder();
        for(StringBuilder s1: sb){
            ans.append(s1);

        }
        System.out.print(ans);

    }
}

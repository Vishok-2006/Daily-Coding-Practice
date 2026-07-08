import java.util.Scanner;
public class CountAndSay {
    

    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "1";
         int n=sc.nextInt();
        for (int i = 2; i <= n; i++) {
            StringBuilder sb = new StringBuilder();

            int count = 1;

            for (int j = 1; j <= s.length(); j++) {

                if (j < s.length() && s.charAt(j) == s.charAt(j - 1)) {
                    count++;
                } else {
                    sb.append(count);
                    sb.append(s.charAt(j - 1));
                    count = 1;
                }
            }

            s = sb.toString();
        }
         sc.close();
        System.out.print(s);
    }
}
import java.util.*;
class PermutationinString {
           
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        boolean t=checkInclusion(s1, s2);
        System.out.println(t);
         sc.close();
    }
   
    public static boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] need = new int[26];
        int[] window = new int[26];

        for (char c : s1.toCharArray()) {
            need[c - 'a']++;
        }

        int k = s1.length();

        for (int i = 0; i < s2.length(); i++) {

            window[s2.charAt(i) - 'a']++;

            if (i >= k) {
                window[s2.charAt(i - k) - 'a']--;
            }

            if (Arrays.equals(need, window)) {
                return true;
            }
        }

        return false;
    }
}
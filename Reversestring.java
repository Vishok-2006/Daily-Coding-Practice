public class Reversestring {
    public static void main(String[] args) {
        String s="abcabc";
        int n=s.length();
        int t=0;
        for (int i=0;i<n;i++){
             if(s.charAt(i)!=s.charAt(n/2)-1-i) t++;
             if(s.charAt(n/2)+i!=s.charAt(n-1)-i) t++;
              break;

        }
        System.out.println(t);
    }
}


//Question 1 - 

//  String s="abcaba";

    //  int n=s.length();

    //  int ops=0;

    //  for(int i=0;i<n/4;i++)

    //  {

    //      if(s.charAt(i)!=s.charAt(n/2-1-i)) ops++;

    //      if(s.charAt(n/2+i)!=s.charAt(n-1-i)) ops++;

    //  }

    //  System.out.println(ops);





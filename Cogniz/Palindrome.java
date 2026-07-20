public class Palindrome {
    public static void main(String[] args) {
        String s="122321";
        int n=s.length();
        boolean t=false;
        for(int i=0;i<n;i++){
            if(s.charAt(i)==s.charAt(n-1)){
                t=true;
                n--;
            }
            else{
                t=false;
                break;
            }
        }
        if(t==true){
            System.out.println("Palindrome");
        }
        else System.out.println("not");
    }
}

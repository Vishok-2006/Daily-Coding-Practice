import java.util.*;

public class Technical1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("the key: ");
        String a=sc.nextLine();
           System.out.println("the sentence: ");
        String s=sc.nextLine();
        String str[]=s.split(" ");
        int count=0;
        for(String w : str){
            boolean t=true;
            for(char c: w.toCharArray()){
                if(a.indexOf(c)!=-1){
                    continue;
                }
                else{
                    t=false;
                    break;
                }

            }
            if(t){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }    
}

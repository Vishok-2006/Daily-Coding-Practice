
import java.util.*;
public class ValidParentheses{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        sc.close();
        Stack<Character> res=new Stack<>();
        for(char c: s.toCharArray()){
            if(c=='('|| c=='['  || c=='{'){
                res.push(c);
            }
            else{
                if(res.isEmpty()){
                    System.out.println("false");
                   return;
                }
                else{
                    char t=res.pop();
                    if((c==')'&& t!='(')||( c==']' && t!='[') ||( c=='}' && t!='{')){
                        System.out.println("false");
                        return;
                }
            }
        }
        
    }
    System.out.println(res.isEmpty());
   
}
}

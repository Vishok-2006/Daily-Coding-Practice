package Studies;
import java.util.*;
public class LicenseKeyFormatting {


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int  k=sc.nextInt();
        // String[] arr=s.split("-");
        StringBuilder sb=new StringBuilder();
        // StringBuilder str=new StringBuilder();
        
        // for(String i:arr){
        //     if(i==arr[0]) {
        //         sb.append(i+"-");
            
        //     }
        //     else{
        //     if(i.length()==k){
        //         sb.append(i.toUpperCase());
        //         sb.append("-");
        //     }
        //     else{
        //         str.append(i);
        //         if(str.toString().length()==k){
        //             sb.append(str.toString().toUpperCase());
        //         }
        //     }
        //     }
        // }
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            char ch =s.charAt(i);
            if(ch=='-') continue;
            if(count==k){
                sb.append("-");
                count=0;
            }
            
                sb.append(Character.toUpperCase(ch));
                count++;
            

        }

        System.out.print(sb.reverse().toString());
    }
}


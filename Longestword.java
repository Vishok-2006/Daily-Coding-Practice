
public class Longestword {
    public static void main(String[] args) {
        String s="Apple Banana orange umberlla orangefactorys";
        String [] str=s.split(" ");
        String res="00";
        String l =new String();
        for(String i: str ){
            if("aeiouAEIOU".contains(String.valueOf(i.charAt(0)))){
                if(i.length()%2==0){
                    l=i;
                    
                }
                if (l.length()>res.length()) {
                    res=l;
                }

            }
        }
        System.out.println(res);
    }
}


// import java.util.Scanner;

// public class Main

// {

// 	public static void main(String[] args) {

// 		Scanner sc = new Scanner(System.in);

		

// 		String s = sc.nextLine();

		

// 		String [] arr = s.split("\\s+");

		

// 		String ans = "00";

		

// 		for(int i=0;i<arr.length;i++){

// 		    if("aeiouAEIOU".indexOf(arr[i].charAt(0)) != -1){

// 		        if(arr[i].length() %2 == 0 && arr[i].length() > ans.length()){

// 		            ans = arr[i];

// 		        }

// 		    }

// 		}

// 		System.out.print(ans);

// 	}

// }





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


public class Changoingstring {
    public static void main(String[] args) {
        String s="ABC120PME0000LZ3MB1Y3C45";
        StringBuilder alp=new StringBuilder();
        StringBuilder num=new StringBuilder();
        alp.append(s.charAt(0));
        int l=s.length();
        for (int i=1;i<l-1;i++){
            if(Character.isLetter(s.charAt(i)) && Character.isDigit(s.charAt(i+1))){
                  num.append(s.charAt(i+1));
            }
            if(Character.isLetter(s.charAt(i))&&Character.isDigit(s.charAt(i-1))){
                alp.append(s.charAt(i));
            }
        } 
        StringBuilder res =new StringBuilder();
          res.append(alp);
           res.append(num);
          System.out.println(res.toString());
    }
}


//question 2 - 

// String s = "ABC120PME0000LZ3MB1Y3C45";

//      StringBuilder letters = new StringBuilder();

//      StringBuilder digits = new StringBuilder();

//      char ch = s.charAt(0);

//      if(Character.isLetter(ch))

//      {

//          letters.append(ch);

//      }

//      else{

//          digits.append(ch);

//      }

//      for(int i=1;i<s.length();i++)

//      {

//          if(Character.isLetter(s.charAt(i))!=Character.isLetter(s.charAt(i-1)))

//          {

//              ch=s.charAt(i);

//              if(Character.isLetter(ch))

//              {

//                  letters.append(ch);

//              }

//              else{

//                  digits.append(ch);

//              }

//          }

//      }

        

//     System.out.println(letters.toString()+digits.toString());





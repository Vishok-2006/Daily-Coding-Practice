class Sentence {

    public static void main(String[] args) {

       String s = "hello     world. java is fun. i love   programming in java.";

       String[] sent = s.split("\\.");

       StringBuilder res = new StringBuilder();

       for(String se : sent)

       {

           se=se.trim();

           if(se.isEmpty())

           {

               continue;

           }

           String[] words = se.split("\\s+ ");

           if(words.length<5)

           {

               for(int i=words.length-1;i>=0;i--)

               {

                   if(i==words.length-1)

                   {

                       res.append(words[i].toUpperCase());

                   }

                   else{

                       res.append(words[i]);

                   }

               }

           }

           else{

               words[0]=Character.toUpperCase(words[0].charAt(0))+

               words[0].substring(1);

               for(int i=0;i<words.length;i++)

               {

                   if(i<words.length-1)

                   {

                       res.append(" ");

                   }

               }

               res.append(" ");

           }

           System.out.println(res.toString());

       }

    }

}





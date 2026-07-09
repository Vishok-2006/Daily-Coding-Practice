using System.Text;
class VowelString{
    public static void Vowels( ){
                  string[] str={"Apple","orange","mango"};
                  StringBuilder sb=new StringBuilder();
                  string s="aeiouAEIUO";
                  foreach(String i in str){
                      int l=i.Length-1;
                       if(s.Contains(i[0].ToString()) && s.Contains(i[l].ToString())) sb.Append(i);
                  }
                  if(sb.ToString().Length ==0)
        {
            Console.WriteLine( "no matches found");
            return;
        }
                    Console.WriteLine( sb.ToString().ToLower());
    }
}
using System.Text;

class UniqueDigitCount{
    public static void Unique(){
        string s=Console.ReadLine()!;
        StringBuilder sb=new StringBuilder();
        int c=0;
        for(int i=0;i<s.Length;i++){
            if(!sb.ToString().Contains(s[i])){
                sb.Append(s[i]);
                c++;
            }
        }
        Console.WriteLine(c);
    }
}
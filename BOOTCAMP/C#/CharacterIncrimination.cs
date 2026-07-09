class CharacterIncrimination{
    public static void Incrimination(){
        string s=Console.ReadLine()!;
        char[] c=s.ToCharArray();
        for(int i=0;i<c.Length;i++){
            c[i]=(char)(c[i]+1);
            Console.Write(c[i]);
        }
        Console.WriteLine();
    }
}
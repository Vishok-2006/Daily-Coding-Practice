class CaseCount{
    public static void Count()
    {
        string s =Console.ReadLine()!;
        int u=0;
        int l=0;
       for(int i = 0; i < s.Length; i++)
        {
            if (Char.IsUpper(s[i]))
            {
                u++;
            }
            else
            {
                l++;
            }
        }
       Console.WriteLine(u);
       Console.WriteLine(l);
    }
}
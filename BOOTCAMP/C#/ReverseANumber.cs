class ReverseANumber{
    public static void Reverse()
    {
        Int64 n=Convert.ToInt64(Console.ReadLine());
        Int64 s=0;
        while (n > 0)
        {
            Int64 r=n%10;
            s+=r;
            s*=10;
            n/=10;
        }
        Console.WriteLine(s/10);
    }
}
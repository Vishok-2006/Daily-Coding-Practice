class MultiplicationTable
{
    public static void Multiply()
    {
        int n=Convert.ToInt32(Console.ReadLine());
        for(int i = 0; i < 10; i++)
        {
            Console.WriteLine(i+" X "+n+" = "+n*i);
        }
    }
}
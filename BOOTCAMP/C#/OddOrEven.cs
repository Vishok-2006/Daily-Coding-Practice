class OddOrEven
{
    public static void Odd()
    {
        int n=Convert.ToInt32(Console.ReadLine());

        if (n % 2 == 0)
        {
            Console.WriteLine("It is a Even Number.");
        }
        else
        {
            Console.WriteLine("It is a Odd Number.");
        }
    }
}
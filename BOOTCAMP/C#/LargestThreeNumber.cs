class LargestThreeNumbers
{
    public static void LargestNumber()
    {
        int a=Convert.ToInt32(Console.ReadLine());
        int b=Convert.ToInt32(Console.ReadLine());
        int c=Convert.ToInt32(Console.ReadLine());
       
        int max=new[] {a,b,c}.Max();
        Console.WriteLine("The Largest Number is: "+ max);
         

        // if(a > b && a > c)
        // {
        //     Console.WriteLine(a);
        // }
        // else if(b > a && b>c){
        //     Console.WriteLine(b);
        // }
        // else{
        //     Console.WriteLine(c);
        // }
        
    }
}
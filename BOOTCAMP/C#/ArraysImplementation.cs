using System;
class ArraysImplementation
{
    public static void ArrayImplementation()
    {
        int[] arr={13,25,43,69,57};
        int t=Convert.ToInt32(Console.ReadLine());
        Array.Sort(arr);

        for(int i = 0; i < arr.Length; i++)
        {
            if(arr[i]==t){
            Console.WriteLine("Found in " +i);
            return;
            }
        }
        
        Console.WriteLine(" Not found ");
        
    }
}
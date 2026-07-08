class CopingArray
{
    public static void Coping()
    {
        int n=Convert.ToInt32(Console.ReadLine());
        int[] arr=new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i]=Convert.ToInt32(Console.ReadLine());
        }
        int[] res=arr;
        for(int i = 0; i < n; i++)
        {
            Console.Write(res[i]+" ");
        }
    }
}
class CopingArray
{
    public static void Coping()
    {
        int n=Convert.ToInt32(Console.ReadLine());
        int[] arr=new int[n];
        int [] res=new int[n/2];
        for(int i = 0; i < n; i++)
        {
            arr[i]=Convert.ToInt32(Console.ReadLine());
        }
        Array.Copy(arr,res,n/2);
        for(int i = 0; i < res.Length; i++)
        {
            Console.Write(res[i]+" ");
        }
        Console.WriteLine();
    }
}
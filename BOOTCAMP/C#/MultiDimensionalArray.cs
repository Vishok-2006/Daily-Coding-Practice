class MultiDimensionalArray
{
    public static void DimensionalArray()
    {
        int r=Convert.ToInt32(Console.ReadLine());
        int c=Convert.ToInt32(Console.ReadLine());
        int [,] arr=new int[r,c];
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                arr[i,j]=Convert.ToInt32(Console.ReadLine());
            }
        }
     
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
               Console.Write(arr[i,j]+" ");
            }
            Console.WriteLine();
        }
    }
}
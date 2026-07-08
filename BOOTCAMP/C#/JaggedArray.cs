class JaggedArray
{
    public static void Jagged()
    {   int r=Convert.ToInt32(Console.ReadLine());
        int[][] arr=new int[r][];
        for(int i = 0; i < r; i++)
        {
            int c=Convert.ToInt32(Console.ReadLine());
            arr[i]=new int[c];
        }
        for(int i = 0; i<arr.Length; i++)
        {
            for(int j = 0; j < arr[i].Length; j++)
            {
                arr[i][j]=Convert.ToInt32(Console.ReadLine());
            }
            
        }
        for(int i = 0; i<arr.Length; i++)
        {
            for(int j = 0; j < arr[i].Length; j++)
            {
                Console.Write(arr[i][j]+" ");
            }
            Console.WriteLine();
        }
    }
}
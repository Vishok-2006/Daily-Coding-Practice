class FibonacciSeries{
    public static void Series(){
        int n=Convert.ToInt32(Console.ReadLine());
        int a=0;
        int b=1;
        for(int i=1;i<n;i++){
             
            int t=a;
            a=b;
             b=t+b;
        }
        Console.Write((a)+" ");
    }
}
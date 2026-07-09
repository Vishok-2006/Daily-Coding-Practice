class PrimeCount{
    public static void Prime(){
        int n=Convert.ToInt32(Console.ReadLine());
        int[] arr=new int[n];
        int c=0;
        for(int i=0;i<n;i++){
            arr[i]=Convert.ToInt32(Console.ReadLine());
             bool p=true;
            for(int j=2;j<(arr[i]/2);j++){
                if(arr[i]%j==0) p=false;
            }
            if(p) c++; 
        }
        Console.WriteLine(c);


    }
}
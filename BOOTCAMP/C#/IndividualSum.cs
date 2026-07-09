using System.Text;
 
class IndividualSum
{
    public static void Individual()
    {
        int a =3521;
        int b=2452;
        int c=1352;
    
        int[] key=new int[4];
        foreach(int i in new[] { a, b, c })
        {      int t=i;
            for(int j = 0; j < 4; j++)
            {
                int r=t%10;
                if(key[j]<r)
                {
                    key[j]=r;
                }
                t/=10;
            }
        }
        Array.Reverse(key);
        StringBuilder sb =new StringBuilder();
        for(int i = 0; i < 4; i++)
        {
            sb.Append(key[i]);
        }
        Console.WriteLine(sb.ToString());
    }
}
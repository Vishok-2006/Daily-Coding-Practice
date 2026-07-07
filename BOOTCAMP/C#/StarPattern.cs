class StarPattern
{
    public static void Star()
    {
        int n=Convert.ToInt32(Console.ReadLine());
        

//             *
//            * * 
//           * * * 
//          * * * * 
//         * * * * * 

Console.WriteLine();
int t =n-1;
for(int i = 0; i < n; i++)
        {
            for(int j =0;j<n; j++)
            {
                if (j >= t)
                {
                    Console.Write("* ");
                 
                }
                else
                {
                    Console.Write(" ");
                }
            }
               t--;
            Console.WriteLine();
        }        






//       *****
//       *****
//       *****
//       *****
//       *****

  Console.WriteLine();      
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                Console.Write("* ");
            }
            Console.WriteLine();
        }

//             *
//             **
//             ***
//             ****
//             *****

Console.WriteLine();
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j <= i; j++)
            {
                Console.Write("* ");
            }
            Console.WriteLine();
        }

//           *****
//           ****
//           ***
//           **
//           *

 Console.WriteLine();
        for(int i = n-1; i >=0; i--)
        {
            for(int j = 0; j <= i; j++)
            {
                Console.Write("* ");
            }
            Console.WriteLine();
        }
    }
}
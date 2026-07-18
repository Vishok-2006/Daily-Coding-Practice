using System.Collections;

class ArrayListDemo
{
    public static void Listed()
    {
        ArrayList arr=new ArrayList();
        arr.Add(23);
        arr.Add(24);
        arr.Add(28);
        arr.Add(23);
        arr.Add(245);
        arr.Add(2157);
        arr.Add(23548);
        arr.Add(2389);
        arr.Add(2157);
        arr.Add(2364);
        arr.Add(29874);
        arr.Add(21567);
        arr.Add(21547);
        arr.Add(21648);
        arr.Add(26485);
        arr.Add(245544);  
        arr.Add(21456);    


        Console.WriteLine($"Count - {arr.Count}");

        Console.WriteLine($"Capacity - {arr.Capacity}");



      //  arr.RemoveAt(8);
     //   arr.Remove(23);
     //   arr.RemoveRange(2,7);
     //   arr.Clear();

    //   foreach(var e in arr)
    //     {
    //         Console.Write(e+" ");
    //     }

        //   arr.Sort();
        //   Console.WriteLine();
        //    foreach(var e in arr)
        // {
        //     Console.Write(e+" ");
        // }
        // Console.WriteLine();



        //        arr.Reverse();
        //   Console.WriteLine();
        //    foreach(var e in arr)
        // {
        //     Console.Write(e+" ");
        // }
        // Console.WriteLine();

  //       Console.WriteLine(arr.Contains(23));

    //      arr.TrimToSize();








        Console.WriteLine($"Count - {arr.Count}");

        
        Console.WriteLine($"Capacity - {arr.Capacity}");

    }
}
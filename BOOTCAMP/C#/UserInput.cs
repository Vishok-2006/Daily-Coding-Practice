class UserInputs{
    static void UserInput()
    {
       string name=Console.ReadLine()!;
       Console.WriteLine($"This is my Name : {name}");
       Console.WriteLine(name.Length);
       Console.WriteLine(name.ToUpper());
       Console.WriteLine(name.ToLower());
       Console.WriteLine(name[3]);

    //   int a =Convert.ToInt32(Console.ReadLine());
    //   int b = Convert.ToInt32(Console.ReadLine());

    //   Console.WriteLine(Math.Max(a,b));

    // char c=Convert.ToChar(Console.Read());
    // Console.WriteLine(c);


    }
}
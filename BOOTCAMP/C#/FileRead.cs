using System;
using System.IO;

class FileRead
{
   public static void Reader()
    {
        string path = "student.txt";

        File.WriteAllText(path, "Name: Vishok\nDepartment: CSE");

        string data = File.ReadAllText(path);

        Console.WriteLine(data);
    }
}
using System;

namespace pattern
{
    class MainClass
    {
        public static void Main(string[] args)
        {
           for(var i = 0; i <= 4; i++)
            {
                for(var j = 0; j <= i; j++)
                {
                    Console.Write("*");
                }
                Console.WriteLine();
            }
        }
    }
}

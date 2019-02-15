using System;
using System.Collections.Generic;
using System.Text;

namespace Question1
{
    public class Fruit : Food
    {
        public override void serveFood()
        {
            Console.WriteLine("I'm serving Fruit");
        }
    }
}

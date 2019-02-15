using System;
using System.Collections.Generic;
using System.Text;

namespace Question1
{
    public class Food
    {
        public virtual void serveFood() { }

        public Type getSuperclass() { return typeof(Food); }
    }
}

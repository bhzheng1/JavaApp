using System;
using System.Collections.Generic;
using System.Text;

namespace Question1
{
    public class FoodFactory
    {
        public Food getFood(string foodName)
        {
            switch (foodName)
            {
                case "FastFood":
                    return new FastFood();
                case "Fruit":
                    return new Fruit();
                default:
                    return null;
            }
        }
    }
}

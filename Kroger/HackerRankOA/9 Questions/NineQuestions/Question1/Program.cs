using System;

namespace Question1
{
    class Program
    {
        static void Main(string[] args)
        {
            FoodFactory myFoods = new FoodFactory();
            Food food1 = myFoods.getFood("FastFood");
            Food food2 = myFoods.getFood("Fruit");
            Console.WriteLine("My name is: " + food1.GetType().Name);
            Console.WriteLine("My name is: " + food2.GetType().Name);
            Console.WriteLine("Our superclass is: " + food1.getSuperclass().Name);

            food1.serveFood();
            food2.serveFood();

            Console.ReadKey();
        }
    }
}

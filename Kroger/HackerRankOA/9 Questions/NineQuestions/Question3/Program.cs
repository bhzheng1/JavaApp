using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace Question3
{
    class Program
    {
        static List<string> Days = new List<string>();
        static List<string> Months = new List<string>();
        //static Regex Re = new Regex(@"\d+");


        static void Main(string[] args)
        {
            Days.AddRange(new string[] { "1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th", "9th", "10th",
            "11th", "12th", "13th", "14th", "15th", "16th", "17th", "18th", "19th", "20th", "21st", "22nd",
            "23rd", "24th", "25th", "26th", "27th", "28th", "29th", "30th", "31st"}.ToList());
            Months.AddRange(new string[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }.ToList());
            

            Console.WriteLine(DateFormater("20th Oct 2052"));

            Console.ReadKey();
        }

        public static string DateFormater(string rawDate)
        {
            string[] splitDate = rawDate.Split(' ');
            //Match m = Re.Match(splitDate[0]);
            //return $"{splitDate[2]}-{Months.IndexOf(splitDate[1]) + 1}-{m.Value}";
            return $"{splitDate[2]}-{Months.IndexOf(splitDate[1]) + 1}-{Days.IndexOf(splitDate[0]) + 1}";
        }
    }
}

using System;
using System.Collections.Generic;
using System.Linq;

namespace Question4
{
    class Program
    {
        static void Main(string[] args)
        {
            List<Employee> EmployeeList = new List<Employee>();
            List<Employee_Pan> EmployeePanList = new List<Employee_Pan>();

            List<Employee> younter = EmployeeList.Where(o => o.Age < 25).ToList();
            var joinedEmployee = younter.Join(EmployeePanList, x => x.ID, y => y.ID, (x, y) => new { x.Name, y.UIN }).ToList();

            joinedEmployee.ForEach(o => Console.WriteLine($"{o.Name}\t{o.UIN}"));

            Console.ReadKey();
        }
    }

    class Employee
    {
        public int ID { get; set; }

        public string Name { get; set; }

        public int Users { get; set; }

        public int Age { get; set; }

        public string Address { get; set; }

        public decimal Salary { get; set; }
    }

    class Employee_Pan
    {
        public int ID { get; set; }
        public int UIN { get; set; }
    }
}

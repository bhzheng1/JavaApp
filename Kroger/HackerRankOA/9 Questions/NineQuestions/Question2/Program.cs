using System;
using System.Collections.Generic;
using System.Linq;

namespace Question2
{
    class Program
    {
        static void Main(string[] args)
        {
            List<Order> ORDERS = Init();

            //LINQ
            List<Order> orderList = ORDERS.Where(o => o.STATUS != "Shipped").Take(5).ToList();
            orderList.ForEach(o => Console.WriteLine(o.ORDERNUMBER + "\t" + o.ORDERDATE.ToShortDateString() + "\t" +
                o.REQUIREDATE.ToShortDateString() + "\t" + o.SHIPPEDDATE.ToShortDateString() + "\t" + o.STATUS +
                "\t" + o.COMMENTS + "\t" + o.CUSTOMERNUMBER));

            //SQL Query
            /*
             * SELECT TOP(5) *
             * FROM ORDERS
             * WHERE STATUS != 'Shipped'
             */

            Console.ReadKey();
        }

        public static List<Order> Init()
        {
            List<Order> ORDERS = new List<Order>();
            ORDERS.Add(new Order
            {
                ORDERNUMBER = 10100,
                ORDERDATE = new DateTime(2003, 01, 06),
                REQUIREDATE = new DateTime(2003, 01, 13),
                SHIPPEDDATE = new DateTime(2003, 01, 10),
                STATUS = "Not Shipped",
                COMMENTS = "NULL",
                CUSTOMERNUMBER = 363
            });

            ORDERS.Add(new Order
            {
                ORDERNUMBER = 10101,
                ORDERDATE = new DateTime(2003, 01, 09),
                REQUIREDATE = new DateTime(2003, 01, 18),
                SHIPPEDDATE = new DateTime(2003, 01, 11),
                STATUS = "Not Shipped",
                COMMENTS = "NULL",
                CUSTOMERNUMBER = 128
            });

            ORDERS.Add(new Order
            {
                ORDERNUMBER = 10102,
                ORDERDATE = new DateTime(2003, 01, 10),
                REQUIREDATE = new DateTime(2003, 01, 18),
                SHIPPEDDATE = new DateTime(2003, 01, 14),
                STATUS = "In Transit",
                COMMENTS = "NULL",
                CUSTOMERNUMBER = 181
            });

            ORDERS.Add(new Order
            {
                ORDERNUMBER = 10103,
                ORDERDATE = new DateTime(2003, 01, 29),
                REQUIREDATE = new DateTime(2003, 02, 07),
                SHIPPEDDATE = new DateTime(2003, 02, 02),
                STATUS = "Not Shipped",
                COMMENTS = "NULL",
                CUSTOMERNUMBER = 121
            });

            ORDERS.Add(new Order
            {
                ORDERNUMBER = 10104,
                ORDERDATE = new DateTime(2003, 01, 31),
                REQUIREDATE = new DateTime(2003, 02, 09),
                SHIPPEDDATE = new DateTime(2003, 02, 01),
                STATUS = "Not Shipped",
                COMMENTS = "NULL",
                CUSTOMERNUMBER = 114
            });

            ORDERS.Add(new Order
            {
                ORDERNUMBER = 10106,
                ORDERDATE = new DateTime(2003, 02, 17),
                REQUIREDATE = new DateTime(2003, 02, 24),
                SHIPPEDDATE = new DateTime(2003, 02, 21),
                STATUS = "Not Shipped",
                COMMENTS = "NULL",
                CUSTOMERNUMBER = 278
            });


            ORDERS.Add(new Order
            {
                ORDERNUMBER = 10120,
                ORDERDATE = new DateTime(2003, 04, 29),
                REQUIREDATE = new DateTime(2003, 05, 08),
                SHIPPEDDATE = new DateTime(2003, 05, 01),
                STATUS = "Not Shipped",
                COMMENTS = "NULL",
                CUSTOMERNUMBER = 114
            });


            ORDERS.Add(new Order
            {
                ORDERNUMBER = 10122,
                ORDERDATE = new DateTime(2003, 05, 08),
                REQUIREDATE = new DateTime(2003, 05, 16),
                SHIPPEDDATE = new DateTime(2003, 05, 23),
                STATUS = "In Transit",
                COMMENTS = "NULL",
                CUSTOMERNUMBER = 350
            });


            ORDERS.Add(new Order
            {
                ORDERNUMBER = 10123,
                ORDERDATE = new DateTime(2003, 05, 20),
                REQUIREDATE = new DateTime(2003, 05, 29),
                SHIPPEDDATE = new DateTime(2003, 05, 22),
                STATUS = "Shipped",
                COMMENTS = "NULL",
                CUSTOMERNUMBER = 103
            });

            return ORDERS;
        }
    }
}

using System;
using System.Collections.Generic;
using System.Text;

namespace Question2
{
    public class Order
    {
        public int ORDERNUMBER { get; set; }
        public DateTime ORDERDATE { get; set; }
        public DateTime REQUIREDATE { get; set; }
        public DateTime SHIPPEDDATE { get; set; }
        public string STATUS { get; set; }
        public string COMMENTS { get; set; }
        public int CUSTOMERNUMBER { get; set; }
    }
}

class TestCode
{
    static String oneMultiple[] = { "Zero", "One", "Two", "Three", "Four","Five", "Six", "Seven", "Eight",
            "Nine", "Ten", "Eleven", "Twelve","Thirteen", "Fourteen", "Fifteen",
            "Sixteen", "Seventeen", "Eighteen","Nineteen" };


    static String tenMultiple[] = { "", "", "Twenty", "Thirty", "Forty","Fifty", "Sixty", "Seventy", "Eighty",
            "Ninety" };

    static String powerToWord(int n)
    {
        if (n<0)
        {
            return "minus "+powerToWord(-n);
        }

        if(n<20)
        {
            return oneMultiple[n];
        }
        if (n<100)
        {
            return tenMultiple[n/10]+((n%10!=0)?" ":"")+powerToWord(n%10);
        }
        if (n<1000)
        {
            return oneMultiple[n/100]+" Hundred And"+((n%100!=0)?" ":"")+powerToWord(n%100);
        }
        if(n<100000)
        {
            return powerToWord(n/1000)+" Thousand"+((n%1000!=0)?" ":"")+powerToWord(n%1000);
        }
        return powerToWord(n/100000)+" Lakh"+((n%100000!=0)?" ":"")+powerToWord(n%100000);
    }

}

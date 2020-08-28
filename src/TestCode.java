class TestCode
{
    static String oneMultiple[] = { "Zero", "One", "Two", "Three", "Four","Five", "Six", "Seven", "Eight",
            "Nine", "Ten", "Eleven", "Twelve","Thirteen", "Fourteen", "Fifteen",
            "Sixteen", "Seventeen", "Eighteen","Nineteen" };


    static String tenMultiple[] = { "", "", "Twenty", "Thirty", "Forty","Fifty", "Sixty", "Seventy", "Eighty",
            "Ninety" };
    static String oneNumber[] = { "0", "1/100 Only", "2/100 Only", "3/100 Only", "4/100 Only","5/100 Only", "6/100 Only", "7/100 Only", "8/100 Only",
            "9/100 Only", "10/100 Only", "11/100 Only", "12/100 Only","13/100 Only", "14/100 Only", "15/100 Only","16/100 Only", "17/100 Only", "18/100 Only","19/100 Only" };


    static String tenNumber[] = { "", "", "2", "3", "4","5", "6", "7", "8","9" };

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
    static String fractionToWord(int n)
    {

        if(n<20)
        {
            return oneNumber[n];
        }
        if (n<100)
        {
            return tenNumber[n/10]+fractionToWord(n%10);
        }
        if (n<1000)
        {
            return oneNumber[n/100]+fractionToWord(n%100);
        }
        if(n<100000)
        {
            return fractionToWord(n/1000)+fractionToWord(n%1000);
        }
        return fractionToWord(n/100000)+fractionToWord(n%100000);
    }

}

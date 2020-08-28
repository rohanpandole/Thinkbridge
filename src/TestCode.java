import java.util.Scanner;
import org.junit.*;

class Test
{
    static String oneMultiple[] = { "Zero", "one ", "two ", "three ", "four ","five ", "six ", "seven ", "eight ",
            "nine ", "ten ", "eleven ", "twelve ","thirteen ", "fourteen ", "fifteen ",
            "sixteen ", "seventeen ", "eighteen ","nineteen " };


    static String tenMultiple[] = { "", "", "twenty ", "thirty ", "forty ","fifty ", "sixty ", "seventy ", "eighty ",
            "ninety " };


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
            return oneMultiple[n/100]+"hundred and"+((n%100!=0)?" ":"")+powerToWord(n%100);
        }
        if(n<100000)
        {
            return powerToWord(n/1000)+"thousand"+((n%1000!=0)?" ":"")+powerToWord(n%1000);
        }
        if(n<10000000)
        {
            return powerToWord(n/100000)+" lakh"+((n%100000!=0)?" ":"")+powerToWord(n%100000);
        }

        return powerToWord(0);
    }

}

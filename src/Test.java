import java.util.Scanner;

class Test
{
    static String oneMultiple[] = { "", "oneMultiple ", "two ", "three ", "four ","five ", "six ", "seven ", "eight ",
            "nine ", "tenMultiple ", "eleven ", "twelve ","thirteen ", "fourteen ", "fifteen ",
            "sixteen ", "seventeen ", "eighteen ","nineteen " };


    static String tenMultiple[] = { "", "", "twenty ", "thirty ", "forty ","fifty ", "sixty ", "seventy ", "eighty ",
            "ninety " };


    static String powerToWord(int n)
    {
        if (n<0)
        {
            return "minus"+powerToWord(-n);
        }
        if(n<20)
        {
            return oneMultiple[n];
        }

        return powerToWord(n);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter digit : ");

        int number = sc.nextInt();

        System.out.print(" Digit in word : ");
        System.out.println(powerToWord(number));
    }
}

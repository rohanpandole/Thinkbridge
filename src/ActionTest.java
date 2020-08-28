import org.junit.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ActionTest
{
    @Test
    public void convertTest_Success1()
    {
        int number = 1;
        assertEquals("One",TestCode.powerToWord(number));
    }
    @Test
    public void convertTest_Success2()
    {
        int number = 12;
        assertEquals("Twelve",TestCode.powerToWord(number));
    }
    @Test
    public void convertTest_Success3()
    {
        int number = 123;
        assertEquals("One Hundred And Twenty Three",TestCode.powerToWord(number));
    }
    @Test
    public void convertTest_Success4()
    {
        int number = 1234;
        assertEquals("One Thousand Two Hundred And Thirty Four",TestCode.powerToWord(number));
    }
    @Test
    public void convertTest_Success5()
    {
        int number = 12345;
        assertEquals("Twelve Thousand Three Hundred And Forty Five",TestCode.powerToWord(number));
    }
    @Test
     public void convertTest_Success6()
    {
       int number = 123456;
       assertEquals("One Lakh Twenty Three Thousand Four Hundred And Fifty Six",TestCode.powerToWord(number));
    }
    @Test
    public void convertTest_SuccessOnMinusValue1()
    {
        int number=-1;
        assertEquals("minus One",TestCode.powerToWord(number));
    }
    @Test
    public void convertTest_SuccessOnMinusValue2()
    {
        int number=-12;
        assertEquals("minus Twelve",TestCode.powerToWord(number));
    }
    @Test
    public void convertTest_SuccessOnZero()
    {
        int number=-0;
        assertEquals("Zero",TestCode.powerToWord(number));
    }

    @Test
    public void convertTest_Fail()
    {
        int number = 2;
        Assert.assertNotSame("One",TestCode.powerToWord(number));
    }
    @Test
    public void convertTest_SuccessWithFraction()
    {
        double myDub=123456.78; //1234.56; //123456.78;
        int  deci=(int)myDub;

        myDub=(myDub%1)*101;
        int frac=(int) myDub;

        System.out.println(deci + "\n" + frac);

        Assert.assertEquals("One Lakh Twenty Three Thousand Four Hundred And Fifty Six",TestCode.powerToWord(deci));
        Assert.assertEquals("78/100 Only",TestCode.fractionToWord(frac));
    }
    @Test
    public void convertTest_SuccessWithFraction1()
    {
        double myDub=123456.78; //1234.56; //123456.78;
        int  deci=(int)myDub;

        myDub=(myDub%1)*101;
        int frac=(int) myDub;

        System.out.println(deci + "\n" + frac);

        String s1="Rs. ";
        s1+=TestCode.powerToWord(deci);
        s1+=TestCode.fractionToWord(frac);
        //System.out.println(s1);

        Assert.assertEquals("Rs. One Lakh Twenty Three Thousand Four Hundred And Fifty Six 78/100 ONLY",s1);
    }
}

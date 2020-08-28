# Converting Numbers into Words 

This repository contain source code for number conversion to words For ex. If provided `123456.78`, it should print out `Rs. One Lakh Twenty Three Thousand Four Hundred And Fifty Six 78/100 ONLY` for Indian Currency.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

You have to clone this repository in you local repository .There are **two java file** One is `ActionTest.java`  and Second is `TestCode.java`, Where `TestCode.java` have actual logic for conversion and `ActionTest.java` have multiple `Junit Test case` for  Regreesion Testing of logic.

### Prerequisites

What things you need to install the software and how to install them

```
Must have installed any IDE like intellij IDE (any version) on your system for project development.

Alteast have java 1.8 vesion installed and also have Junit-4.12 and hamcrest-core-1.3 libraries on your project dependencies

```
## Running the tests

`In this source code have number of test cases in` **ActionTest.java**, `You just need to run these test cases to get how actual output meet to expected output`

### Step By Step Process Of Each Test Case

1] `convertTest_Success1()` : if you enter single digit number it will give you sigle word like 1 = One 

2] `convertTest_Success2()` : if you enter two digit number it will give you single word like 12 = Twelve

3] `convertTest_Success3()` : if you enter three digit number it will give you five word like 123 = One Hundred And Twenty Three

4] `convertTest_Success4()` : if you enter four digit number it will give you seven word like 1234 = One Thousand Two Hundred And Thirty Four

5] `convertTest_Success5()` : if you enter five digit number it will give you seven word like 12345 = Twelve Thousand Three Hundred And Forty Five

6] `convertTest_Success6()` : if you enter six digit number it will give you ten word like 123456 = One Lakh Twenty Three Thousand Four Hundred And Fifty Six

7] `void convertTest_SuccessOnMinusValue1()` : if you enter 123456.78 single negative digit number it will give you two word like -1 = minus One 

8] `public void convertTest_SuccessOnZero()` : if you enter  zero digit number it will give you single word like 0 = Zero

9] `public void convertTest_Fail()` : Its like if you enter any digit but expected output will not same as actual output

10] `convertTest_SuccessWithFraction()` : This is the most valuable test case, It will take sigle input but these will divided into to pasrts like one for decimal
      and second for fraction, Decimal pasrt is easy it will give you direct integer value and Fraction part is hard where you have fractional value but you need
      to convert it into integer in terms of to get output, Here Both output generated seperatly for understanig purpose.
      
11]  `convertTest_SuccessWithFraction1()` : It will take single input and single outpt will get generated like( 123456.78 = Rs. One Lakh Twenty Three Thousand Four Hundred And Fifty Six 78/100 ONLY) `These is actual output of Assignment `     


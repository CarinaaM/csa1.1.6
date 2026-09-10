//Activity 1.1.6

public class MathRiddle
{
  public static void main(String[] args)
  {
   //Riddle:"Choose any integer, double it, add 6, divide it in half, and subtract the number you started with.
   
   //Variable #1: positive integer
   int variableOne = 16;
   int riddleResult1 = (((variableOne*2)+6)/2)-variableOne;
   System.out.println("The result is "+ riddleResult1);

   //Variable #2: negative integer 
   int variableTwo = -6;
   int riddleResult2 = (((variableTwo*2)+6)/2)-variableTwo;
   System.out.println("The result is "+ riddleResult2);

   //Variable #3: zero
   int variableThree = 0;
   int riddleResult3 = (((variableThree*2)+6)/2)-variableThree;
   System.out.println("The result is "+ riddleResult3);

   //Variable #4: one
   int variableFour = 1;
   int riddleResult4 = (((variableFour*2)+6)/2)-variableFour;
   System.out.println("The result is "+ riddleResult4);

   //Variable #5: positive double
   double variableFive = 0.5;
   //Conversion between int and double datatypes:
   double riddleResult5 = (((variableFive*2)+6)/2)-variableFive;
   int riddleResultFive = (int)riddleResult5;
   System.out.println("The result is "+ riddleResultFive);

   //Variable #6: negative double
   double variableSix = -6.7;
   //Conversion between int and double datatypes:
   double riddleResult6 = (((variableSix*2)+6)/2)-variableSix;
   int riddleResultSix = (int)riddleResult6;
   System.out.println("The result is "+ riddleResultSix);



  }
}

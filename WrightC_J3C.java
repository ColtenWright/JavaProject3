// Colten Wright
// Automotive amortization schedule report - WrightC_J3C

import java.util.Scanner;

public class WrightC_J3C
{
   public static void main(String[] args)
   {
      //Double variables
      double loanAmount, interestRate, paymentAmount, interest, principle, newBalance;
      //Int variables
      int payments;
      //Get user data
      Scanner keyboard = new Scanner(System.in);
      //Ask for loan amount
      System.out.println("What is the loan amount?");
      loanAmount = keyboard.nextDouble();
      //Ask for # of payments
      System.out.println("What is the number of payments?");
      payments = keyboard.nextInt();
      //Ask for interest rate
      System.out.println("What is the interest rate?");
      System.out.println("(Enter interest rate as a decimal.)");
      interestRate = keyboard.nextDouble();
      //Ask for payment amount
      System.out.println("What is the amount paid on the loan?");
      paymentAmount = keyboard.nextDouble();
      //Formatting
      System.out.println("Year  Balance     Interest    Principle   New Balance");
      System.out.println("---------------------------------------------------");
      //loop
      for (int year = 1; year <= payments; year++)
      {
         System.out.print(year + "\t\t");
         System.out.printf("$%,10.2f\t", loanAmount);
         interest = loanAmount * interestRate;
         System.out.printf("$%,10.2f\t", interest);
         principle = paymentAmount - interest;
         System.out.printf("$%,10.2f\t", principle);
         newBalance = loanAmount - principle;
         System.out.printf("$%,10.2f\t", newBalance);
         System.out.println(" ");
         loanAmount = newBalance;                           
      }
   }
}
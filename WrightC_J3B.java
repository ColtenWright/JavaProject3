// Colten Wright
// Employee Pay Calculator - WrightC_J3B 

import java.util.Scanner;

public class WrightC_J3B
{
   public static void main(String[] args)
   {
      //Double Variables
      double grossPay, stateTax, federalTax, ficaWithholding, grossPayTotal, stateTaxTotal, federalTaxTotal, ficaWithholdingTotal, netPay;
      //Integer Variables
      int employees;
      //Get user data
      Scanner keyboard = new Scanner(System.in);
      //Ask for number of employees
      System.out.println("How many employees are there?");
      employees = keyboard.nextInt();
      //Set accumulators to 0
      grossPayTotal = 0.0;
      stateTaxTotal = 0.0;
      federalTaxTotal = 0.0;
      ficaWithholdingTotal = 0.0;
      //Loop
      while(employees>0)
      {
         //Ask for gross pay amount
         System.out.println("What is the employee's gross pay?");
         grossPay = keyboard.nextDouble();
         grossPayTotal += grossPay;
         //Ask for state tax amount
         System.out.println("What is the state tax amount withheld?");
         stateTax = keyboard.nextDouble();
         stateTaxTotal += stateTax;
         //Ask for federal tax amount
         System.out.println("What is the federal tax amount withheld?");
         federalTax = keyboard.nextDouble();
         federalTaxTotal += federalTax;
         //Ask for FICA withholding amount
         System.out.println("What is the FICA withholding amount?");
         ficaWithholding = keyboard.nextDouble();
         ficaWithholdingTotal += ficaWithholding;
         employees--;
      }
      //Calculate netPay
      netPay = grossPayTotal - (stateTaxTotal + federalTaxTotal + ficaWithholdingTotal);
      //Display results
      System.out.printf("The total gross pay for all employees is: $%,10.2f\n ", grossPayTotal);
      System.out.printf("The total state tax withheld for all employees is: $%,10.2f\n ", stateTaxTotal);
      System.out.printf("The total federal tax withheld for all employees is: $%,10.2f\n ", federalTaxTotal);
      System.out.printf("The total FICA witholding amount for all employees is: $%,10.2f\n ", ficaWithholdingTotal);
      System.out.printf("\tThe total net pay for all employyes is: $%,10.2f\n ", netPay);
   }
}
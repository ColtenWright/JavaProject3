// Colten Wright
// Math Practice - WrightC_J3A

import java.util.Scanner;
import java.util.Random;

public class WrightC_J3A
{
   public static void main(String[] args)
   {
      //Integer variables
      int rand_int, rand_int2, answer, userAnswer, upperbound;
      //String variables
      String input;
      //Char variables
      char problem;
      //Get user data
      Scanner keyboard = new Scanner(System.in);
      Random rand = new Random();
      //Loop 
      do
      {
         System.out.println("Which problem would you like to solve?");
         System.out.println("\tEnter A for an addition problem.");
         System.out.println("\tEnter S for a subtraction problem.");
         System.out.println("\tEnter M for a subtraction problem.");
         System.out.println("\tEnter E to exit the program.");
         //Receive input from menu
         input = keyboard.next();
         problem = input.charAt(0);
         //Determine the type of problem
         switch (problem)
         {
            case 'A':
               //Determine question
               System.out.println("You chose an addition problem.");
               upperbound = 101;
               rand_int = rand.nextInt(upperbound);
               rand_int2 = rand.nextInt(upperbound);
               System.out.println("What does " + rand_int + " + " + rand_int2 + " equal?");
               //Determine answer and userAnswer
               userAnswer = keyboard.nextInt();
               answer = rand_int + rand_int2;
               //Determine if correct or incorrect
               if (userAnswer == answer)
               {
                  System.out.println("Congratualtions you got the answer right!");
               }
               else 
               {
                  System.out.println("Sorry that answer was incorrect");
                  System.out.println("The correct answer was: "+ answer);
               }
               break;
            case 'S':
               System.out.println("You chose a subtraction problem.");
               upperbound = 101;
               rand_int = rand.nextInt(upperbound);
               rand_int2 = rand.nextInt(upperbound);
               System.out.println("What does " + rand_int + " - " + rand_int2 + " equal?");
               //Determine answer and userAnswer
               userAnswer = keyboard.nextInt();
               answer = rand_int - rand_int2;
               //Determine if correct or incorrect
               if (userAnswer == answer)
               {
                  System.out.println("Congratualtions you got the answer right!");
               }
               else 
               {
                  System.out.println("Sorry that answer was incorrect");
                  System.out.println("The correct answer was: "+ answer);
               }
               break;
            case 'M':
               System.out.println("You chose a multiplication problem.");
               upperbound = 101;
               rand_int = rand.nextInt(upperbound);
               rand_int2 = rand.nextInt(upperbound);
               System.out.println("What does " + rand_int + " * " + rand_int2 + " equal?");
               //Determine answer and userAnswer
               userAnswer = keyboard.nextInt();
               answer = rand_int * rand_int2;
               //Determine if correct or incorrect
               if (userAnswer == answer)
               {
                  System.out.println("Congratualtions you got the answer right!");
               }
               else 
               {
                  System.out.println("Sorry that answer was incorrect");
                  System.out.println("The correct answer was: "+ answer);
               }
               break;
            case 'E':
               System.out.println("Exiting program.");
               break;
            default:
               System.out.println("A valid menu choice was not entered.");
         }
         }
         while (problem == 'A' ||problem == 'S' ||problem == 'M');
      }
   }
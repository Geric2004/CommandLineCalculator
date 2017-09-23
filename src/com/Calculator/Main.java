package com.Calculator;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        // write your code here
        boolean tester = true;
        String Ans;

        while (tester){


            System.out.println("Would you like to start the Calculator (Y/N)");
            Scanner Answer = new Scanner(System.in);
            Ans = Answer.next();

            if (Ans.equals("Y")) {
                int VarA;
                int VarB;
                String UserChoice;

                System.out.println("Please insert the first variable.");
                Scanner Number1 = new Scanner(System.in);
                VarA = Number1.nextInt();


                System.out.println("Please insert the second variable.");
                Scanner Number2 = new Scanner(System.in);
                VarB = Number2.nextInt();


                System.out.println("Please pick the Operation (Add, Sub, Mul, Div)");
                Scanner Operation = new Scanner(System.in);
                UserChoice = Operation.nextLine();


                if (UserChoice.equals("Add")) {
                    System.out.println(VarA + VarB);

                }

                if (UserChoice.equals("Sub")) {
                    System.out.println(VarA - VarB);

                }

                if (UserChoice.equals("Div")) {
                    System.out.println(VarA / VarB);

                }

                if (UserChoice.equals("Mul")) {
                    System.out.println(VarA * VarB);

                }
            }

            if (Ans.equals("N")) {
                tester = false;
                Answer.close();
                System.out.println("GoodBye!");


            }


        }
    }


}
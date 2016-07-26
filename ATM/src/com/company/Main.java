package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int pin = 0000;
        int balance = 200000;
        int amount;
        int input;
        int selectOpt;





            System.out.println("\t\t\tATM MANAGEMENT SYSTEM");
            System.out.println("Please enter a Pin to enter : ");


            Scanner sc = new Scanner(System.in);
            input= sc.nextInt();

            if(input == pin){

                do{
                    System.out.println("\t\t\tYOUR ACCOUNT");
                    System.out.println();
                    System.out.println("Select for the operation to perform : ");
                    System.out.println(" 1. Balance Inquiry");
                    System.out.println(" 2. Withdraw transactions ");
                    System.out.println(" 3. Exit");
                    selectOpt = sc.nextInt();
                    switch (selectOpt) {
                        case 1:
                            System.out.println("\t\t\tBALANCE INQUIRY MENU");
                            System.out.println();
                            System.out.print("Your balance is : " + balance);
                            System.out.println();
                            break;
                        case 2:
                            System.out.println("\t\t\tWITHDRAW MENU");
                            System.out.println();
                            System.out.print("Enter the amount to withdraw : ");
                            amount = sc.nextInt();
                            if (amount <= balance) {
                                System.out.println();
                                System.out.println("Successfully withdraw");
                                System.out.println("Thank you for using our services...!!");
                                balance = balance - amount;
                                System.out.println();

                            } else {
                                System.out.println("Amount exceeds to your balance ");
                                System.out.println("Please enter a correct amount ");
                            }
                            break;
                        case 3:
                            break;

                        default:
                            System.out.print("\n Invalid Pin....!!");
                            System.out.println();

                    }


                }
                while (selectOpt != 3);

            }

        else
            {

                System.out.println("Invalid Pin");

            }




    }
}


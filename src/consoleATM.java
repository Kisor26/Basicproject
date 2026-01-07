import java.util.Scanner;

public class consoleATM {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double currentBalance=0.0;

        while(true){
            System.out.println("\nWelcome to the Simple Console ATM!");
            System.out.println("Please select an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Funds");
            System.out.println("3. Withdraw Funds");
            System.out.println("4. Exit");

            System.out.print("Please Enter Your Choice:");
            int choice=input.nextInt();

            switch (choice){

                case 1:
                    System.out.println("Your current balance is: " + currentBalance + " Taka");
                    break;

                case 2:
                    System.out.print("Enter Deposit Amount:");
                    double depositAmount=input.nextDouble();

                    if(depositAmount<=0){
                        System.out.println("Deposite Must Be positive");
                    }else {
                        currentBalance += depositAmount;
                        System.out.println("Deposit successful!");
                        System.out.println("Updated balance: " + currentBalance + " taka");
                    }
                    break;
                case 3:
                        System.out.print("Enter Withdraw Amount:");
                        double withdrawAmount = input.nextDouble();

                        if (withdrawAmount <= 0) {
                            System.out.println("Withdraw Amount Must be positive!");
                        } else if (withdrawAmount > 100) {
                            System.out.println("You are Crossing Withdrawl Limit!");
                        } else if (withdrawAmount > currentBalance) {
                            System.out.println("Insufficient Balance");
                        } else {
                            currentBalance -= withdrawAmount;
                            System.out.println("Withdrawal successful!");
                            System.out.println("Remaining balance: " + currentBalance + " taka");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM! Goodbye.");
                    input.close();
                    return;

                default:
                    // Invalid option
                    System.out.println("Invalid choice! Please select a valid option.");

            }
        }
    }
}

package Day3;
import java.util.Scanner;

public class ATM{
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Balance amt: Rs");
        int balance = obj.nextInt();
        int choice;

        do {
            System.out.println("Welcome to ATM Menu");
            System.out.println("1)Check Balance");
            System.out.println("2)Deposit");
            System.out.println("3)Withdraw amount");
            System.out.println("4)Exit");
            choice = obj.nextInt();

            switch(choice){
                case 1:
                        System.out.println("Balance: Rs" + balance);
                        break;
                case 2:
                        System.out.println("Deposit amt: Rs");
                        int Deposit = obj.nextInt();
                        balance += Deposit;
                        break;
                case 3:
                        System.out.println("How much money you wanna withdraw: Rs");
                        int Withdraw = obj.nextInt();
                        if(Withdraw > balance){
                            System.out.println("Insufficient balance");
                            break;
                        }
                        else{
                        balance -= Withdraw;
                        }
                        break;
                case 4:
                        System.out.println("Thankyou");
                        break;
                default: 
                        System.out.println("Invalid choice");  
                        break;      
            }
        } while(choice != 4);
    }
}
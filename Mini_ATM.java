import java.util.Scanner;
public class Mini_ATM {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int pin=5566;
        int balance = 5000;
        int withdraw =0;
        int deposit =0;
        String name;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name: ");
        name=sc.next();
        System.out.println("Enter your password: ");
        int password=sc.nextInt();
        if(password==pin) {
        	while(true) {     		
                System.out.println("Welcome "+name);
                System.out.println("Choose 1 for Withdraw");
                System.out.println("Choose 2 for Deposit");
                System.out.println("Choose 3 for Check Balance");
                System.out.println("Choose 4 for mini Receipt");
                System.out.println("Choose 5 for EXIT");
                System.out.print("Choose the operation you want to perform:");
                int input = sc.nextInt();
                
                switch(input){
                    case 1:
                    	System.out.print("Enter money to be withdrawn:");
                    	withdraw = sc.nextInt();
                    	if(balance >= withdraw){
                    		balance = balance - withdraw;
                            System.out.println("---------------------------------\nPlease collect your money\n---------------------------------");
                    	}
                    	else{
                            System.out.println("---------------------------------\nInsufficient Balance\n---------------------------------");
                    	}
                    	break;
                    	
                    case 2:
                        System.out.print("Enter money to be deposited:");
                        deposit = sc.nextInt();
                        balance = balance + deposit;
                        System.out.println("-------------------------------------------\nYour Money has been successfully deposited\n-------------------------------------------");
                        break;
                        
                    case 3:
                        System.out.println("---------------------------------\nBalance : "+balance+"\n---------------------------------");
                        break;
                        
                    case 4:
                        System.out.println("---------------------------------\nWelcome to Kiruthik's Mini ATM");
                        System.out.println("Available balance = "+balance);
                        System.out.println("Amount taken = "+withdraw);
                        System.out.println("Amount deposited = "+deposit);
                        System.out.println("Thank you for coming !\n---------------------------------");
                        break; 
                        
                    case 5:
                        System.out.println("---------------------------------\nThank you ! ! !\n---------------------------------");
                        System.exit(0);
                        
                        default:
                        	System.out.println("Invalid input");
        	}
           }
      }
        else {
        	System.out.println("Wrong Password ! ! !");
        }
    }
}

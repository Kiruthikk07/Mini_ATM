import java.util.Scanner;

public class Mini_ATM {
	static int balance = 5000;
	static int withdraw = 0;
	static int deposit = 0;

	public static void withdraw(int amount) {

		if (balance >= amount && amount > 0) {
			balance = balance - amount;
			withdraw = amount;
			System.out.println(
					"---------------------------------\nPlease collect your money\n---------------------------------");
		} else {
			System.out.println(
					"---------------------------------\nInsufficient Balance\n---------------------------------");
		}

	}

	public static void deposit(int amount) {

		balance = balance + amount;
		deposit = amount;
		System.out.println(
				"-------------------------------------------\nYour Money has been successfully deposited\n-------------------------------------------");
	}

	public static int balance() {
		System.out.println("---------------------------------");
		return balance;
	}

	public static void miniReceipt() {
		System.out.println("---------------------------------\nWelcome to Kiruthik's mini ATM");
		System.out.println("Available balance = " + balance);
		System.out.println("Amount taken = " + withdraw);
		System.out.println("Amount deposited = " + deposit);
		System.out.println("Thank you for coming !\n---------------------------------");
	}

	public static void exit() {
		System.out.println("---------------------------------\nThank you ! ! !\n---------------------------------");
		System.exit(0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pin = 5566;
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		name = sc.next();
		System.out.println("Enter your password: ");
		int password = sc.nextInt();
		if (password == pin) {
			System.out.println("Welcome " + name);
			while (true) {
				System.out.println("Choose 1 for Withdraw");
				System.out.println("Choose 2 for Deposit");
				System.out.println("Choose 3 for Check Balance");
				System.out.println("Choose 4 for mini Receipt");
				System.out.println("Choose 5 for EXIT");
				System.out.print("Choose the operation you want to perform:");
				int input = sc.nextInt();

				switch (input) {
				case 1:
					System.out.print("Enter money to be withdrawn:");
					int withdraw = sc.nextInt();
					withdraw(withdraw);

					break;

				case 2:
					System.out.print("Enter money to be deposited:");
					int deposit = sc.nextInt();
					deposit(deposit);
					break;

				case 3:
					System.out.println("Balance = " + balance());
					System.out.println("---------------------------------");
					break;

				case 4:
					miniReceipt();
					break;

				case 5:
					exit();

				default:
					System.out.println("Invalid input");
				}
			}
		} else {
			System.out.println("Wrong Password ! ! !");
		}
		sc.close();
	}
}

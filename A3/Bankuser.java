package A3;

import java.util.Scanner;

public class Bankuser {
	int Balance;
	int WithDraw;
	int Deposit;
	Scanner sc = new Scanner(System.in);

	public void Bankinformation() {

		System.out.println("Thank You Visit for Cosmos Bank ");
		System.out.println("Cosmos Bank for CIDCO Branch");
		System.out.println("Cosmos Bank Mobile Number: 9552559079");
		System.out.println("Cosmos Bank ATM 24 Hours Open ");

	}

	public void BankDeposit() {
		System.out.println("Thank You Visit for Cosmos Bank ");

		System.out.println("Please Enter Your Deposit Money");

		Deposit = sc.nextInt();
		Balance = Balance + Deposit;
		System.out.println("Thank For Deposit Money: " + Deposit);

	}

	public void BankWithDraw() {
		System.out.println("Thank You Visit for Cosmos Bank ");
		System.out.println("Please Enter Your WithDraw Money");

		WithDraw = sc.nextInt();
		if (WithDraw <= Balance || WithDraw == Balance) {
			int WithDraw1 = WithDraw;
			System.out.println("Thank For WithDraw Money: " + WithDraw1);
		} else {
			System.out.println("Sorry Bank Account For Not Balance Your Money");

		}
	}

	public void BankCheckBalance() {
		System.out.println("Thank You Visit for Cosmos Bank ");
		System.out.println("Please Show Your Check Balance Money");

		Balance = Balance - WithDraw;
		System.out.println("Thank For Check Balance: " + Balance);

	}

	public static void main(String[] args) {
		Bankuser bs = new Bankuser();
		Scanner vv = new Scanner(System.in);

		String nameUser = "VaradKanthale";
		int passwordUser = 3980;
		System.out.println("Welcome Your ATM mechine...! ");

		System.out.println("Please Enter your Name");
		String name = vv.next();
		System.out.println("Please Enter your Password");
		int password = vv.nextInt();
		System.out.println("password: " + password);
		System.out.println("name: " + name);

		if (password == passwordUser && name.equals(nameUser)) {
			while (true) {

				System.out.println("Choice 1 Bank realated information");
				System.out.println("Choice 2 Bank Deposit Money ");
				System.out.println("Choice 3 Bank Withdraw Money ");
				System.out.println("Choice 4 Check Balence From User");
				System.out.println("choice 5 System exit ");

				System.out.println("Please Your Choice");
				int Choice = vv.nextInt();

				switch (Choice) {
				case 1:
					bs.Bankinformation();
					System.out.println("Bank information By By...! ");
					System.out.println();
					System.out.println();
					break;

				case 2:
					bs.BankDeposit();
					System.out.println("By By...! ");
					System.out.println();
					System.out.println();
					break;

				case 3:
					bs.BankWithDraw();
					System.out.println("BankWithDraw By By...! ");
					System.out.println();
					System.out.println();
					break;

				case 4:
					bs.BankCheckBalance();
					System.out.println("BankCheckBalance By By...! ");
					System.out.println();
					System.out.println();
					break;

				case 5:
					System.out.println("System exit By By...! ");
					System.exit(0);
					System.out.println();
					System.out.println();
					break;

				default:
					System.out.println("Invalid Choice For User...!  ");
					System.out.println();
					System.out.println();
				}
			}

		} else {
			System.out.println("Invalid Name and Password Please try...!    ");
			System.out.println();
			System.out.println();
		}

	}
}

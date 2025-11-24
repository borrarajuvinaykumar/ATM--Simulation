package ATMProject;

import java.util.Scanner;

public class User {
	 static int status;

	public static void main(String[] args) {
		ATMoperationImplements imp1=new ATMoperationImplements();
		Scanner sc=new Scanner(System.in);
		int atmnumber=54321;
		int atmpin=123;
		System.out.println("WELCOME TO ATM MACHINE:");
		System.out.println("ENTER THE ATM NUMBER:");
		int atmnumber1=sc.nextInt();
		System.out.println("ENTER THE ATM PIN:");
		int atmpin2=sc.nextInt();
		if(atmnumber==atmnumber1&&atmpin==atmpin2) {
			while(true) {
			System.out.println(" 1.viewAvailable Balance\n 2.WithdrawAmount\n "
					+ "3.DepositeAmount\n 4.viewMinistatement\n 5.exit");
			System.out.println("Enter the choice:");
			int choice=sc.nextInt();
			if(choice==1) {
				imp1.viewBalance();
			}else if(choice==2) {
				System.out.println("Enter the amount to withdraw:");
				double withdrawamount=sc.nextDouble();
				imp1.withdrawAmount(withdrawamount);
			}else if(choice==3) {
				System.out.println("Enter the amount to deposit:");
				double depositeAmount=sc.nextDouble();
				imp1.depositAmount(depositeAmount);
			}else if(choice==4) {
				imp1.viewMiniStatement();
			}else if(choice==5) {
				System.out.println("Collect your ATM card \n Thank you");
				System.exit(choice);
			}
			else {
				System.out.println("Invaild choice:");
				System.exit(0);
			}
			}
		}else {
			System.out.println("INCORRECT ATM NUMBER OR PIN");
		}



	}

}

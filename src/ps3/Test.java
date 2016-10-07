package ps3;

public class Test {
	public static void main(String args[]){
		
		
		account test = new account();
		
		test.setID(1122);
		test.setBalance(200);
		test.setannualInterestRate(4.5);
		test.withdraw(2500);
		test.depost(2);
		System.out.println("The balance is " + "$" + test.getBalance() + " with a monthly interest of "
				+ test.getMonthlyInterestRate() + "%" + " on the date of " + test.setDate() );
	}

}

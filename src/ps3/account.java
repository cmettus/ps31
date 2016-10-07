package ps3;
import java.util.Date;
import java.util.Scanner;

class account {
	private int ID=0;
	private double Balance, annualInterestRate=0;
	private Date dateCreated;
	InsufficientFundsException test1 = new InsufficientFundsException(Balance);
	account(){
		}
	account(int id, double balance ){
		}
	public void setID(int id){
		ID=id;
	}
	public void setBalance(double balance){
		Balance=balance;
	}
	public void setannualInterestRate(double rate){
		annualInterestRate=rate;
	}
	public int getid(){
		return ID;
	}
	public double getBalance(){
		return Balance;
	}
	public double getRate(){
		return annualInterestRate;
	}
	public Date setDate(){
		Date dateCreated = new Date();
		return dateCreated;
	}
	public double getMonthlyInterestRate(){
		double rate;
		Scanner in = new Scanner(System.in);
		System.out.println("What is the monthly interest rate?");
		rate=in.nextDouble();
		return rate;
	}
	public double withdraw(double amt){
		if (amt > Balance){
			InsufficientFundsException e = new InsufficientFundsException(Balance);
			return e.getAmount();
	}
	
	return Balance -=amt;
	}
	public double depost(double amt){
		this.Balance=Balance;
		Balance+=amt;
		return Balance; 
	}
	
}

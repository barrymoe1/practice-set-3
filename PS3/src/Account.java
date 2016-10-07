import java.util.Date;
public class Account {
	private int id;//Private int data field named id for the account
	private double balance; // double data field named balance for the account
	private double annualInterestRate; //Private double data field named annualInterestRate or account
	private Date dateCreated; //Stores the date for when the account was created

	//no arg construtor that creates a default account
	Account () {
		id =0;
		//testing
		balance=0.0;
		annualInterestRate= 0.0;
	}
	//Constructor which creates the account with the specified id and initial balance
	Account(int acctId, double acctBalance, double acctAnnualInterestRate) {
		id = acctId;
		balance = acctBalance;
		annualInterestRate = acctAnnualInterestRate;
	}
	//Accessor method for id
	public int getId() {
		return id;
	}
	//Accessor method for balance
	public double getBalance() {
		return balance;
	}
	//Accessor method for Annual Interest Rate
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	//Mutator method for id
	public void setId(int acctId) {
		id = acctId;
	}
	//Mutator method for balance
	public void setBalance(double acctBalance) {
		balance =acctBalance;
	}
	//Mutator method for annualInterestRate
	public void setannualInterestRate(double acctAnnualInterestRate) {
		annualInterestRate =acctAnnualInterestRate;
	}
	//Accessor method for dateCreated
	public void setDateCreated(Date acctDateCreated) {
		dateCreated = acctDateCreated;
	}
	//Method named getMonthlyInterestRate() that returns the monthly interest rate
	double getMonthlyInterestRate() {
		return annualInterestRate/12;
	}
	//Method named withdraw that withdraws a specified amount from the account
	double withdraw(double withdrawAmount) throws InsufficientFundsException {
		if (withdrawAmount > balance) {
			throw new InsufficientFundsException(withdrawAmount);
			
		}
		return balance -= withdrawAmount;
	}
	//Method named deposit that deposits a specified amount into the account
	double deposit(double depositAmount) {
		return balance += depositAmount;
	}
}


import java.util.Date;

public class test {

public static void main(String[] args) {
    // TODO Auto-generated method stub
//Create account1
Account account1 = new Account(1122, 20000, .045);
//Use the withdraw method
try {
	account1.withdraw(2500);
} catch (InsufficientFundsException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
//Use the deposit method
account1.deposit(3000);
//Get date created
java.util.Date dateCreated = new java.util.Date();
//Print statements
System.out.println("Your account, " +account1.getId() + ", was created on: " + dateCreated);
System.out.printf("Your current balance is: $%.2f%n", account1.getBalance());
System.out.println("Your monthly interest Rate is: " +  (account1.getAnnualInterestRate())*100 + "%");
}
}

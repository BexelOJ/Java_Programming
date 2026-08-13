class java_20260813_BankAccount {
	private int accountNumber;
	private String ownerName;
	private double balance;

	java_20260813_BankAccount(int an, String name, double bal){
		  this.accountNumber = an;
		  this.ownerName = name;
		  this.balance = bal;
	}

	public void deposit(double amount){
		  balance += amount;
		  System.out.println("\nDeposit: " + amount);
	}
   
	public void withdraw(double amount){
		if(amount > balance){
		  System.out.println("Insufficient balance");
		}
		else{
				balance -= amount;
				System.out.println("Withdraw: " + amount);
		}

	}
	
	public void displayDetails(){
		  System.out.println("Account " + this.accountNumber);
		  System.out.println("Owner: " + this.ownerName);
		  System.out.println("Balance: " + this.balance);
		  
	}

	public static void main(String[] args){
		  java_20260813_BankAccount acc_1 = new java_20260813_BankAccount(1,"Alice",10000);

		  acc_1.displayDetails();

		  acc_1.deposit(2000);
		  acc_1.withdraw(3000);

		  System.out.println("\nFinal Balance: " + acc_1.balance);
	}

}




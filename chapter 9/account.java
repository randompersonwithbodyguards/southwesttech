/*
austin smith
24-1-19

$account
----------------
-id: int
-balance: double
-annualInterestRate: double
-dateCreated: date
----------------
account()
account(id: int, balance: double)
getMonthlyInterestRate()
getMonthlyInterest()
withdraw()
deposit()
*/

class account {
		
		private int id;
		private double balance;
		private double annualInterestRate = 0;
		
		private java.util.Date dateCreated;
		
		public account(int id, double balance){
			this.id = id;
			this.balance = balance;
			this.dateCreated = new java.util.Date();
		}
		
		public account(){
			this.id = 0;
			this.balance = 0;
			this.dateCreated = new java.util.Date();
		}
		public double getMonthlyInterestRate(){
			double monthlyInterestRate = (annualInterestRate / 100) / 12;
			return monthlyInterestRate;
		}
		
		public double getMonthlyInterest(){
			double monthlyInterest = this.balance * ((annualInterestRate / 100) / 12);
			return monthlyInterest;
		}
		
		public double withdraw(double withdrawAmount){
			
			this.balance = this.balance - withdrawAmount;
			return balance;
		}
		
		public double deposit(double depositAmount){
			balance += depositAmount;
			return balance;
		}
		
		public int getId(){
			return this.id;
		}
		
		public double getBalance(){
			return this.balance;
		}
		
		public double getAnnualInterestRate(){
			return annualInterestRate;
		}
		
		public void setId(int newId){
			id = newId;
		}
		
		public void setBalance(double newBal){
			balance = newBal;
		}
		
		public void setAnnualInterestRate(double newRate){
			annualInterestRate = newRate;
		}
		
		public java.util.Date getDate(){
			return dateCreated;
		}
}
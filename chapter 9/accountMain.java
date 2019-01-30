class accountMain {
	public static void main(String[] args) {
		
		
		
		account acct1122 = new account(1122, 20000);
		
		acct1122.setAnnualInterestRate(4.5);
		
		acct1122.withdraw(2500);
		
		acct1122.deposit(3000);
		
		System.out.println("Your balance is: " + acct1122.getBalance() + " and your monthly interest is: " + acct1122.getMonthlyInterest() + "and the date this account was created was: " + acct1122.getDate());
	}
}
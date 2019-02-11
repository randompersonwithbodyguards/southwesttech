/*
austin smith
2/4/2019
static n non static stuffs

*/

class Ex10_3 {
	public static void main(String[] args) {
		MyInteger i = new MyInteger(7);
		
		System.out.println(i.getValue());
		
		System.out.println("isEven testing:");
		System.out.println(MyInteger.isEven(15));
		System.out.println(MyInteger.isEven(new MyInteger(12)));
		System.out.println(i.isEven());
		
		System.out.println("isOdd testing:");
		System.out.println(MyInteger.isOdd(15));
		System.out.println(MyInteger.isOdd(new MyInteger(12)));
		System.out.println(i.isOdd());
		
		System.out.println("isPrime testing:");
		System.out.println(MyInteger.isPrime(15));
		System.out.println(MyInteger.isPrime(new MyInteger(12)));
		System.out.println(i.isPrime());
		
		System.out.println("Equals testing");
		System.out.println(i.equals(7));
		System.out.println(i.equals(17));
		
		char[] bloopArray = new char[]{'4', '7', '8',}; 
		int x = i.parseInt(bloopArray);
		System.out.println(x);
		
		System.out.println(i.parseInt("478"));
		
	}
}
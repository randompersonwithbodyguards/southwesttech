/* 
austin smith
2/4/2019
object class

myinteger
---------------------
-value: int
----------------=----
+ myInteger(value:int)
+isEven(value : int): boolean     static
+isEven(value: MyInteger): boolean static
+isEven(): boolean
+isOdd(value:int): boolean        static
+isOdd(value: MyInteger): boolean static
+isOdd(): boolean
+isPrime(value: int): boolean     static
+isPrime(walue: MyInteger):boolean static
+isPrime(): boolean
+equals(value: int): boolean
equals( value: MyInteger): boolean
+parseInt(s: String): int          static
+parseInt(c:char[]): int           static
---------------------

*/

class MyInteger {
	int value;
	
	public MyInteger(int value) {
		this.value = value;
	}
	
	public int getValue(){
		return this.value;
	}
	
	public static boolean isEven(int val){
		
		boolean isEven = (val % 2 == 0);
		return isEven;
	}
	
	public static boolean isEven(MyInteger val){
		return (val.getValue() % 2 == 0);
	}
	
	public boolean isEven(){
		return isEven(this.value);
	}
	
	public static boolean isOdd(int val){
		return !isEven(val);
	}
	
	public static boolean isOdd(MyInteger val){
		return isOdd(val.getValue());
	}
	
	public boolean isOdd(){
		return isOdd(this.value);
	}
	
	public static boolean isPrime(int val){
		if (val == 1 || val == 2){
			return true;
		}
		
		for(int i = 2; i <= val/2; i++){
			if (val % i == 0){
				return false;
			}
		}
		return true;
	}
	
	public static boolean isPrime(MyInteger val){
		return isPrime(val.getValue());
	}
	
	public boolean isPrime(){
		return isPrime(this.value);
	}
	
	public boolean equals(int val){
		return (val == this.value);
	}
	
	public boolean equals(MyInteger val){
		return(val.getValue() == this.value);
	}
	
	public static int parseInt(char[] numbers){
		String s = new String(numbers);
		return parseInt(s);
	}
	
	public static int parseInt(String s){
		int result = 0;
		for (int i = 0; i < s.length(); i++){
			result = result * 10 + (s.charAt(i) - '0');
		}
		
		return result;
	}
}
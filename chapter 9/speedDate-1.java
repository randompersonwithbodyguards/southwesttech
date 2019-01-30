
/*
austin smith
24-1-19

speedDate
-----------------------
+toString(): String
+getTime(): long
-----------------------
+Date()
+Date(elapseTime: long)
+setTime(elapseTime: long):void
-----------------------
*/

class speedDate {
	public static void main(String[] args) {
		
		java.util.Date date = new java.util.Date();
		
		System.out.println("No change to the elapsed time: " + date.toString() + date.getTime());
		
		for(long x = 10000L; x < 1000000000000L;x = x * 10){
			date.setTime(x);
			System.out.println("Elapsed time set to  " + x + ": " + date.toString());
		}
	}
}
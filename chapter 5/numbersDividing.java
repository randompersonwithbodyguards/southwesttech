/*austin smith
 9/28/2018*/
public class Exercise5_11 {
	public static void main(String[] args) {
		int n = 100;
		int objectCount = 0;
		
		while (n <= 200){
			
			if (n % 5 == 0 && n % 6 > 0){
				System.out.print(n + " ");
				objectCount = objectCount + 1; 
			}
			if (n % 5 > 0 && n % 6 == 0){
				System.out.print(n + " ");
				objectCount = objectCount + 1;
			}
			n = n + 1;
			if (objectCount%10 == 0){
		    System.out.println();
		    }
		}
	}
}
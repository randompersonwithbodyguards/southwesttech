/* austin smith 
nov 5 20-18*/ 

class lockersRidiculousness {
	public static void main(String[] args) {
		boolean[] lockers = new boolean[100];
		
		for (int i = 0; i < 100; i++){
			 lockers[i] = false;
		}
		
		//advancing gtjrou students
		for (int j = 1; j <= 100; j++){
			
			for (int i = j - 1; i <= 99; i += j){
				lockers[i] = !lockers[i];
			}
		}
		System.out.print("The lockers that are open are: ");
		
		for (int i = 0; i < 100; i++){
			
			if(lockers[i] == true){
				
				System.out.print((i + 1) + ", ");
				
			}
		}
	}
}
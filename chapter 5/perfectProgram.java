/* austin smith 
5/10/18 */
class perfectProgram {
	public static void main(String[] args) {
		
		int limit = 10000;
		boolean perfect = false;
		int i;
		for (i = 2; i < limit; i++){
			perfect = isNumPerfect(i);
			if (perfect){
				System.out.println(i + " is perfect");
			}
		}
	}
	public static boolean isNumPerfect(int i){
		boolean perfect = false;	
		int sum = 1;
		int cache;
		for(cache = 2; cache <= i / 2; cache++){
			if(i % cache == 0){
				sum += cache;
			}
		}
		if(sum == i){
			perfect = true;
		}
		return perfect;
	}
}
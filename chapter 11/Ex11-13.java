import java.util.ArrayList;
import java.util.Scanner;

class Ex11_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> tenInts = new ArrayList<Integer>();

		int holder = 0;
		
		for(int i = 1; i < 11; i++){
			System.out.println("(" + i + ") Type an integer: ");
			holder = input.nextInt();
			tenInts.add(holder);
		}
		removeDuplicate(tenInts);
	}
	
	public static void removeDuplicate(ArrayList<Integer> list) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		
		for(int i = 1; i < list.size(); i++){
			if(!temp.contains(list.get(i))){
				temp.add(list.get(i));
			}
		}
		list.clear();
		for(int i = 0; i < temp.size(); i++){
			list.add(temp.get(i));
		}
		System.out.println("List without duplicates: ");
		
		for(int i = 0; i < list.size(); i++){
			System.out.print(list.get(i) + " ");
		}
	}
}

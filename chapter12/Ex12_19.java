/* austin smith
today*/

import java.util.Scanner;

class Ex12_19{
	public static void main(String[] args){
	String stringThing = "http://cs.armstrong.edu/liang/Lincoln.txt";
	int wordcount = 0;
	
	try{
		java.net.URL url = new java.net.URL(stringThing);
		
		Scanner input = new Scanner(url.openStream());
		while (input.hasNext()){
			String word = input.next();
			System.out.println(word);
			wordcount++;
		}
		
		System.out.println("The number of words in " + stringThing + " is " + wordcount);
		
	}
	catch (java.net.MalformedURLException ex) {
		System.out.println("Invalid Url");
	}
	catch (java.io.IOException ex){
		System.out.println("I/O Errors: no file");
	}
	
		
	}
}
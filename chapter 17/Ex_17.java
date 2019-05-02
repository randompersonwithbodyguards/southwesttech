

import java.util.Scanner;
import java.io.*;

class Ex_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("(1)encrypt               (2)decrypt \nSelect one:");
		int action = input.nextInt();
		input.nextLine();
		
		
		System.out.println("Enter filename: ");
		String filename = input.nextLine();
		File inFile = new File(filename);
		
		System.out.println("OUtput filename: ");
		File outFile = new File(input.nextLine());
		
		try (
			BufferedInputStream in = new BufferedInputStream(new FileInputStream(inFile));
			BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(outFile));
		){
			if (action == 1){
				encrypt(in, out);
			}
			else if (action == 2){
				decrypt(in, out);
			}
			
			
		}
		catch(IOException e){
			System.out.println("SOmething doen did mess up");
		}
	}
	
	public static void encrypt(BufferedInputStream in, BufferedOutputStream out){
		try{
			int value = in.read();
			while (value != -1){
				out.write(value + 5);
				
				value = in.read();
			}
		}
		catch(IOException e){
			System.out.println("Death on a stick");
		}
	}
	
	public static void decrypt(BufferedInputStream in, BufferedOutputStream out){
		try{
			int value = in.read();
			while (value != -1){
				out.write(value - 5);
				
				value = in.read();
			}
		}
		catch(IOException e){
			System.out.println("Death on a stick decrypt");
		}
	}
	
}
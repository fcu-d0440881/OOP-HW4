package fcu.iecs.oop.password;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		String in;
		while(true){
			System.out.println("½Ð¿é¤J¤@¦r¦ê : ");
			in = keyboard.next();
			if(in.compareTo("exit") == 0) break;
			PasswordEncorder x = new PasswordEncorder();
			String result = x.encode(in);
			System.out.println(result);
		}
		System.out.println("End");
		keyboard.close();
	}
}

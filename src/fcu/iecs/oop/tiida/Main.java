package fcu.iecs.oop.tiida;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		NissanTiida x = new NissanTiida();
		Scanner keyboard = new Scanner(System.in);
		System.out.print("�п�J�@���  : ");
		int loop = keyboard.nextInt();
		for(int i = 1; i <= loop; i++){
			x.tiida();
		}
		keyboard.close();
	}
}

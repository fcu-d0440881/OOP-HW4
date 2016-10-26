package fcu.iecs.oop.tiida;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		NissanTiida x = new NissanTiida();
		Scanner keyboard = new Scanner(System.in);
		System.out.print("請輸入一整數  : ");
		int loop = keyboard.nextInt();
		for(int i = 1; i <= loop; i++){
			x.tiida();
		}
		keyboard.close();
	}
}

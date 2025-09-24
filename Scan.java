package EDA_practica1;

import java.util.Scanner;

public class Scan {
	
	private static Scanner scanner = new Scanner(System.in);

	public static Scanner getScanner() {
		return scanner;
	}

	public static void setScanner(Scanner scanner) {
		Scan.scanner = scanner;
	} 

}

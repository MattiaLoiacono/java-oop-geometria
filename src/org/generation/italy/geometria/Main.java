package org.generation.italy.geometria;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Base: ");
		int base =  scan.nextInt();
		System.out.print("Alezza: ");
		int altezza =  scan.nextInt();
		
		Rettangolo r = new Rettangolo(base,altezza);
		System.out.println("Area: " + r.calcolaArea());
		System.out.println("Perimetro: " + r.calcolaPerimetro());
		scan.close();
	}

}

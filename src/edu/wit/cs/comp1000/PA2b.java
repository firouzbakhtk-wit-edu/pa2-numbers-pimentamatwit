package edu.wit.cs.comp1000;

import java.util.Scanner;

public class PA2b {

	// TODO: document this function
	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double d;
		double r1;
		double r2;
		
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter a b c: ");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		
		d = Math.pow(b, 2) - 4*a*c;
		r1 = ((-1*b) + Math.sqrt(d))/(2*a);
		r2 = ((-1*b) - Math.sqrt(d))/(2*a);

		
		if (d > 0) { 
			if (r1>r2) {
				System.out.printf("Roots: %.2f, %.2f%n", r2, r1);
			}else {
				System.out.printf("Roots: %.2f, %.2f%n", r1, r2);
			}
			
		}else if(d == 0) {
			System.out.printf("Root: %.2f%n", r1);
		}else {
			System.out.printf("Roots: imaginary%n");
		}

		input.close();
	}

}

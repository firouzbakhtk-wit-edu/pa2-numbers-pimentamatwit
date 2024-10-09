package edu.wit.cs.comp1000;

import java.util.Scanner;

// TODO: document this class
public class PA2a {

	// TODO: document this function
	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int n4 = 0;
		int n5 = 0;
		int sum_all;
		int sum_non = 0;
		int sum_pos = 0;
		int p = 0;
		int n = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter five whole numbers: ");
		n1 = input.nextInt();
		n2 = input.nextInt();
		n3 = input.nextInt();
		n4 = input.nextInt();
		n5 = input.nextInt();

		//sum of pos numbers and neg numbers
		if (n1 > 0) {
			sum_pos = sum_pos + n1;
			p = p+1;
			}else {
				sum_non = sum_non + n1;
				n = n + 1;
			}
		if (n2 > 0) {
				sum_pos = sum_pos + n2;
				p = p+1;
			}else {
				sum_non = sum_non + n2;
				n = n+1;
			}
		if (n3>0) {
				sum_pos = sum_pos + n3;
				p = p+1;
			}else {
				sum_non = sum_non + n3;
				n = n+1;
			}
		if (n4>0) {
				sum_pos = sum_pos + n4;
				p = p+1;
			}else {
				sum_non = sum_non + n4;
				n = n+1;
			}
		if (n5>0) {
				sum_pos = sum_pos + n5;
				p = p+1;
			}else {
				sum_non = sum_non + n5;
				n = n+1;
			}
		
		if(p > 1 || p==0) {
			System.out.printf("The sum of the %d positive numbers: %d%n", p, sum_pos);
		}else {
			System.out.printf("The sum of the %d positive number: %d%n", p, sum_pos);
		}
		
		if (n>1 || n==0) {
			System.out.printf("The sum of the %d non-positive numbers: %d%n", n, sum_non);
		}else {
			System.out.printf("The sum of the %d non-positive number: %d%n", n, sum_non);
		}
		//writes all sum
		sum_all = n1 + n2 + n3 + n4 + n5;
		System.out.printf("The sum of the 5 numbers: %d%n", sum_all);
		
		
		
		//avg pos and non
		double pos = (double)p;
		double sp = (double)sum_pos;
		double non = (double)n;
		double sn = (double)sum_non;
		double as = (double)sum_all;
		double avsp;	
		double avnp;
		
		avsp = sp/pos;
		avnp = sn/non;
			
		
		if (sp == 0) {
			avsp = 0;
		}
		
		if (sn == 0) {
			avnp = 0;
		}
		
		as = as/5;
		
		if(p > 1 || p == 0){
			System.out.printf("The average of the %d positive numbers: %.2f%n", p, avsp);
		}else {
			System.out.printf("The average of the %d positive number: %.2f%n", p, avsp);
		}
		
		if (n > 1 || n == 0) {
			System.out.printf("The average of the %d non-positive numbers: %.2f%n", n, avnp);
		}else {
			System.out.printf("The average of the %d non-positive number: %.2f%n", n, avnp);
		}
		
		System.out.printf("The average of the 5 numbers: %.2f%n", as);
		
		
		input.close();
	}

}

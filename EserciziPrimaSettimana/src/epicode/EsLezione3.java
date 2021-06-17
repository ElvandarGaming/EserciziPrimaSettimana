package epicode;

import java.util.Arrays;
import java.util.Scanner;


public class EsLezione3 {

	public static void main(String[] args) {
		//int N =30;
	
		Scanner console = new Scanner(System.in);
		System.out.println("Inserisci un numero bastardo, che ti calcolo il fattoriale in zero due");
		int N = console.nextInt();
		
		console.close();
		
		if (fattoriale(N) == -1) {
			System.out.println("Factorial of "+ N + " is too big for this method");
		}
		else {
			System.out.println("il fattoriale di "+ N + " è " + fattoriale(N));
		}
		
		System.out.println(fibonacci(N));
		System.out.println(fizzbuzz(N));
	}

	public static long fattoriale(int a) {
		if(a>20) {
			return -1;
		}
		
		long t = 1;
		for (int i = 1; i <= a; i++) {
			t = t * i;
		}
		return t;
	}

	public static String fibonacci(int a) {
		String fibonacci = "I primi " + a + " numeri di fibonacci sono: ";
	
		if (a<=0) {
			return fibonacci = "ma sei scemo?";
		}
		if (a>92) {
			return fibonacci = "Inserire un valore minore o uguale a 92";
		}
		
		long g =0;
		long h =1;
		long j =1;
		//int i =1;
		fibonacci = fibonacci + " " + j;
		/*
		while(i < a){
			j=g+h;
			g=h;
			h=j;
			
			fibonacci = fibonacci + " " + j;
			i++;
		}
		 */
		for(int i = 1; i<a ; i++) {
			j=g+h;
			g=h;
			h=j;
			fibonacci = fibonacci + " " + j;
		}
		
		return fibonacci;
	}

	
	
//	public static String[] fizzbuzz(int a) {
	public static StringBuilder fizzbuzz(int a) {
//		String[]  pet = new String[a];
		StringBuilder rat = new StringBuilder("");
		for(int i = 0, j =1 ; i < a ; i++ , j++) {
			if(j % 3 == 0 && j % 5 == 0) {
				rat = rat.append("fizzbuzz ");
			}
			else if(j%3 == 0) {
				rat = rat.append("buzz ");
			}
			else if(j % 5 == 0) {
				rat = rat.append("fizz ");
			}
			else {
				rat=rat.append(String.valueOf(j).toString() + " ");
			}
			
		}
		
		//String rat = Arrays.toString(pet);
		
		return rat;
	}

}
package epicode;

import java.util.Arrays;
import java.util.Scanner;


public class EsLezione3 {

	public static void main(String[] args) {
		//int N =30;
	
		Scanner console = new Scanner(System.in);
		System.out.println("Inserisci un numero, che ti calcolo il fattoriale in zero due");
		int N = console.nextInt();
		
		console.close();
		
		if (fattoriale(N) == -1) {
			System.out.println("Factorial of "+ N + " is too big for this method");
		}
		else {
			System.out.println("il fattoriale di "+ N + " è " + fattoriale(N));
		}
		
		System.out.println(fibonacci(N));
		System.out.println(fizzBuzz(N));
		fizzBuzzOriginal(N);
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

	public static void fizzBuzzOriginal (int a) {
		for(int i = 1; i<a;i++) {
			if (i % 3 == 0  && i % 5 == 0 ) {
				System.out.println("fizzbuzz");
			}
			else if(i % 3 == 0){
				System.out.println("fizz");
			}
			else if(i % 5 == 0){
				System.out.println("buzz");
			}
			else {
				System.out.println(i);
			}
		}
	}
	
	public static String fizzBuzz(int a) {
		String[]  pet = new String[a];

		for(int i = 0, j =1 ; i < a ; i++ , j++) {
			pet[i]=String.valueOf(j);

			if(j%3==0) {
				pet[i] = "fizz";
			}
			if(j%5==0) {
				pet[i] = "buzz";
			}
			if(j % 3 == 0 && j % 5 == 0) {
				pet[i] = "fizzbuzz";
			}
		}

		String rat = Arrays.toString(pet);

		return rat;
	}
	
	public static StringBuilder fizzbBuzzBo(int a) {
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
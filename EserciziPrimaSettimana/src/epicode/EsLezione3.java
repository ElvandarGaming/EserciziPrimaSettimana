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

		
		System.out.println("il fattoriale di "+ N + " è " + fattoriale(N));
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
			return fibonacci = "massa numeri, meno per piacere";
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

	public static String fizzbuzz(int a) {
		String[]  pet = new String[a];
		
		for(int i = 0, j =1 ; i < a ; i++ , j++) {
			pet[i]=String.valueOf(j).toString();
		
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

}
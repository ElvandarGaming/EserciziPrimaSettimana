package epicode;

import java.util.Arrays;
//import java.util.Scanner;

public class Esercizio1 {

	public static void main(String[] args) {
		/*
		 * Scanner console = new Scanner(System.in);
		 * System.out.println("Dammi una frase"); String r = console.nextLine();
		 * System.out.println(r +" "+ r+" " +r+" " + r+" "+ r); //console.close();
		 * 
		 * //Scanner potato = new Scanner(System.in);
		 * 
		 * String[] frasi = new String[3]; for(int i=0; i<frasi.length; i++) {
		 * System.out.println("dammi frasi maledetto"); frasi[i] = console.nextLine(); }
		 * 
		 * for(int i = frasi.length; i=0; i--) {
		 * 
		 * } console.close();
		 */
		String[] frasi = { "prova", "mattina", "parola", "daasd", "sad" };
		String frase = "asfjkhasfhjkasfjkhafjhkjkfhas";
		String[] nuoveFrasi = inserisci(frasi, frase , 5);

		System.out.println(Arrays.toString(nuoveFrasi));
	}
//commento prova 
	
// SECONDO COMMENTO DI PROVA
	
	public static String[] inserisci(String[] original, String aggiunta , int pos) {
		String[] nuoveStringhe = new String[original.length + 1];
		/*
		 * nuoveStringhe[0]= original[0]; nuoveStringhe[1]= original[1];
		 * nuoveStringhe[2]= aggiunta; nuoveStringhe[3]= original[2];
		 */
		/*
		 * int i =0; while(i<2) { nuoveStringhe[i]=original[i]; i++; } nuoveStringhe[2]=
		 * aggiunta; i++; while(i<original.length+1) { nuoveStringhe[i]=original[i-1];
		 * i++; }
		 */
		for (int i = 0, j =0; j < nuoveStringhe.length; j++) {
			//j scorre array nuovo
			//i scorre array originale
			//quando arriviamo in indice 2(posizione 3) esegue else, e aggiunge la stringa data senza aumentare i
			//il ciclo poi continua senza incrementare i, e copia tutti i valori rimanenti di original partendo
			// da original[pos];
			if (j != pos) {
				nuoveStringhe[j] = original[i];
				i++;
			}
			else {
				nuoveStringhe[j]= aggiunta;
			}
		}
		return nuoveStringhe;
	}
}

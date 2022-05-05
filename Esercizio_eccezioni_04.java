package main;

import java.util.Scanner;

public class Esercizio_eccezioni_04 {

	public static void main(String[] args) {
		/*siete allo sportello automatico di una banca,
		 *per poter usufruire dei servizi  
		 *l'utente deve inserire un numero intero
		 *Creare un programma che permetta all'utente di inserirlo e
		 *gestire tramite le eccezioni ciò che l'utente digita     
		 *Ricordarsi che ha a disposizione tre tentativi 
		 *poi il programma si chiude 
		 */
		
		Scanner tastiera = new Scanner(System.in);
		int pw = 1234;
		int pwUtente;
		String ris = "";
		int contaTentativi = 3;
		boolean ripeti;
		
		do {
			ripeti = false;
			System.out.println("Inserisci il pin\n" + contaTentativi + " tentativi\n");
			try {
				pwUtente = Integer.parseInt(tastiera.nextLine());
				if(pwUtente == pw) 
					ris = "Pin corretto\nBevenuto";
				else {
					ris = "Pin errato\n";
					ripeti = true;
				}
			}
			catch(NumberFormatException e) {
				ripeti = true;
				ris = "Valore non valido\n"; 
			}
			finally {
				contaTentativi--;
				if(ripeti == true)
					ris = contaTentativi + "tentativi";
				
			}
			System.out.println(ris);
		}while(ripeti == true && contaTentativi > 0);
		tastiera.close();
	}

}

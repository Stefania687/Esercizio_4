package it.objectmethod.ese;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner tastiera = new Scanner(System.in);

		// nome
		System.out.print("Inserisci nome ");
		String nome = tastiera.nextLine();

		// formalita
		String answer = "";
		while (!answer.equals("y") && !answer.equals("n")) {
			System.out.print("Vuoi un saluto formale? y/n ");
			answer = tastiera.nextLine();
		}
		ISalutatore salutatore = null; // non posso creare un oggetto ISalutatore quindi gli assegno il valore null
		if (answer.equals("y")) {
			salutatore = new SalutatoreFormale(); // essendo che la classe implementa i metodi di ISalutatore posso
													// creare l'oggetto SalutatoreFormale

		} else if (answer.equals("n")) {
			salutatore = new SalutatoreInformale();

		}
		int answerOra = 25;
		while (answerOra >= 24 || answerOra < 0) {
			System.out.print("Che ore sono? ");
			answerOra = tastiera.nextInt();
		}
		if (answerOra > 5 && answerOra < 14) {
			System.out.print(salutatore.salutaMattino(nome)); // stampo il metodo salutaMattino dell'oggetto salutatore
		} else if (answerOra > 13 && answerOra < 23) {
			System.out.print(salutatore.salutaSera(nome));
		} else {
			System.out.print(salutatore.salutaNotte(nome));
		}

		tastiera.close();
	}

}

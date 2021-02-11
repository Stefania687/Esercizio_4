package it.objectmethod.ese;

public interface ISalutatore {

	public String salutaMattino(String nome);

	public String salutaSera(String nome);

	public String salutaNotte(String nome);
	
	/* l'interfaccia è una promessa/contratto e serve per raggruppare metodi correlati con corpi vuoti
	 * le classi che implementano tale interfaccia devono contenere il corpo del metodo definito dall'interfaccia
	 * le interfacce non possono essere usate per creare oggetti
	 * 
	 * nelle classi si usano solo i metodi definiti dall'interfaccia
	 le varie implementazione devono mantenere la promessa ma possono usare diversi modi per raggiungere l'obiettivo
	 */

}
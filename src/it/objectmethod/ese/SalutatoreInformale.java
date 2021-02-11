package it.objectmethod.ese;

public class SalutatoreInformale implements ISalutatore {
	
	/* le classi implementano i metodi dell'interfaccia
	 * 
	 */

	@Override
	public String salutaMattino(String nome) {
		
		return " ciao giorno" + nome;
	}

	@Override
	public String salutaSera(String nome) {
		return "ciao sera" + nome;
	}

	@Override
	public String salutaNotte(String nome) {
		return "ciao notte" + nome;
	}

}

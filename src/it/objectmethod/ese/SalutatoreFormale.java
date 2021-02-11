package it.objectmethod.ese;

public class SalutatoreFormale implements ISalutatore {

	@Override
	public String salutaMattino(String nome) {
		return "buongiorno" + nome;
	}

	@Override
	public String salutaSera(String nome) {
		return "buonasera" + nome;
	}

	@Override
	public String salutaNotte(String nome) {
		return "buonanotte" + nome;
	}


}

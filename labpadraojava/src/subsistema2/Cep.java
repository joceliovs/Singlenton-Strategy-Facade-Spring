package subsistema2;

public class Cep {

	private static Cep instancia = new Cep();
		private Cep() {
		super();
	}
	public static Cep getInstancia() {
		return instancia;
	}
	
	public String recuperarC(String cep) {
		return "Cear�";
		
		
	}
	public String recuperarE(String cep) {
		return "CE";
		
		
	}
}

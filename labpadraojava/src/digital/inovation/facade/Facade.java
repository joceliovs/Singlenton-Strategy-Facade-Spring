package digital.inovation.facade;


import subsistema1.*;
import subsistema2.*;


public class Facade {

	public void migrarCliente(String nome, String cep) {
		String cidade = Cep.getInstancia().recuperarC(cep);
		String estado = Cep.getInstancia().recuperarE(cep);
		
		services.gravarCliente(nome, cep, estado, cidade);
		
	}
}
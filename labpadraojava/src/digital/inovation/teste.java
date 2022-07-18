package digital.inovation;

import digital.inovation.facade.Facade;
import digital.inovation.singleton.SingletonEager;
import digital.inovation.singleton.SingletonLazy;
import digital.inovation.singleton.SingletonLazyHolder;
import digital.inovation.strategy.ComportAgres;
import digital.inovation.strategy.ComportDef;
import digital.inovation.strategy.ComportNormal;
import digital.inovation.strategy.Comportamento;
import digital.inovation.strategy.Robot;

public class teste {

	public static void main(String[] args) {
		// Singleton
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
	
		SingletonEager Eager = SingletonEager.getInstancia();
		System.out.println(Eager);
		
	SingletonLazyHolder Holder = SingletonLazyHolder.getInstancia();
		System.out.println(Holder);
	
	
	Comportamento normal = new ComportNormal();
	Comportamento defensivo = new ComportDef();
	Comportamento agressivo = new ComportAgres();

	Robot robot = new Robot();
	robot.setComportamento(normal);
	
	
	robot.mover();
	robot.setComportamento(defensivo);

	robot.mover();
	
	robot.setComportamento(agressivo);
	robot.mover();
	
	//facade
	
	Facade facade = new Facade();
	facade.migrarCliente("Jocelio", "62170000");
	
}
}

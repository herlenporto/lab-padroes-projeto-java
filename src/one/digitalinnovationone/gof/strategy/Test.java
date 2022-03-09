package one.digitalinnovationone.gof.strategy;

import facade.Facade;
import one.digitalinnovationone.gof.singleton.SingletonEager;
import one.digitalinnovationone.gof.singleton.SingletonLazy;
import one.digitalinnovationone.gof.singleton.SingletonLazyHolder;

public class Test {

	public static void main(String[] args) {
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);

		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazeHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazeHolder);
		lazeHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazeHolder);
		
		
		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		
		robo.setComportamento(normal);
		robo.mover();
		
		robo.setComportamento(agressivo);
		robo.mover();
		
		Facade facade = new Facade();
		facade.migrarCliente("Herlen", "15146143" );
		
		
		
		
	}

}

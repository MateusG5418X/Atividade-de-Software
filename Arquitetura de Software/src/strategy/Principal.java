package strategy;

import strategy.operacoes.Somar;
import strategy.ContextMath;

public class PrincipalSoma {
	
	public static void main(String[] args) {
		
		ContextMath math = new ContextMath(new Somar());
		
		System.out.println(math.calcular(5, 3));
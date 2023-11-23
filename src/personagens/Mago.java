package personagens;

import armas.Cajado;
import lib.Helpers;

public class Mago extends Personagem{
	
	
	public Mago(String name) {
		super(name, new Cajado(), 400.0, "Mago");
		// TODO Auto-generated constructor stub
	}

	public void tomarDano(Double damage) {

		damage = this.mandarMagiaDeDefesa(damage);
		
		this.numeroDeVidas = this.numeroDeVidas - damage;
		if(this.numeroDeVidas<=0) this.morrer();
		else System.out.println("Você tomou dano, e agora você tem => " + this.numeroDeVidas + " vidas;");
	}
	
	private Double mandarMagiaDeDefesa(Double damage) {
		System.out.println("Sou o mago: " + this.name + " e mandei a magia!!");
		int fracaoDoDano = new Helpers().geradorNumeroAleatorio();
		return damage/fracaoDoDano;
	}
}

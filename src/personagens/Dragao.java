package personagens;

import armas.BafoDeFogo;
import lib.Helpers;

public class Dragao extends Personagem{

	public Dragao(String name) {
		super(name, new BafoDeFogo(), 1000.0, "Dragão", "dragao.png");
		// TODO Auto-generated constructor stub
	}
	
	public void tomarDano(Double damage) {
//		Se o número aleatório for PAR o dragão voa e ele toma metade do Dano
		int randomNumber = new Helpers().geradorNumeroAleatorio();
		
		if(randomNumber % 2 == 0) damage = this.voar(damage);
		
		this.numeroDeVidas = this.numeroDeVidas - damage;
		if(this.numeroDeVidas<=0) this.morrer();
		else System.out.println("Você tomou dano, e agora você tem => "+this.numeroDeVidas+" vidas;");
	}
	
	private Double voar(Double damage) {
		System.out.println("Sou o dragão: " + this.name + " e estou voando!! \nEntão tomo somente a metade do dano !!");
		int fracaoDoDano = new Helpers().geradorNumeroAleatorio();
		return damage/fracaoDoDano;
	}

}

package personagens;

import armas.Arma;
import lib.Helpers;

public class Personagem {
	
	String name;
	Arma arma;
	Double numeroDeVidas;
	
	public Personagem(String name, Arma arma, Double numeroDeVidas) {
		super();
		this.name = name;
		this.arma = arma;
		this.numeroDeVidas = numeroDeVidas;
	}
	
	public void desenhar() {
		
	}
	
	public void morrer() {
		System.out.println("Voce Morreu");
	}
	
	public void tomarDano(Double damage) {
//		Se o número aleatório for divisível por 3 o dragão voa e ele toma metade do Dano
		int randomNumber = new Helpers().geradorNumeroAleatorio();
		
		if(randomNumber % 3 == 0) damage = this.correr(damage);
		
		this.numeroDeVidas = this.numeroDeVidas - damage;
		if(this.numeroDeVidas<=0) this.morrer();
		else System.out.println("Você tomou dano, e agora você tem => "+this.numeroDeVidas+" vidas;");
	}
	
	private Double correr(Double damage) {
		System.out.println("Sou o " + this.name + " e estou correndo!!");
		int fracaoDoDano = new Helpers().geradorNumeroAleatorio();
		return damage/fracaoDoDano;
	}
	
	public void falar(String frase) {
		System.out.println(this.name + " falou: " + frase);
	}
	
	public void arma() {
		arma.usarArma();		
	}
	public void setArma(Arma arma) {
		this.arma = arma;
	}
	public String getProfile() {
		String name = "---------  "+this.name+"  ---------";
		String arma = "\nArma: "+this.arma.getName()+" - Dano: "+this.arma.getDamage();
		String vidas = "\nNúmero de vidas: " + this.numeroDeVidas;
		String profileDescription = name+arma+vidas;
		
		System.out.println("getProfile run");

		return profileDescription;
	}

}

package personagens;

import armas.Arma;

public class Personagem {
	
	String name;
	Arma arma;
	
	public Personagem(String name, Arma arma) {
		super();
		this.name = name;
		this.arma = arma;
	}
	
	public void desenhar() {
		
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
		String name = "---------  "+this.name+"  ---------\n";
		String arma = "Arma: "+this.arma.getName()+" - Dano: "+this.arma.getDamage();
		String profileDescription = name+arma;
		
		System.out.println(profileDescription);

		return profileDescription;
	}
}

package armas;

public class Arma {
	String name;
	Double damage;
	
	public Arma(String name, Double damage) {
		this.name = name;
		this.damage = damage;
	}
	
	public Double  usarArma() {
		System.out.println("Chamando o metodo usarArma com a arma "+this.name);
		return this.damage;
	} 
	
	public String getName() {
		return name;
	}
	public Double getDamage() {
		return damage;
	}
		
}

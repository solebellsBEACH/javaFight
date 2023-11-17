package armas;

public class Arma {
	String name;
	Integer damage;
	
	public Arma(String name, Integer damage) {
		this.name = name;
		this.damage = damage;
	}
	
	public void  usarArma() {
		System.out.println("Chamando o metodo usarArma com a arma "+this.name);
	} 
	
	public String getName() {
		return name;
	}
	public Integer getDamage() {
		return damage;
	}
		
}

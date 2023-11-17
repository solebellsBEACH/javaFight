package armas;

public class Fuzil extends Arma{
	
	Integer quantBullets;
	boolean isAuto;
	
	public Fuzil(String name, Integer damage, Integer quantBullets, boolean isAuto) {
		super(name, damage);
		this.quantBullets = quantBullets;
		this.isAuto = isAuto;
	}
	

}

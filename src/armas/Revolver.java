package armas;

public class Revolver extends Arma{
	
	Integer quantBullets;
	boolean isAuto;
	
	public Revolver(String name, Integer damage, Integer quantBullets, boolean isAuto) {
		super(name, damage);
		this.quantBullets = quantBullets;
		this.isAuto = isAuto;
	}
	
}

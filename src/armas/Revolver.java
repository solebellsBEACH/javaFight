package armas;

public class Revolver extends Arma{
	
	Integer quantBullets;
	boolean isAuto;
	
	public Revolver() {
		super("Revolver", 120.5);
		this.quantBullets = 5;
		this.isAuto = false;
	}
	
}

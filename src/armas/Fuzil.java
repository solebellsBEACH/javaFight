package armas;

public class Fuzil extends Arma{
	
	Integer quantBullets;
	boolean isAuto;
	
	public Fuzil() {
		super("Fuzil", 300);
		this.quantBullets = 20;
		this.isAuto = true;
	}
	

}

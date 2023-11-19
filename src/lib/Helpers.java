package lib;
import java.util.Random;

public class Helpers {
	public int geradorNumeroAleatorio() {
	        Random random = new Random();
	        int numeroAleatorio = random.nextInt(10) + 1;
	        
	        return numeroAleatorio;
	   
	}
}

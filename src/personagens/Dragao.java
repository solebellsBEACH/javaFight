package personagens;

import armas.BafoDeFogo;

public class Dragao extends Personagem{

	public Dragao(String name) {
		super(name, new BafoDeFogo());
		// TODO Auto-generated constructor stub
	}
	
	public void voar() {
		System.out.println("Sou o dragão: "+this.name+" e estou voando!!");
	}

}

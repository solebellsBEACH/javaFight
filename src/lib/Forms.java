package lib;

import main.GameManager;

public class Forms {
	public void MenuForm(GameManager manager) {
		int opcao = 1000;
		while(opcao != 0) {
			opcao = InOut.leInt("0-Encerrar operação \n1-Listar Personagens");
			int numOpcoes = 1;
			switch (opcao) {
			case 0: 
				InOut.MsgDeAviso("Até mais !!", "Você encerrou o processo, até uma outra hora !!");
				break;
			case 1: {
				InOut.MsgDeAviso("Lista de Personagens!!", manager.listPersonagensDefault());
				break;
			}
			default:
				throw new IllegalArgumentException("O Valor " + opcao +" não é valido, digite um valor entre 0 e "+ numOpcoes);
			}	
		}
	}
}

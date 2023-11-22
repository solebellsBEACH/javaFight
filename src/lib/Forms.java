package lib;

import main.GameManager;

public class Forms {
	public void MenuForm(GameManager manager) {
		int opcao = 1000;
		while(opcao != 0) {
			opcao = InOut.leInt("0-Encerrar operação \n1-Listar Personagens \n2-Escolher seu personagem");
			int numOpcoes = 2;
			switch (opcao) {
			case 0: 
				InOut.MsgDeAviso("Até mais !!", "Você encerrou o processo, até uma outra hora !!");
				break;
			case 1: {
				InOut.MsgDeAviso("Lista de Personagens!!", manager.listPersonagensDefault());
				break;
			}
			case 2: {
				int indexPersonagemPlayer = InOut.leInt("Insira o index do seu Personagem");
				String name = InOut.leString("Insira o nome do seu Personagem");
				manager.setPersonagemPlayer(indexPersonagemPlayer, name);
				
				int indexPersonagemAdversario = InOut.leInt("Insira o index do Personagem do seu Adversário");
				String nameAdversario = InOut.leString("Insira o nome do seu Adversário");
				manager.setPersonagemAdversario(indexPersonagemAdversario, nameAdversario);
				opcao = 0;
				break;
			}
			default:
				throw new IllegalArgumentException("O Valor " + opcao +" não é valido, digite um valor entre 0 e "+ numOpcoes);
			}	
		}
	}
	
	
}

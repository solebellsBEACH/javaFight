package lib;

import main.GameManager;
import personagens.Personagem;

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
				throw new IllegalArgumentException("O Valor " + opcao + " não é valido, digite um valor entre 0 e "+ numOpcoes);
			}	
		}
	}
	
	public void GameForm(GameManager manager) {
		Personagem Player = manager.getPersonagemPlayer();
		Personagem Adversario = manager.getPersonagemAdversario();
		int countPlayer = 0; // se for impar ele troca o personagem 
		while (Player.getNumeroDeVidas() > 0 && Adversario.getNumeroDeVidas() > 0) {
			if(countPlayer % 2 == 0)this.BattleForm(Player, Adversario);
			else this.BattleForm( Adversario, Player);
			countPlayer = countPlayer+1;
		}
		
	}
	
	private void BattleForm (Personagem player, Personagem playerAdv ) {
		Double dano = player.arma();
		playerAdv.tomarDano(dano);
		Double vidaAdv = playerAdv.getNumeroDeVidas();
		if(vidaAdv<=0)InOut.MsgDeAviso("Ja era !!", "Fim da linha para "+playerAdv.getName()+", o "+player.getName()+" venceu essa partida!!!");
		else InOut.MsgDeAviso("Executar ataque: "+player.getArma().getName(), playerAdv.getName()+" agora tem "+ vidaAdv +" vidas!!");
		
	}
	
}

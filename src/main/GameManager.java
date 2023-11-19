package main;

import java.util.ArrayList;
import java.util.List;

import personagens.CraqueNeto;
import personagens.Dragao;
import personagens.General;
import personagens.LutSUMO;
import personagens.Mago;
import personagens.Personagem;
import personagens.Soldado;

public class GameManager {
	List<Personagem> listaDePersonagensDefault = new ArrayList<>();
	
	public void cadastrarPersonagensDefault() {
		listaDePersonagensDefault.add(new Dragao("Dragão Default"));
		listaDePersonagensDefault.add(new General("General Default"));
		listaDePersonagensDefault.add(new Soldado("Soldado Default"));
		listaDePersonagensDefault.add(new LutSUMO("Lutador de Sumo Default"));
		listaDePersonagensDefault.add(new CraqueNeto("Craque Neto Default"));
		listaDePersonagensDefault.add(new Mago("Mago Default"));
	}
	
	public String listPersonagensDefault() {
		String list = "";
		int i  = 0;
		while(i<listaDePersonagensDefault.size()) {
			list = list +"\n"+i+"- "+listaDePersonagensDefault.get(i).getProfile();
			i++;
		}
        return list;
	}
}

package main;

import lib.Forms;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameManager manager = new GameManager();
		Forms forms = new Forms();
		
		manager.cadastrarPersonagensDefault();
		
		forms.MenuForm(manager);
		
		forms.GameForm(manager);

	}

}

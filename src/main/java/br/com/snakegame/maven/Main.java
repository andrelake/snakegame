package br.com.snakegame.maven;

import javax.swing.JFrame;

public class Main {
	
	public Main() {
		
		JFrame frame = new JFrame();  //cria objeto janela
		GamePanel gamepanel = new GamePanel();
		
		frame.add(gamepanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("SnakeGame by xuxaum");
		
		frame.pack(); //dimensionamento
		frame.setVisible(true);
		frame.setLocationRelativeTo(null); // centraliza na tela

	}
	
	public static void main(String[] args) {
		
		new Main();
		
	}
}

package br.com.senaisp.bauru.aula07;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public abstract class Desenho extends JPanel {
	//Cria ndo uma variável estática
	private static int qtdeInstancias = 0;
	private static final long serialVersionUID = 1L;
	private int posX;
	public int getPosX() {
		return posX;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}
	public Color getCor() {
		return cor;
	}
	public void setCor(Color cor) {
		this.cor = cor;
	}
	private int posY;
	private Color cor;
	//Constructor
	public Desenho(int posX, int posY, Color cor) {
		qtdeInstancias++;
		this.posX = posX;
		this.posY = posY;
		this.cor = cor;
	}
	//metodo abstrato de desenharForma
	protected abstract void desenharForma(Graphics g);
	//metodo mostrar desenho
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		desenharForma(g);
	}
	//Método estático
	public static int getQtdeInstancias() {
		return qtdeInstancias;
		
	}
}
	
	
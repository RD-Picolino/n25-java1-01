import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta é uma classe que representará uma Abelha.
 * 
 * @author Picoloto 
 * @version 2025-06-04
 */
public class Abelha extends Actor
{
    /**
     * Act - do whatever the Abelha wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        move(1);
        if (Greenfoot.isKeyDown("A")){
            turn(-5);
        }
        if (Greenfoot.isKeyDown("D")){
            turn(5);            
        }
        verificarPosicao();
    }
    /**
     * Método que verifica a posição da Abelha.
     */
    public void verificarPosicao(){
        if(estaNoTopo()){
            setLocation(getX(), getWorld().getHeight()-10);
        }
        if (estaNaBase()){
            setLocation(getX(), 10);
        }
        if (estaNaEsquerda()){
            setLocation(getWorld().getWidth()-10, getY());
        }
        if (estaNaDireita()){
            setLocation(getY(), 10);
        }
    }
    /**
     * Método que verifica se a abelha está no topo.
     */
    public boolean estaNoTopo(){
      return getY()<10;
    }
    /**
     * Método que verifica se a abelha está na base.
     */
    public boolean estaNaBase(){
        return getY()>getWorld().getHeight()-10;
    }
    /**
     * Método que verifica se a abelha está na esquerda.
     */
    public boolean estaNaEsquerda(){
        return getX()<10;
    }
    /**
     * Método que verifica se a abelha está na direita.
     */
    public boolean estaNaDireita(){
        return getX()>getWorld().getWidth()-10;
    }
}
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Aqui é a Classe Mosca.
 * 
 * @author Picoloto
 * @version 2025-06-03
 */
public class Mosca extends Inseto
{
    //fields
    private int velocidade;
    private int rotacao;
    //Constructor
    public Mosca(){
        velocidade = 1;
        rotacao = 0;
    }
    //Constructor com parametros
    public Mosca(int vel, int rot){
        velocidade = vel;
        rotacao = rot;
        setRotation(rot);
    }
    /**
     * Act - Metodo responsável pelas ações da Mosca quando
     * os botões Act ou Run são pressionados.
     */
    public void act()
    {
        // Add your action code here.
        move(velocidade);
        if(Greenfoot.getRandomNumber(100)<20){
            turn(45-Greenfoot.getRandomNumber(90));
        }
        verificarCanto();
    }
}

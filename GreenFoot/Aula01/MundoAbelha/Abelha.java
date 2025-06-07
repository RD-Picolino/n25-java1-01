import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta é uma classe que representará uma Abelha.
 * 
 * @author Picoloto 
 * @version 2025-06-04
 */
public class Abelha extends Actor
{
    //Definindo os fields
    int vidas;
    int score;
    int PONTOS = 100;
    //Definindo o constructor.
    /**
     * Constructor da classe Abelha.
     */
    public Abelha(){
        vidas = 3; //vai ter três vidas
        score = 0;
    }
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
        if (Greenfoot.isKeyDown("shift")){
            move(2);
        }
        verificarPosicao();
        capturarMosca();
        serCapturadoPelaAranha();
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
    /**
     * Método que captura a mosca.
     */
    public void capturarMosca(){
        if (isTouching(Mosca.class)){
            removeTouching(Mosca.class);
            Greenfoot.playSound("slurp.wav");
            atualizarScore();
            int posX = Greenfoot.getRandomNumber(getWorld().getWidth())+1;
            int posY = Greenfoot.getRandomNumber(getWorld().getHeight())+1;
            Mosca mosca = new Mosca();
            getWorld().addObject(mosca, posX, posY);
        }
    }
    /**
     * Método que captura a mosca.
     */
    public void capturarMosca2(){
        Actor mosca = getOneIntersectingObject(Mosca.class);
        if (mosca !=null){
            getWorld().removeObject(mosca);
        }
    }
    /**
     * Método que captura a abelha.
     */
    public void serCapturadoPelaAranha(){
        if (isTouching(Aranha.class)){
            Greenfoot.playSound("ouch.wav");
            int posX = Greenfoot.getRandomNumber(getWorld().getWidth())+1;
            int posY = Greenfoot.getRandomNumber(getWorld().getHeight())+1;
            setLocation(posX, posY);
            vidas--;
            if (vidas<=0){
                getWorld().showText("GAME OVER", 400, 300);
                Greenfoot.stop();
            }
        }
    }
    
    public void atualizarScore(){
        score += PONTOS; //score = score + PONTOS
        getWorld().showText("Score: " + score, 100, 50);
    }
}
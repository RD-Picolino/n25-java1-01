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
    private int vidas;
    private int indice;
    private GreenfootImage imgs[];
    //Definindo o constructor.
    /**
     * Constructor da classe Abelha.
     */
    public Abelha(){
        vidas = 3; //vai ter três vidas
        //GreenfootImage img = new GreenfootImage("bee01.png");
        //setImage(img);
        indice = 0;
        imgs = new GreenfootImage[4];//Definindo vetor de 4 posições.
        for (int i=0; i<4; i++){
            imgs[i] = new GreenfootImage("bee0" + (i+1) + ".png");
        }
        setImage(imgs[indice]);
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
            move(3);
        }
        verificarPosicao();
        capturarMosca();
        serCapturadoPelaAranha();
        animarAbelha();
        atualizarVidas();
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
            ((BeeWorld) getWorld()).updateScore();
            int posX = Greenfoot.getRandomNumber(getWorld().getWidth())+1;
            int posY = Greenfoot.getRandomNumber(getWorld().getHeight())+1;
            Mosca mosca = new Mosca(Greenfoot.getRandomNumber(3)+1, Greenfoot.getRandomNumber(360));
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
    public void animarAbelha(){
        indice = (indice + 1) % 4;
        setImage(imgs[indice]);
    }
    public void atualizarVidas(){
        getWorld().showText("Vidas: " + vidas, 700, 10);
    }
}
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Aranha aranha = new Aranha();
        addObject(aranha,32,34);
        Mosca mosca = new Mosca();
        addObject(mosca,28,378);
        Abelha abelha = new Abelha();
        addObject(abelha,29,191);
        Mosca mosca2 = new Mosca();
        addObject(mosca2,568,31);
        Mosca mosca3 = new Mosca();
        addObject(mosca3,206,87);
        abelha.setLocation(513,335);
        Mosca mosca4 = new Mosca();
        addObject(mosca4,269,276);
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * food for elephant.
 * 
 * @author Lucian 
 * @version May 1, 2026
 */
public class Apple extends Actor
{
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int x = getX();
        int y = getY();
        setLocation(x, y);
        MyWorld world = (MyWorld)getWorld();
        if(getY() <= world.getHeight()){
            world.gameOver();
            world.removeObject(this);
        }
    }
}

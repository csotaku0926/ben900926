import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class enemy_bullet extends Actor
{
    GreenfootImage missile = new GreenfootImage("missile.jpg");
    GreenfootImage explosion = new GreenfootImage("exploded.png");
    public void addedToWorld(World space_bg)
    {
        setImage(missile);
        setRotation(180);
    }
    public void act() 
    {
        // Add your action code here.
        move(6);
        turn(Greenfoot.getRandomNumber(5) - 2);
        
        if(isTouching(player.class))
        {
            removeTouching(player.class);
            setImage(explosion);
        }
        if(isAtEdge())
        {
            getWorld().removeObject(this);
        }
    }
    
}

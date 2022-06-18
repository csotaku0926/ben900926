import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    public class bullett extends Actor
{
    int point = 0;
    public void addedToWorld(World space_bg)
    {
        GreenfootImage bullet = new GreenfootImage("bullet.jpg");
        setImage(bullet);
    }  
     public void act() 
    {
        // Add your action code here.
        GreenfootImage explosion = new GreenfootImage("exploded.png");
        boolean exploded = getImage().equals(explosion);
        move(6);
        if(!exploded && isTouching(enemy.class))
        {
            setImage(explosion);
            removeTouching(enemy.class);
            point = point + 10;
        }
        if(isAtEdge()){
        getWorld().removeObject(this);

        }
    }
 
}    


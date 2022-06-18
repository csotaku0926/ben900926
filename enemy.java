import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class enemy extends Actor
{
    public int x_coor = 0;
    public int y_coor = 0;
    public void addedToWorld(World space_bg)
    {
        x_coor = getX();y_coor = getY();
       
    }
    public void shoot()
    {
        int obj_num = getWorld().numberOfObjects();
        enemy_bullet bullet = new enemy_bullet();
        if(obj_num <=7 )
        {
            getWorld().addObject(bullet,getX(),getY());
            
        }
        
    }
    public void movement()
    {
       int fx = x_coor;
       int fy = y_coor;
       if(Greenfoot.mouseMoved(null))
       {
           MouseInfo mouse_facing = Greenfoot.getMouseInfo();
           fx = mouse_facing.getX();
           fy = mouse_facing.getY();
           turnTowards(fx,fy);
       } 
       move(1);
    }
    public void act() 
    {
        movement();
        shoot();
        
    }    
}

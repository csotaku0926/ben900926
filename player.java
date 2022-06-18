import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class player extends Actor
{
    public int x_coor=0,y_coor=0;
    public void addedToWorld(World space_bg)
    {
        x_coor = getX(); y_coor = getY();
    
    
    }
    public void move()
    {
        double rx = x_coor-getX();
        double ry = y_coor-getY();
        double r = Math.sqrt(rx*rx+ry*ry);
        int limit = 6;
        int fin_x = 0, fin_y = 0;
        if(r > limit){
            fin_x = (int)(getX()+limit*rx/r);
            fin_y = (int)(getY()+limit*ry/r);
        }
        else{
            fin_x = x_coor;
            fin_y = y_coor;       
        }
        setLocation(fin_x,fin_y);
    }
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseMoved(null)){
            MouseInfo mouse_coor = Greenfoot.getMouseInfo();
            x_coor = mouse_coor.getX();
            y_coor = mouse_coor.getY();                               
        } 
        move();
        shoot();
    }
    public void shoot()
    {
        if(Greenfoot.mousePressed(null))
        {
            
            bullett bullet = new bullett();
            getWorld().addObject(bullet,getX(),getY());
        }
    }
}

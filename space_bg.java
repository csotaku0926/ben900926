import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class space_bg extends World
{
    int point = 0;
    public void game_over()
    {
        int number = numberOfObjects();
        if(getObjects(player.class).isEmpty())
        {
            showText("GAME OVER!",250,250);
            Greenfoot.stop();
        }
    }
    public void reproduce()
    {
        int number = getObjects(enemy.class).size();
        if(number<3)
        {
            int ranint = Greenfoot.getRandomNumber(336);
            addObject(new enemy(),500,27+ranint);
            point = point +10;
        }
    }    
    public space_bg()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        addObject(new player(),100,100);
        int number = numberOfObjects();
        for(int i=0;i<3;i++)
        {
            int ranint = Greenfoot.getRandomNumber(336);            
            addObject(new enemy(),500,27+ranint);
        }
    }
    private void score()
    {
        String point_text = String.valueOf(point);
        showText("Score:"+point_text,50,370);
        
    }
    public void act()
    {
        game_over();
        reproduce();
        score();
    }
}

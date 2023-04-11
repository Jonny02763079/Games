package at.ronny.games.RectangleOvalCircle;

import at.ronny.games.firstgame.Rectangles;
import org.newdawn.slick.*;

public class RectanglesOvalCircle extends BasicGame {

    private float x;
    private float y;
    private float x1;
    private float y1;
    private float x2;
    private float y2;
    private float speed;
    private boolean rollback;
    public RectanglesOvalCircle(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.speed = 5.0f;
        this.y = 100;
        this.x = 100;
        //this.rollback = false;
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        if (this.x <= 600 && this.y <= 100){
            this.x += (float) delta/this.speed;  //Rectangle
        } else if (this.x >= 600 && this.y <= 400){
            this.y += (float) delta/this.speed;  //Rectangle
        } else if (this.x >= 100 && this.y <= 500){
            this.x -= (float) delta/this.speed;
        } else if (this.x <= 100 && this.y >= 100){
            this.y -= (float) delta/this.speed;
        }

        if (this.x1 <= 700 && this.y1 <= 0 && this.rollback == false) {
            this.x1 += (float) delta/this.speed; //Oval
            if (this.x1 == 700 && this.y1 <= 0){
                this.rollback = true;
            }
        } else if (this.x1 >=0 && this.y1 <= 0 && this.rollback == true){
            this.x1 -= (float) delta/this.speed; //Oval
        }
            /*


            this.y2 += (float) delta/this.speed; //Kreis

        if ()*/
        }





    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect(this.x, this.y, 100, 100);
        graphics.drawOval(this.x1, this.y1, 100, 60);
        graphics.drawOval(this.x2, this.y2, 100, 100);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new RectanglesOvalCircle("RectanglesOvalCircle"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
}
}

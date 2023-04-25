package at.ronny.games.taskOne;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;

public class Circle implements Actor{
    private float x,y;;
    private float size;
    private float speed;

    public Circle(float x, float y, float size, float speed) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.speed = speed;
    }

    @Override

    public void render(Graphics graphics) {

        graphics.drawOval(this.x, this.y, this.size, this.size);


    }

    @Override
    public void update(GameContainer gc, int delta) {
        this.size += 0.01;
        if (this.size >= 110){
            this.size = 0;
        }

        this.x += delta/this.speed;
        if (this.x >= 800){
            this.x = 0;
        }
        if(gc.getInput().isKeyDown(Input.KEY_SPACE)){
            System.out.println("space");
            this.y++;
        }

    }
}

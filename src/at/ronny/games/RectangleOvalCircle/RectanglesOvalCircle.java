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
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
            this.y += (float) delta/this.speed;
            this.x += (float) delta/this.speed;
            this.x1 += (float) delta/this.speed;
            this.y2 += (float) delta/this.speed;


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

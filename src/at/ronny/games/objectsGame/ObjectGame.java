package at.ronny.games.objectsGame;

import at.ronny.games.RectangleOvalCircle.RectanglesOvalCircle;
import org.newdawn.slick.*;

public class ObjectGame extends BasicGame {
    private Rectangle rectangle;
    public ObjectGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.rectangle = new Rectangle(100, 100, 5);
    }

    @Override
    public void update(GameContainer gameContainer, int i) throws SlickException {
        this.rectangle.update(i);
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        this.rectangle.render(graphics);
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new ObjectGame("ObjectGame"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}

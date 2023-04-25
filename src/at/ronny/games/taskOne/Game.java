package at.ronny.games.taskOne;

import at.ronny.games.objectsGame.ObjectGame;
import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game extends BasicGame {
    private List<Actor> actors;

    public Game(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actors = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i <= 10; i++) {
            Circle circle = new Circle(random.nextInt(800), random.nextInt(600), random.nextInt(100) + 10,random.nextInt(40) + 10);
            this.actors.add(circle);
        }
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Actor actor : this.actors) {
            actor.update(gameContainer,delta);
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawString("Y Wert:" ,100,100);

        for (Actor actor : this.actors){
            actor.render(graphics);
        }
    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Game("Game"));
            container.setDisplayMode(800,600,false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}

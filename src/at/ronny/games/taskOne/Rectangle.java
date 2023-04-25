package at.ronny.games.taskOne;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;

public class Rectangle implements Actor{
    @Override
    public void render(Graphics graphics) {

    }

    @Override
    public void update(GameContainer gc, int i) {


        if(gc.getInput().isKeyDown(Input.KEY_SPACE)){
            System.out.println("space");
        }
    }
}

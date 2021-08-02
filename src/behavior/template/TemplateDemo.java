package behavior.template;

import behavior.template.core.BasketBall;
import behavior.template.core.FootBall;
import behavior.template.core.Game;

/**
 * @author wind
 */
public class TemplateDemo {

    public static void main(String[] args) {
        Game game = new BasketBall();
        game.play();
        game = new FootBall();
        game.play();
    }
}

package com.wind.dp.behavior.template;

import com.wind.dp.behavior.template.core.BasketBall;
import com.wind.dp.behavior.template.core.FootBall;
import com.wind.dp.behavior.template.core.Game;

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

package behavior.template.core;

/**
 * @author wind
 */
public class FootBall extends Game {

    @Override
    public void initialize() {
        System.out.println("FootBall初始化");
    }

    @Override
    public void start() {
        System.out.println("FootBall开始");
    }

    @Override
    public void end() {
        System.out.println("FootBall结束");
    }
}

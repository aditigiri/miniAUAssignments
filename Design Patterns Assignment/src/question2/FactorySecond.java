package question2;

public class FactorySecond implements Factory {
	@Override
    public Ball createBall() {
        return new BallSecond();
    }

    @Override
    public Bat createBat() {
        return new BatSecond();
    }

}

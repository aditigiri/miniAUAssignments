package question2;

public class FactoryFirst implements Factory {
	@Override
    public BatFirst createBat() {
        return new BatFirst();
    }

    @Override
    public BallFirst createBall() {
        return new BallFirst();
    }

}

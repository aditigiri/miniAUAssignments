package question2;

public class Products {

	private Ball ball;
	private  Bat bat;

	public Products(Factory fact) 
	{
		bat = fact.createBat();
		ball = fact.createBall();
	}


	public void create() 
	{
		bat.createBat();
		ball.createBall();
	}

}

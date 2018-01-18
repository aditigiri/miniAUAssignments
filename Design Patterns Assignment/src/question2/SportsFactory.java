package question2;

public class SportsFactory {
	private static Products configureProducts() 
	{
        Products app;
        Factory factory;
        
        String instrument = "First".toLowerCase();
        if (instrument.contains("first")) {
            factory = new FactoryFirst();
            app = new Products(factory);
        } else {
            factory = new FactorySecond();
            app = new Products(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Products app = configureProducts();
        app.create();
    }

}

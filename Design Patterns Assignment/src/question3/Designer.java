package question3;

public abstract class Designer {

	public final void buildHouse()
	{
		DesignStructure();
	    DesignWalls();
	    DesignDoors();
	    DesignWindows();
	    DesignFurnishing();
		System.out.println("House is fully built");
	}

	private void DesignStructure() 
	{
		System.out.println("Structure of the house is designed");
	}

	private void DesignWindows() 
	{
		System.out.println("Windows of the house is built");
	}	

	private void DesignDoors() 
	{
		System.out.println("Doors of the house is built");
	}

	private void DesignFurnishing() 
	{
		System.out.println("Furnishings of the house are designed");
	}

	public abstract void DesignWalls();
		
}
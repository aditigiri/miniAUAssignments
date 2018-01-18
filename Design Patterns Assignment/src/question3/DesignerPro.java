package question3;

public class DesignerPro 
{
	public static void main(String[] args) 
	{	
		Designer type = new MetalHouse();
		System.out.println("Metalhouse");
		type.buildHouse();
		
		
		type = new GlassHouse();
		System.out.println("\n\nGlasshouse");
		type.buildHouse();
	}

}

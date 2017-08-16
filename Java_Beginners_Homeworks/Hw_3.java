
public class Hw_3 {

	private static double area;
	private static double width;
	private static double height;
	private static double perimeter;
	

	public static void main(String[] args) {
		
	//Assign a width 4.5
		width = 4.5;
		
	//Assign a height 7.9
		height = 7.9;
		
	//Compute area
		area = width * height;
	//Compute perimeter
		perimeter = 2*(height + width );
		
	
	//Display Results for area
		System.out.println("area = width * height");
		System.out.println((("area")+(" = ")+("width " + width)+ " * " + ("height " + height))); 
		System.out.println("area = " +area);
		
		
	//Display Results for perimeter
		System.out.println("perimeter = 2 * (height + width)");
		System.out.println("perimeter = 2 * (height "  + height + (" + width " + width +(")")));
		System.out.println((("perimeter")+(" = ")+(perimeter))); 
		
		
		// TODO Auto-generated method stub

	}

}

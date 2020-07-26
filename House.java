import java.util.*;

public class House {

	static {

		Scanner sc = new Scanner(System.in);
		
		System.out.format("%s","various types of material standards for building a house available are \nstandard\nabove standard\nhigh standard\nhigh standard and fully automated");
		System.out.format("%s", "Enter required Material Standard:" );
		String material = sc.nextLine();
		System.out.format("%s", "Enter the Number of Square Feet" );
		float no_of_square_feet =sc.nextFloat();
		ConstructionCost obj = new ConstructionCost();
		float Cost = obj.calConstructionCost(material,no_of_square_feet);
		System.out.format("%s","Total Cost Of Construction is ");
		System.out.format("%f",Cost);
    System.exit(0);
		
	}
  public static void main(String[] args)
  {
  }
}
public class ConstructionCost {
	
	float calConstructionCost(String material,float no_of_square_feet)
	{
		
		if(material.equals("standard"))
		{
			return 1200*no_of_square_feet;
		}
		else if(material.equals("above standard"))
		{
			return 1500*no_of_square_feet;
		}
		else if(material.equals("high standard"))
		{
			return 1800*no_of_square_feet;
		}
		else if(material.equals("hidh standard and fully automated home"))
		{
			return 2500*no_of_square_feet;
		}
		else {
		return 0;
	}
 }


public class Converter
{
	static float heightConverter(int heightFeetPart,int heightInchPart)
	{
		float inch=heightFeetPart*12;
		float incm=(float) ((inch+heightInchPart)*2.54);
		System.out.println("Height in cm:"+incm);
		return incm;
	}
	static float weightConverter(int weight)
	{
		float wp=(float) (weight*2.2);
		System.out.println("Weight in pounds:"+wp);
		return wp;
	
		
		
	}
	public static void main(String args[])
	{
		System.out.println("Output:");
		heightConverter(5,0);
		weightConverter(101);
	}
	

}

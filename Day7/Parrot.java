package oops2;

public class Parrot extends Bird implements FlyBehaviour
{
	public void fly()
	{
		System.out.println("Parrot can fly");
	}
	void birdSound() 
	{
		System.out.println("Parrot makes chirping sound");
	}
	void birdColor()
	{
		System.out.println("Parrot's color is green");
	}
	public static void main(String args[])
	{
	  Parrot p=new Parrot();
	 
	  p.fly();
	  p.birdSound();
	  p.birdColor();
	 
	}

}

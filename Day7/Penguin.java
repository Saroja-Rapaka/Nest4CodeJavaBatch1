package oops2;

public class Penguin extends Bird implements SwimBehaviour
{
	void birdSound()
	{
		System.out.println("Penguins makes hissing sound");
	}
	void birdColor()
	{
		System.out.println("Penguin's color is black and white");
	}
	public void swim()
	{
		System.out.println("Penguins can swim");
	}
	public static void main(String args[])
	{
	  Penguin pg=new Penguin();
	 
	  pg.swim();
	  pg.birdSound();
	  pg.birdColor();
	 
	}

}

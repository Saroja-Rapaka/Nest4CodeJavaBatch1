package oops2;

public abstract class Bird
{
	int height;
	int weight;
	String name;
	String color;

	abstract void birdSound();
	abstract void birdColor(); 
	void layEggs()
	{
		System.out.println("Birds will lay eggs");	
	}
	void beak()
	{
		System.out.println("Birds have Beak");
	}

}

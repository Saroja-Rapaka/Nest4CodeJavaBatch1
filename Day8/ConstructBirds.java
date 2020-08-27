package oops2;

public class ConstructBirds {

	public static void main(String[] args) 
	{
		Parrot p=new Parrot();
		p.eat();
		p.eat("food");
		Penguin pg=new Penguin();
		pg.eat();
		pg.eat("food");
		Ostrich o=new Ostrich();
		o.eat();
		o.eat("food");
	}

}

package oops2;

public class PerRect
{
	int length;
	int breadth;
	int per_rect;
    public PerRect(int length,int breadth)
    {
	  this.length=length;
	   this.breadth=breadth;
	   per_rect=2*(length+breadth);
		System.out.println("Perimeter of rectangle:"+per_rect);
    }
}

package oops2;

public class RectArea extends PerRect
{
	int rect_area;
    RectArea(int length,int breadth)
	{
	    super(length,breadth);
		rect_area=length*breadth;
		System.out.println("Area of Rectangle:"+rect_area);
	}
}

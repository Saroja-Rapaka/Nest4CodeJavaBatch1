import java.util.Scanner;

public class RestBill {

	public static void main(String[] args)
	{
       float price1,price2,price3,tamt,famt,tax;
       Scanner s=new Scanner(System.in);
       System.out.print("Price1:");
       price1=s.nextFloat();
       System.out.print("Price2:");
       price2=s.nextFloat();
       System.out.print("Price3:");
       price3=s.nextFloat();
       System.out.print("Tax%:");
       tax=s.nextFloat();
       tamt=(tax/100)*(price1+price2+price3);
       famt=tamt+price1+price2+price3;
       System.out.print("FinalAmount:"+famt);
     
       
       
       
       
       
       
       
       
		
	}

}

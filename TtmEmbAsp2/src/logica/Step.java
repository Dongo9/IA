package logica;

import java.util.Comparator;

import it.unical.mat.embasp.languages.Id;
import it.unical.mat.embasp.languages.Param;

@Id("step")
public class Step {

	@Param(0)
	private int x;
	
	@Param(1)
	private int y;
	
	public Step(int x,int y)
	{
		super();
		this.x=x;
		this.y=y;
	}
	
	public Step()
	{
		super();
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public static Comparator<Step> ordina = new Comparator<Step>() {

		public int compare(Step s1, Step s2) {
			
			if (s1.getX()!=s2.getX())
			{
				Integer x1=s1.getX();
				Integer x2=s2.getX();
				
				return x1.compareTo(x2);
			}
			
			else
			{
				Integer y1=s1.getY();
				Integer y2=s2.getY();
				
				return y1.compareTo(y2);
			}
	    }};
	    
 public static Comparator<Step> ordinaInverso=new Comparator<Step>() {

	@Override
	public int compare(Step s1, Step s2) {
		// TODO Auto-generated method stub
		if (s1.getX()!=s2.getX())
		{
			Integer x1=s1.getX();
			Integer x2=s2.getX();
			
			return x2.compareTo(x1);
		}
		
		else
		{
			Integer y1=s1.getY();
			Integer y2=s2.getY();
			
			return y2.compareTo(y1);
		}
	}
	 
 };

@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}
}

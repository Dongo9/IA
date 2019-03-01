package logica;

import it.unical.mat.embasp.languages.Id;
import it.unical.mat.embasp.languages.Param;

@Id("stepTopo")
public class StepTopo {

	@Param(0)
	private int x;
	
	@Param(1)
	private int y;
	
	@Param(2)
	private int weight;
	
	public StepTopo(int x,int y,int weight)
	{
		super();
		this.x=x;
		this.y=y;
		this.weight=weight;
	}
	
	public StepTopo()
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

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
}

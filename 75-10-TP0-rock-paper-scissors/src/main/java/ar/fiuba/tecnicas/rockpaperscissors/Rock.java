package main.java.ar.fiuba.tecnicas.rockpaperscissors;

public class Rock {

	public Paper vs(Paper paper)
	{
		return paper;
	}
	
	public Rock vs(Rock rock)
	{
		return this;
	}
	
	public Rock vs(Scissors scissors)
	{
		return this;
	}
}

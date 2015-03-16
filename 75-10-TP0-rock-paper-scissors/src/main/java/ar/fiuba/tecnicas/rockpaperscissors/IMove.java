package main.java.ar.fiuba.tecnicas.rockpaperscissors;

public interface IMove {

	IMove vs(IMove move);
	IMove vs(Rock move);
	IMove vs(Paper move);
	IMove vs(Scissors move);
	
}

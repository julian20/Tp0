package main.java.ar.fiuba.tecnicas.rockpaperscissors;

public class Scissors implements IMove{

	@Override
	public IMove vs(IMove move) {
		return move.vs(this);
	}

	@Override
	public IMove vs(Rock move) {
		return move;
	}

	@Override
	public IMove vs(Paper move) {
		return this;
	}

	@Override
	public IMove vs(Scissors move) {
		return this;
	}

		
}

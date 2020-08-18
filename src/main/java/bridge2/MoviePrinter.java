package bridge2;

import java.util.List;

public class MoviePrinter extends Printer {

	private Movie movie;
	
	public MoviePrinter(Movie movie) {
		
		this.movie=movie;
	}
	@Override
	protected String getHeader() {
		// TODO Auto-generated method stub
		return movie.getClassification();
	}

	@Override
	protected List<Details> getDetails() {
		// TODO Auto-generated method stub
		return null;
	}

}

package library.LiterayElement;

public class Journal extends LiteraryElement {

	//typing 
	private Periodicity periodicity;

	//constructor
	public Journal(String title, String codeIsbn, int pubblicationYear, int pageNumber, Periodicity periodicity) {
		super(title, codeIsbn, pubblicationYear, pageNumber);
		this.periodicity = periodicity;
	}

	//getter and setter
	public Periodicity getPeriodicity() {
		return periodicity;
	}

	public void setPeriodicity(Periodicity periodicity) {
		this.periodicity = periodicity;
	}

	//method toString
	@Override
	public String toString() {
		return "Journal [periodicity=" + periodicity + ", toString()=" + super.toString() + "]";
	}

	
}



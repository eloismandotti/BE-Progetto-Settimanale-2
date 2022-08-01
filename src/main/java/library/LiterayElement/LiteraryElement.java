package library.LiterayElement;

public abstract class LiteraryElement {
	
	//common attributes
	private String title;
	private String codeIsbn;
	private int pubblicationYear;
	private int pageNumber;
	
	//constructor
	public LiteraryElement(String title, String codeIsbn, int pubblicationYear, int pageNumber) {
		super();
		this.title = title;
		this.codeIsbn = codeIsbn;
		this.pubblicationYear = pubblicationYear;
		this.pageNumber = pageNumber;
	}

	//getter and setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCodeIsbn() {
		return codeIsbn;
	}

	public void setCodeIsbn(String codeIsbn) {
		this.codeIsbn = codeIsbn;
	}

	public int getpubblicationYear() {
		return pubblicationYear;
	}

	public void setpubblicationYear(int pubblicationYear) {
		this.pubblicationYear = pubblicationYear;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	//transform string into variable
	@Override
	public String toString() {
		return "LiteraryElement [title=" + title + ", codeIsbn=" + codeIsbn + ", pubblicationYear=" + pubblicationYear
				+ ", pageNumber=" + pageNumber + "]";
	}
	
	
}

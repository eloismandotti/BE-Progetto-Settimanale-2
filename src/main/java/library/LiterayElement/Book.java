package library.LiterayElement;

public class Book extends LiteraryElement {

	//Book Attribute
	private String author;
	private String genre;
	
	//constructor
	public Book(String title, String codeIsbn, int pubblicationYear, int pageNumber, String author, String genre) {
		super(title, codeIsbn, pubblicationYear, pageNumber);
		this.author = author;
		this.genre = genre;
	}
	
	//getter and setter
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	//method toString
	@Override
	public String toString() {
		return "Book [author=" + author + ", genre=" + genre + ", toString()=" + super.toString() + "]";
	}
	
	
	
}

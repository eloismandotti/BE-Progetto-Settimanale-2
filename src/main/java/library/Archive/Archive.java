package library.Archive;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;

import library.LiterayElement.Book;
import library.LiterayElement.LiteraryElement;

public class Archive {
	
	//map collection
	private Map <String, LiteraryElement> storage = new HashMap<String, LiteraryElement>();

	public void searchIsbn( String codeIsbn ) {
		
		LiteraryElement bookish = storage.get(codeIsbn);
		System.out.println(bookish);
	};
	
	public void searchPublicationYear( int pubblicationYear ) {
		
		//stream method 
		storage.values().stream().filter(ele -> pubblicationYear == ele.getpubblicationYear()).forEach(ele -> System.out.println(ele));
		
	};
	
	public void searchAuthor( String author ) {
		
		//filter for books
		storage.values().stream().filter(ele -> ele instanceof Book).map(ele -> (Book)ele).filter(ele -> author.equals(ele.getAuthor()));
		
	};
	
	public void addElement( LiteraryElement obj ) { 
		
		//obj is a parameter name for the full object
		storage.put(obj.getCodeIsbn(), obj);
	};
	
	public void removeElement( String codeIsbn ) {
		
		storage.remove(codeIsbn);
		System.out.println("File successfully deleted");
	};
	
	public void saveFile() {
		
		//apache.common
		File ele = new File("Archive/archive.txt");
		String data = "";

		for (LiteraryElement element: storage.values()) {
			
			//increment data for each element present in the archive
			data += element.toString();
		}
		try {
			FileUtils.writeStringToFile(ele, data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	};
	
	public void loadingFile() {
		
		File ele = new File("Archive/archive.txt");
		try {
			String file = FileUtils.readFileToString(ele);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	};
}

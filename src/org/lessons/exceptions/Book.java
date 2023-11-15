package org.lessons.exceptions;

public class Book {

	//Declaring variables
	private String title;
	private int pages;
	private String author;
	private String editor;
	
	//Constructor
	public Book(String title, int pages, String author, String editor) throws Exception {
		
		setTitle(title);
		setPages(pages);
		setAuthor(author);
		setEditor(editor);
		
	}

	
	
	//Title Functions
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) throws Exception {
		
		if(title.length() < 3)
		throw new Exception("Title must be longher than 3 characters");
			
			
		this.title = title;
	}

	
	
	
	//Pages functions
	public int getPages() {
		return pages;
	}

	public void setPages(int pages) throws Exception {
		
		if(pages < 1)
		throw new Exception("The book must have atleast 1 page");			
		
		this.pages = pages;
	}
	
	
	
	
	//Author functions
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) throws Exception {
		
		if(author.length() < 3)
			throw new Exception("Author must be longher than 3 characters");
		
		this.author = author;
	}

	
	
	
	//Editor functions
	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) throws Exception {
		
		if(editor.length() < 3)
			throw new Exception("Editor must be longher than 3 characters");
		
		this.editor = editor;
	}
	
	
	
	
	//TO String
	@Override
	public String toString() {
		
		return 
				"\n--------------------------------------------------------\n" +
				"Titolo: " + getTitle() + "\n" + "Numero di pagine: " + getPages() + "\n" + "Autore: " + getAuthor() + "\n" + "Editore: " + getEditor() + "\n";
	}
	
}

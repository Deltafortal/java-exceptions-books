package org.lessons.exceptions;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		
		//Declaring variables
		int booksNumber = 2;
		Book[] books = new Book[booksNumber];
		String booksData = "";
		
		Scanner in = new Scanner(System.in);
		File booksFile = new File("C:\\Users\\Utente\\Programming\\Java\\Esperis\\esercizi\\java-exceptions-books\\src\\assets/booksList.txt");
		
		
		Scanner reader = null;
		FileWriter bookWriter = null;
		
		
		
		//Main Logic
		for(int i = 0; i < booksNumber; i++) {
			
			System.out.println("Inserisci i dati del libro n° " + (i +1));
			System.out.println("Titolo: ");
			String title = in.nextLine();
			
			System.out.println("Numero di pagine: ");
			String insertedPages = in.nextLine();
			int pages = Integer.valueOf(insertedPages);
			
			System.out.println("Autore: ");
			String author = in.nextLine();
			
			System.out.println("Editore");
			String editor = in.nextLine();
			
			
			//Add book
			try {
				
				Book book = new Book(title, pages, author, editor);
				books[i] = book;
				booksData += book.toString();
							
			} catch (Exception e) {
				System.out.println("error: " + e.getMessage());
			}
			
			
		}
		
		
		System.out.println("Ecco la lista dei libri: ");

		
		// Write file
		try {
						
			bookWriter = new FileWriter(booksFile);
								
			bookWriter.write(booksData);
						
						
		} catch (Exception e) {
						
			System.out.println("Error reading file: " + e.getMessage());
						
		} finally {
						
			//Close writer
			if(bookWriter != null) {
				try {
								
					bookWriter.close();	
								
				} catch (Exception e) {
								
				}
										
			}
		}
		
		
		
		//Read from file
		try {
			
			 reader = new Scanner(booksFile);
			 while (reader.hasNextLine()) {
					
					String data = reader.nextLine();
					System.out.println(data);
					
				}
			
		} catch (Exception e) {
			
			System.out.println("Error reading file: " + e.getMessage());
			
		} finally {
			
			//Close reader
			if(reader != null) {
				try {
					
					reader.close();	
					
				} catch (Exception e) {
					
				}
							
			}
		}
		in.close();
		
	}
	
}
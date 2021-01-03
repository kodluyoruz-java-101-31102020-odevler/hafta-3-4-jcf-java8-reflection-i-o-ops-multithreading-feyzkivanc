package soru2.com.book;

import java.util.Set;
import java.util.TreeSet;

public class App {
	
	public static void main(String[] args) {
		
		Set<Book> bookTitle = new TreeSet<Book>();
		bookTitle.add(new Book("Beyaz Diþ",250, "Jack London",1999));
		bookTitle.add(new Book("Suç ve Ceza",350, "Fyodor Dostoyevski",2006));
		bookTitle.add(new Book("Bülbülü Öldürmek",235, "Harper Lee",2012));
		bookTitle.add(new Book("Þeker Portakalý",130, "Jose Mauro De Vasconcelos",2008));
		bookTitle.add(new Book("Hayvan Çiftliði",550, "Goerge Orwell",2015));

		System.out.println("By book title");
		print(bookTitle);
		NumberOfPageSorting pageSort = new NumberOfPageSorting();
		
		Set<Book> numberOfPageSort = new TreeSet<Book>(pageSort);
		numberOfPageSort.addAll(bookTitle);
		System.out.println("By page number");
		print(numberOfPageSort);
		
	}
		
	public static <T> void print(Set<T> set) {
		
		for(T temp : set) {
			System.out.println(temp);
		}
	
	}

}

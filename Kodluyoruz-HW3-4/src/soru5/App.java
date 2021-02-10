package soru5;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class App {
	
	public static void main(String[] args) {
		
		List<Book> bookList = new ArrayList<Book>();
		bookList.add(new Book("Momo",120, "Michael Ende", 2003));
		bookList.add(new Book("Fahrenheit 451",350, "Ray Bradbury", 2010));
		bookList.add(new Book("Hayvan �iftli�i:",156, "George Orwell", 2015));
		bookList.add(new Book("Bir �dam Mahkumunun Son G�n�",235, "Victor Hugo", 2001));
		bookList.add(new Book("��imizdeki �eytan",456, "Sabahattin Ali", 2003));
		bookList.add(new Book("Ola�an�st� Bir Gece",80, "Stefan Zweig", 2014));
		bookList.add(new Book("Bilinmeyen Bir Kad�n�n Mektubu",310, "Stefan Zweig", 2008));
		bookList.add(new Book("K�rl�k",147, " Jose Saramago", 1999));
		bookList.add(new Book("Simyac�",200, "Paulo Coelho", 2007));
		bookList.add(new Book("Cesur Yeni D�nya",350, " Aldous Huxley", 2017));

		Predicate<Book> moreThan100 = (book) -> {
			return (book.getNumberOfPage()) > 100;
		};
		
		Set<Book> greaterThan100 = bookList.stream().filter(moreThan100).collect(Collectors.toSet());

		Consumer<Book> bookPrinter = (book) -> System.out.println(book);

		greaterThan100.stream().forEach(bookPrinter);
		
	}

}

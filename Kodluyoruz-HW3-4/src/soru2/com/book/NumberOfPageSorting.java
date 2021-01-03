package soru2.com.book;

import java.util.Comparator;

public class NumberOfPageSorting implements Comparator<Book>{

	@Override
	public int compare(Book boo1, Book boo2) {
		
		int book1 = boo1.getNumberOfPage();
		int book2 = boo2.getNumberOfPage();
		
		
		if(book1 < book2) {
		return -1;
		}
		else if(book1 > book2) {
			return 1;
		}
		else
		
		
		return 0;
	}

	

}

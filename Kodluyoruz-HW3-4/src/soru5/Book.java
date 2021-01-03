package soru5;


public class Book implements Comparable<Book> {

	




	public String name;
	public int numberOfPage;
	public String writer;
	public int publishDate;
	
	public Book(String name, int numberOfPage, String writer, int publishDate) {
		super();
		this.name = name;
		this.numberOfPage = numberOfPage;
		this.writer = writer;
		this.publishDate = publishDate;
	}

	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getNumberOfPage() {
		return numberOfPage;
	}



	public void setNumberOfPage(int numberOfPage) {
		this.numberOfPage = numberOfPage;
	}



	public String getWriter() {
		return writer;
	}



	public void setWriter(String writer) {
		this.writer = writer;
	}



	public int getPublishDate() {
		return publishDate;
	}



	public void setPublishDate(int publishDate) {
		this.publishDate = publishDate;
	}



	@Override
	public int compareTo(Book o) {
		
		
		return this.getName().compareTo(o.getName());
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + numberOfPage;
		result = prime * result + publishDate;
		result = prime * result + ((writer == null) ? 0 : writer.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numberOfPage != other.numberOfPage)
			return false;
		if (publishDate != other.publishDate)
			return false;
		if (writer == null) {
			if (other.writer != null)
				return false;
		} else if (!writer.equals(other.writer))
			return false;
		return true;
	}



	



	@Override
	public String toString() {
		return "Book [name=" + name + ","
				+ " numberOfPage=" + numberOfPage + ","
						+ " writer=" + writer +
						", publishdate="
				+ publishDate + "]";
	}
}
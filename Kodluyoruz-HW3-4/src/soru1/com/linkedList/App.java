package soru1.com.linkedList;

public class App {
	
	
	
	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<String>();
		
		linkedList.add("kodluyoruz");
		linkedList.add("Java");
		linkedList.add("101");
		linkedList.add("Bootcamp");
		
		linkedList.print();
		System.out.println(linkedList.getCount());
		linkedList.remove("101");
		linkedList.print();
		System.out.println(linkedList.getCount());

	}

}

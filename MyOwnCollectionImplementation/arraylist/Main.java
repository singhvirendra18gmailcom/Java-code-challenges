package MyOwnCollectionImplementation.arraylist;

public class Main {

	public static void main(String[] args) {
		ArrayList  list=new ArrayList();
		
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(2);
		
		list.add(11);
		list.add(12);
		list.add(3);
		list.add(4);
		list.add(1);
		list.add(5);
		
		list.add(9);
		list.add(10);
		
		
		
		
		System.out.println(list);
		System.out.println(list.length);
		
		
		System.out.println(list.get(4));
		System.out.println(list.get(19));
		list.remove(15);
		
		System.out.println(list);
		
		
	}
	
}

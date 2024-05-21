package collections_programs;

import java.util.LinkedList;

public class Program_LinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> l1 = new LinkedList();
		l1.add(20);
		l1.add(19);
		l1.add(18);
		l1.add(30);
		l1.add(40);
		System.out.println(l1.size());
		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());
	    System.out.println(l1.peekFirst());
		System.out.println(l1.peekLast());
		l1.addFirst(22);
		System.out.println(l1);
		l1.addLast(23);
		System.out.println(l1);
		l1.offerFirst(21);
		System.out.println(l1);
		l1.offerLast(30);
		System.out.println(l1);
		System.out.println("Poll First "+l1.pollFirst());
		System.out.println("Poll Last "+l1.pollLast());
		System.out.println(l1.removeFirst());
		System.out.println(l1);
		
	}

}

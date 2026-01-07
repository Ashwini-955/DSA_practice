import java.util.*;

public class ArrayListE {
    public static void main(String[] args) {
	        ArrayList<Object> al=new ArrayList<>();
		al.add(10);
		al.add(1.678);
		al.add("hello");
		al.add(23);
		System.out.println(al);
	        ArrayList<Object> al2=new ArrayList<>();
		al2.add(100);
		al2.add(14.678);
		al2.add("heyy");
		al2.add(53);
		System.out.println(al2);
		al.add(al2);
		System.out.println(al);
    }
}

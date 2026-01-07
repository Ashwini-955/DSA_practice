import java.util.*;
class LLA{
	public static void main(String[] args){
		LinkedList<String> list =new LinkedList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("f");
		list.add("y");
		list.addFirst("d");
		System.out.println(list);
		list.remove(0);
		list.remove(list.size()-1);
		for(int i =0;i<list.size();i++){
			System.out.print(list.get(i)+"->");
		}
		System.out.println("NULL");

	}
}
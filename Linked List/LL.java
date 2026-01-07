class LL{
	public static Node head;
	public static int size;

	class Node{
		String data;
		Node next;
		Node(String data){
			this.data=data;
			this.next=null;
		}
	}

	public void addFirst(String data){
		Node newnode=new Node(data);
		newnode.next=head;
		head=newnode;
		size++;
	}
	
	public void addLast(String data){
		Node newnode=new Node(data);
		if(head==null){
			head=newnode;
			size++;
			return;

		}
		Node currnode=head;
		while(currnode.next!=null){
			currnode=currnode.next;
		}
		currnode.next=newnode;
		size++;
	}


	public void addMiddle(int idx,String data){
		Node newnode = new Node(data);
		int i =0;
		Node temp=head;
		while(idx<idx-1){
			temp=temp.next;
			i++;
		}
		newnode.next=temp.next;
		temp.next=newnode;
		size++;
	}


	public void deleteFirst(){
		if(head==null){
			System.out.println("List is empty");
			return;																																																																		
		}
		head=head.next;
		size--;
	}

	public void deleteLast(){
		if(head==null){
			System.out.println("Empty");
		}
		if(head.next==null){
			head=null;
			size--;
			return;
		}
		Node s=head;
		Node l=head.next;
		while(l.next!=null){
			l=l.next;
			s=s.next;
		}
		s.next=null;
		size--;
	}


	public int search(String key){
		Node temp = head;
		int i=0;
		while(temp!=null){
			if(temp.data==key){
				return i;
			}
			temp=temp.next;
			i++;
		}
		return -1;
	}


	public void printList(){
		if(head==null){
			System.out.println("List is empty");
			return;
		}
		Node currnode=head;
		while(currnode!=null){
			System.out.print(currnode.data+"->");
			currnode=currnode.next;
		}
		System.out.println("NULL");
	}
	public static void main(String[] args){
		LL list = new LL();
		list.addFirst("a");
		list.printList();
		list.addFirst("b");
		list.printList();
		list.addFirst("c");
		list.printList();
		list.addLast("d");
		list.printList();
		list.addLast("e");
		list.printList();
		list.deleteFirst();
		list.printList();
		list.addMiddle(2,"q");
		list.deleteLast();
		list.printList();
		System.out.println(size);
		System.out.println(list.search("c"));
		System.out.println(list.search("a"));
		System.out.println(list.search("b"));
		System.out.println(list.search("d"));

	}
}
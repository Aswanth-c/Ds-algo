package linkedlist;

public class LinkedList {
	private Node head;
	// we declare a head node and not initialize it 
	public void insert(int data) {
		// create a new node and assign the values user given to that node
		var node= new Node();
		node.data=data;
		//node.next will be null because we didn't give any value to that object
		// we check whether this is a head node or not if it is head we will assign head as this node
		if(head==null) {
			head=node;
			System.out.println("added in head");
		}
		// we have to traverse through whole linked list to find  null value and insert there this nodes reference there
		else {
			Node current=head;
			while(current.next!=null) {
				current=current.next;
			}
			// after that while loop we get null after that null we need to change value of that null to the Node we have created first
			current.next=node;
			System.out.println("Added in node");
		}
	}
	public void show() {
		// for to display all elements we have traverse through for that we use head node which is the first reference from that we traverse
		Node current=head;
		while(current.next!=null) {
			System.out.println(current.data);
			current=current.next;
		}
		System.out.println(current.data);
	}
	// we are adding data to first of the node
	// what we do here is basically we create node and in the reference section we give the value of node.next to head and we assign global head value to this node
	public void insertAtstart(int data) {
		// create node object for new insertion
		var node= new Node();
		//Assign user given data to newly created node
		node.data=data;
		// Assign node reference to head
		node.next=head;
		// head node to this node
		head=node;
	}
	// here what we are actually doing it is we traverse through the given index and swap its pointer to new come pointer
	public void insertAt(int index,int data) {
		int i;
		if(index==0) {
			insertAtstart(data);
		}
		else {
			// we create new node
			Node node=new Node();
			//assign data to that
			node.data=data;
			Node current=head;
			// checking index is zero if so calling index at start method
			for(i=0;i<index-1;i++){
				current=current.next;
			}
			node.next=current.next;
			current.next=node;
		}
	}
	public void deleteAt(int index) {
		
		if(index==0) {
			head=head.next;
		}
		else {
			Node n=head;
			for(int i=0;i<index-1;i++) {
				n=n.next;
			}
			Node n1=n.next;
			n.next=n1.next;
			n1=null;
		}
	}
	// just storing elements in array and retrieving it 
	public void reversingll() {
		if(head.next==null) {
			System.out.println(head.next + "in head of next");
		}
		else {
			int i=-1;
			var n = new Node();
			n=head;
			int a[]= new int[5]; 
//			System.out.println("in else method");
			while(n.next!=null){
				
				i++;
				a[i]=n.data;
				n=n.next;
			}
			a[i+1]=n.data;
			for(i=4;i>=0;i--) {
				System.out.println(a[i]);
			}
		}
		
	}
	public void Rllusingiteration() {
		var current = new Node();
		var prev=new Node();
		var next=new Node();
		current=head;
		while(current!=null) {
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head=prev;
	}
	
	
	
	
	
	
}

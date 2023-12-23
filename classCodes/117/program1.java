//Linkedlist
class Node {

	int data;
	Node next = null;
	void Node(int data){
	
		 this.data = data;
	}
}
class LinkedList {

	Node head = null;

	//CountNode
	int CountNode() {
	
		Node temp = head;
		int count = 0;
		while(temp!=null){
		
			temp = temp.next;
			count++;
		}
		return count;
	}
	//addFirst
	void addFirst(int data){
	
		Node newNode = new Node(data);

		if(head == null){
		
			head = newNode;
		}
		else {
		
			newNode.next = head;
			head = newNode;
		}
	}
	//addLast
	void addLast(int data){
	
		Node newNode = new Node(data);
		if(head==null){
		
			head = newNode;
		}else{
			Node temp = head;
			while(temp!=null){
			
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	//addAtPos
	void addAtPos(int pos,int data){
	
		if(pos<=0 || pos>= CountNode() + 2){
		
			System.out.println("Enter valid position");
			return;
		}
		
		if(pos==1){
		
			addFirst(data);
		}else if(pos==CountNode()+1){
		
			addLast();
		}else{
		
			Node newNode = new Node(data);
			Node temp = head;

			while(pos-2 != 0){
			
				temp = temp.next;
				pos--;
			}
			newNode.next = temp.next;
			temp.next = newNode;
		}
	}
	//delFirst
	void delFirst() {
	
		if(head==null){
		
			System.out.println("Empty LinkedList");
		}
		else if(head.next == null){
		
			head = null;
		}else{
		
			head = head.next;
		}
	}
	//delLast
	void delLast() {
	
		if(head == null){
		
			System.out.println("Empty LinkedList");
		}else if(CountNode() == 1){
		
			head = null;
		}else{
		
			Node temp = head;
			while(temp.next.next !=null){
			
				temp = temp.next;
			}
			temp.next = null;
		}
	}
	//delAtPos
	void delAtPos() {
		if(pos<=0 || pos>= CountNode() + 1){
		
			System.out.println("Enter valid position");
			return;
		}
		
		if(pos==1){
		
			delFirst(data);
		}else if(pos==CountNode()){
		
			delLast();
		}else{
		
			Node newNode = new Node(data);
			Node temp = head;

			while(pos-2 != 0){
			
				temp = temp.next;
				pos--;
			}
			temp.next = temp.next.next;
		}
	}
	//PintSLL
	void printSLL() {
	
		if(head==null) {
		
			System.out.println("Empty LinkedList");
		}else{
		
			Node temp = head;
			while(temp!=null){
				
				System.out.println(temp.data + "->");
				temp = temp.next;

				if(temp.next==null){
				
					System.out.println(temp.data);
					break;
				}
			}
		}
	}
	class Client {
	
		public static void main(String[]args) {
		
			LinkedList ll = new LinkedList();
			
		}
	}
}

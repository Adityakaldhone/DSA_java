import java.util.Scanner;
//Reverse LinkedList

class Node {

	int data;
	Node next;

	Node(int data) {
	
		this.data = data;
	}
}
class LinkedList {
	
	Node head = null;

        //CountNode
        int countNode() {

                Node temp = head;
                int count = 0;
                while(temp!=null){

                        temp = temp.next;
                        count++;
                }
                return count;
        }

	//addNode
	void addNode(int data) {
	
		Node newNode = new Node(data);

		if(head == null){
		
			head = newNode;
		}else{
		
			Node temp = head;

			while(temp.next != null) {
			
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	//printll
	void printll() {
		
		Node temp = head;

		while(temp.next != null) {
		
			System.out.print(temp.data +"->");
			temp = temp.next;
		}
		System.out.println(temp.data);

	}
	//reverse linkedList Approach 1 (Iterative approach)
	void reverseItr() {
	
		Node prev = null;
		Node curr = head;
		Node forward = null;

		while(curr != null) {
		
			forward = curr.next;
			curr.next = prev;
			prev = curr;
			curr = forward;
		}
		head = prev;
	}
	//reverse LinkedList Approach 2 (recursive Approach)
	void reverseRec(Node prev, Node curr) {
	
		if(curr == null) {
			head = prev;
			return;
		}else{
		
			Node forward = curr.next;
			curr.next = prev;
			prev = curr;
			curr = forward;
		}
		reverseRec(prev, curr);
	}
	//problem statement 2:  MiddleOfTheLinkedList
	//Approach1
	void middleNode1() {
	
		int len = countNode();
		Node temp = head;
		int cnt = 0;
		while(cnt < len/2){
		
			temp = temp.next;
			cnt++;
		}
		System.out.println("middle of the linkedlist = "+ temp.data);
	}
	//Approach2 (Two pointer)
	void middleNode2() {
	
		if(head == null) {
		
			return;
		}
		int len = countNode();
		Node slow = head;
		Node fast = head.next;

		while(fast != null) {
		
			fast = fast.next;
			if(fast != null )
				fast = fast.next;

			slow = slow.next;
		}
		System.out.println("middle of the linkedlist = "+ slow.data);
	}

}
class Client {

	public static void main(String[]args) {
	
		LinkedList ll = new LinkedList();
		Scanner sc = new Scanner(System.in);
		  char ch;
                        do{

                                System.out.println("LinkedList");
                                System.out.println("1.addNode");
                                System.out.println("2.printll");
                                System.out.println("3.reverse Itr");
                                System.out.println("4.reverse Rec");
                                System.out.println("5.MiddleNode1");
                                System.out.println("6.MiddleNode2");
                                System.out.println("7.countNode");

                                System.out.println("Enter Choice");
                                int choice = sc.nextInt();

                                switch(choice) {
					case 1:
						{
						
							System.out.println("Enter data");
							int data = sc.nextInt();
							ll.addNode(data);

						}
						break;

					case 2:
						ll.printll();
						break;

					case 3:
						ll.reverseItr();
						break;

					case 4:
						{
						
							Node prev = null;
							ll.reverseRec(prev, ll.head);
						}
						break;
					case 5 :
						ll.middleNode1();
						break;
					case 6 :
						ll.middleNode2();
						break;

					case 7:{
						       int ret = ll.countNode();
							System.out.println(ret);
						}
						
						break;

                                        default:
                                                System.out.println("Wrong Input");
                                                break;


                                }
                                System.out.println("Do you want to continue? yes/no");
                                ch = sc.next().charAt(0);


                        }while(ch=='Y' || ch== 'y');
	}
}

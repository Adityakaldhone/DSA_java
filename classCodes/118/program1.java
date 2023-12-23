import java.util.Scanner;
class Node {

	Node prev = null;
	int data;
	Node next = null;

	Node(int data){
	
		this.data = data;
	}
}
class DLinkedList {

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

	//addFirst
	void addFirst(int data){
	
		Node newNode = new Node(data);

		if(head==null){
		
			head = newNode;
		}else{
		
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
			while(temp.next != null){
			
				temp = temp.next;
			}
			temp.next = newNode;
			newNode.prev = temp;
		}

	}
	//addAtPos
	void addAtPos(int pos, int data){

		
		if(pos <= 0 || pos >= countNode()+2){
		
			System.out.println("Wrong Input");
			return;
		}
		if(pos==1){
		
			addFirst(data);
		}else if(pos == countNode()+1){
		
			addLast(data);
		}

		else{
			Node newNode = new Node(data);
			Node temp = head;	
			while(pos-2 != 0){
			
				temp = temp.next;
				pos--;
			}
		
			 
     			 newNode.prev = temp;
			 newNode.next = temp.next;
      			 temp.next = newNode;  
    			 newNode.next.prev = newNode;
		}
	}
	//delFirst
	void delFirst() {
	
		if(head == null){
		
			System.out.println("LinkedList is Empty");
		}
		if(countNode()==1){
		
			head = null;
		}
		else{
		
			head = head.next;
			head.prev = null;
		}
		
	}
	//delLast
	void delLast() {
	
		
		if(head == null) {
		
			System.out.println("LinkedList is Empty");
		}
		if(countNode() == 1){
		
			head = null;
		}
		else{
		
			Node temp = head;

			while(temp.next != null) {
			
				temp = temp.next;
			}
			temp.prev.next = null;
			temp.prev = null;
		}
	}
	//DelAtPos
	void delAtPos(int pos) {
	
		if(pos <= 0 || pos >= countNode()+1){
		
			System.out.println("Wrong Input");
			return;
		}
		if(pos==1){
		
			delFirst();
		}else if(pos == countNode()){
		
			delLast();
		}
		else{
		
			Node temp = head;
			while(pos-2 != 0){
			
				temp = temp.next;
				pos--;
			}
			temp.next = temp.next.next;
			temp.next.prev = temp;
		}

	}
	  //PintSLL
        void printSLL() {


                if(head==null) {

                        System.out.println("Empty LinkedList");
                }else{

                        Node temp = head;
                        while(temp.next!=null){

                                System.out.print(temp.data + "->");
                                temp = temp.next;

                        }
                        System.out.print(temp.data);
                        System.out.println();

                }
        }
}
class Client {

	public static void main(String[]args) {


                        DLinkedList ll = new DLinkedList();
                        char ch;
                        do{

                                System.out.println("Doubly LinkedList");
                                System.out.println("1.addFirst");
                                System.out.println("2.addLast");
                                System.out.println("3.addAtPos");
                                System.out.println("4.delFirst");
                                System.out.println("5.delLast");
                                System.out.println("6.delAtPos");
                                System.out.println("7.CountNode");
                                System.out.println("8.PrintSLL");

                                System.out.println("Enter Choice");
                                Scanner sc = new Scanner(System.in);
                                int choice = sc.nextInt();

                                switch(choice) {

                                        case 1:
                                                {

                                                        System.out.println("Enter data");
                                                        int data = sc.nextInt();
                                                        ll.addFirst(data);
                                                }
                                                break;

                                        case 2:
                                                {

                                                        System.out.println("Enter data");
                                                        int data = sc.nextInt();
                                                        ll.addLast(data);
                                                }
                                                break;

                                        case 3:
                                                {

                                                        System.out.println("Enter data");
                                                        int data = sc.nextInt();
                                                        System.out.println("Enter Position");
                                                        int pos = sc.nextInt();

                                                        ll.addAtPos(pos,data);
                                                }
                                                break;

                                        case 4:
                                                ll.delFirst();
                                                break;

                                        case 5:
                                                ll.delLast();
                                                break;

                                        case 6:
                                                {

                                                        System.out.println("Enter position");
                                                        int pos = sc.nextInt();
                                                        ll.delAtPos(pos);
                                                }
                                                break;

                                        case 7:
                                                {
                                                        int count = ll.countNode();
                                                        System.out.println("count = "+ count);
                                                }
                                                break;

                                        case 8:
                                                ll.printSLL();
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


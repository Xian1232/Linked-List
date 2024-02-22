//ChristianYoung, CSC 130, 9/20/22

public class LinkedList {

    Node head = null;
    Node tail = null;

     class Node {                                          //creating the Node class inside the LinkedList class so that it will be accessible later

        String value;
        Node next;
    
        public Node(String v) {                            //declaring value and next to the constructor to use later
            value = v;
            next = null;
        }
        
        boolean contains(String value) {
            if (this.value == value) {                     //If the variable is found, method returns true
                return true;                               //Otherwise, it recursively searches until the
            }                                              //value is found. If nothing it found it will
            else if (head == null) {                       //return false.
                return false;
            }
            else if (this.next == null) {
            	return false;
            }
            else {
                return this.next.contains(value);
            }
        }

        void print() {                                     //loops with recursion
                                                           //prints out the value of the list the program currently sees
                                                           //gets the next value ready
        	if (head == null && tail == null) {            //and the recursively loops the method until it reaches a null point
        		System.out.println("There is nothing else to print");
        		return;
        	}	
        	else if (this.next != null) {
        		System.out.println(this.value);
        		this.next.print();
        	}
        	else {
        		System.out.println(this.value);
        	}
        }
     }
    
    public static void main(String[] args) {               //Main method
        about();
        listTest();
        listTest2();
        listTest3(); 
        listTest4();
        listTest5();
        listTest6();
        listTest7();
        listTest8();
        listTest9();
        listTest10();
    }

    public static void listTest() {                        //Methods that tests the linked list
    	var ln = new LinkedList();                         //I got confused as to what you mean by "10 tests"
    	System.out.println("Starting test...\n");          //whether or not that was 10 commands or 10 full methods like 
    	System.out.println("Printing current List: ");     //I have here, so I made this long method with multiple tests
    	ln.print();                                        //as well as the smaller tests below it. <3 
        ln.addHead("25");
        System.out.println("Does this list contain the desired value?: " + ln.contains("25"));
        ln.print(); 
        ln.addTail("24");
        ln.addHead("12");
        ln.removeHead();
        System.out.println("\nThe current head value: " + ln.peekHead());
        System.out.println("\nIs the list empty?: " + ln.isEmpty());
        System.out.println("Does this list contain the desired value?: " + ln.contains("24"));
        System.out.println("Does this list contain the desired value?: " + ln.contains("20"));
        ln.print();
        ln.removeHead();
        ln.print();
        ln.addTail("cat");
        ln.print();
        ln.removeHead();
        ln.addHead("dog");
        ln.print();
        System.out.println("\nEnding test...\n");
        System.out.println("--------------------------------\n");
    }
    
      public static void listTest2() {                     //test 2
    	var an = new LinkedList();
    	System.out.println("Starting test...");
    	System.out.println("\nThe current head value: " + an.peekHead());
    	an.addHead("24");
    	System.out.println("Does this list contain the desired value?: " + an.contains("24"));
    	an.removeHead();
    	an.print();
    	System.out.println("Ending test...\n");
    	System.out.println("--------------------------------\n");
    	
    }
    
    public static void listTest3() {                       //test 3
    	var bn = new LinkedList();
    	System.out.println("Starting test...");
    	bn.addHead("car");
    	bn.addTail("bike");
    	bn.print();
    	bn.removeHead();
    	System.out.println("\nThe current head value: " + bn.peekHead());
    	System.out.println("\nEnding test...\n");
    	System.out.println("--------------------------------\n");
    } 
    
    public static void listTest4() {                       //test 4
    	var cn = new LinkedList();
    	System.out.println("Starting test...");
    	System.out.println("\nThe current head value: " + cn.peekHead());
    	cn.addTail("STAR WALKIN");
    	System.out.println("Does this list contain the desired value?: " + cn.contains("THAT AINT TRY"));
    	System.out.println("\nThe current head value: " + cn.peekHead());
    	cn.print();
    	System.out.println("\nEnding test...\n");
    	System.out.println("--------------------------------\n");
    }
    
    public static void listTest5() {                      //test 5
    	var dn = new LinkedList();
    	System.out.println("Starting test...");
    	dn.addHead("RACIN TO THE MOONLIGHT AND IM SPEEDING");
    	dn.addHead("IM HEADED TO THE STARS");
    	dn.addTail("READY TO GO FAR");
    	dn.addTail("IM STAR WALKIN");
    	dn.print();                                      //Could not figure out why it will not print out the tails
    	System.out.println("\nEnding test...\n");
    	System.out.println("--------------------------------\n");
    }
    
    public static void listTest6() {                      //test 6
    	var en = new LinkedList();
    	System.out.println("Starting test...");
    	System.out.println("\nIs the list empty?: " + en.isEmpty());
    	en.addHead("Cudi");
    	en.print();
    	System.out.println("\nIs the list empty?: " + en.isEmpty());
    	System.out.println("\nEnding test...\n");
    	System.out.println("--------------------------------\n");
    }
    
    public static void listTest7() {                      //test 7
    	var fn = new LinkedList();
    	System.out.println("Starting test...");
    	System.out.println("\nThe current head value: " + fn.peekHead());
    	System.out.println("\nEnding test...\n");
    	System.out.println("--------------------------------\n");
    }
    
    public static void listTest8() {                      //test 8
    	var gn = new LinkedList();
    	System.out.println("Starting test...");
    	gn.addTail("werk");
    	System.out.println("Does this list contain the desired value?: " + gn.contains("YEAAAAAAAAA"));
    	System.out.println("\nEnding test...\n");
    	System.out.println("--------------------------------\n");
    }
    
    public static void listTest9() {                      //test 9
    	var hn = new LinkedList();
    	System.out.println("Starting test...");
    	hn.print();
    	System.out.println("\nIs the list empty?: " + hn.isEmpty());
    	System.out.println("\nEnding test...\n");
    	System.out.println("--------------------------------\n");
    }
    
    public static void listTest10() {                      //test 10
    	var in = new LinkedList();
    	System.out.println("Starting test...");
    	in.addHead("final");
    	in.removeHead();
    	in.print();
    	System.out.println("\nEnding test...\n");
    	System.out.println("--------------------------------\n");
    }
    
    public static void about() {                         //An about section describing me
        System.out.println("Hi my name is Christian Young. I am a junior as a CS major that switched from CPE.\n");
    }

    void addHead(String value) {
        Node add = new Node(value);
        System.out.println("Adding a new head...");

        if (head == null) {                              //adds a head and tail link to the same node if there is only one
            head = add;
            tail = add;
        }
        else {
            add.next = head;                             //with multiple nodes, it will add a head node to the desired value
            head = add;
        }
    }

    void addTail(String value) {
        Node add = new Node(value);
        System.out.println("Adding a new tail...");

        if (tail == null) {                              //adds a head and tail link to the same node if there is only one
            head = add;
            tail = add;
        }
        else {
            add.next = tail;                             //with multiple nodes, it will add a tail node to the desired value
            tail = add;
        }
    }

    String removeHead() {
        String result = head.value;
        head = head.next;
        System.out.println("Removing the head...");

        if (head == null) {                             //This method removes the head if it doesn't read a null head value.
            tail = null;                                //If the head is null, it will null the tail reference as well as writing a line
        }
        else if (tail != null) {
            tail = null;
        }
        return result;
    }

    String peekHead() {
        if (head != null) {
            return head.value;
        }                                               //If the head is not null, it returns the value
        else {                                          //of the head. Otherwise, it returns a string saying
            return "This list is empty...";             //the list is empty
        }
    }

    boolean isEmpty() {
        if (head == null) {
            return true;                                //Simply returns if the list is empty or not
        }
        else {
            return false;
        }
    }
    
    boolean contains(String value) {
    	return head.contains(value);                    //Calling the contains method from Node into the LinkedList class
    }
    
    void print() {                                      //Calling the print method from Node into the LinkedList class
    	if (head == null) {
    		System.out.println("There is nothing to currently print...\n"); //Catches an error if it tries to print an empty list
    		return;
    	}
    	else {
    		System.out.println("Printing the list: ");
    		head.print();
    	}
    }

}
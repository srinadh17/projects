public class SLL {
    public static void main(String[] args) {
           LinkedList<Employee> linkedList = new LinkedList<Employee>(); // creation of Linked List
           
           linkedList.insertFirst(new Employee("11", "sam","aaa"));
           linkedList.insertFirst(new Employee("21", "amy","bbb"));
           linkedList.insertFirst(new Employee("59", "katy","ccc"));
           linkedList.insertFirst(new Employee("14", "sai","ddd"));
           linkedList.insertFirst(new Employee("39", "pat","eee"));
 
           linkedList.displayLinkedList(); // display LinkedList
     }
}
class Employee {
    private String empno;
    private String name;
    private String empaddress;
    
    /**
     * Employee constructor
     */
    public Employee(String empno, String name,String empaddress) { // constructor
           this.empno = empno;
           this.name = name;
           this.empaddress=empaddress;
    }
 
    @Override
    public String toString() {
           return "Employee [empno=" + empno + ", name=" + name + " ,address ="+empaddress+ "]  ";
    }
    
}
 
//Exception to indicate that LinkedList is empty.
 
class LinkedListEmptyException extends RuntimeException{
       public LinkedListEmptyException(){
         super();
       }
      
     public LinkedListEmptyException(String message){
         super(message);
       }  
}
  //Node class, which holds data and contains next which points to next Node.
class Node<T> {
    public T data; // data in Node.
    public Node<T> next; // points to next Node in list.
 
     // Constructor
   
    public Node(T data){
           this.data = data;
    }
  // Display Node's data
    
    public void displayNode() {
           System.out.print( data + " ");
    }
}

 //* Singly LinkedList class (Generic implementation)
 
class LinkedList<T> {
    private Node<T> first; // ref to first link on list
 
    /**
     * LinkedList constructor
     */
    public LinkedList(){
           first = null;
    }
 
    /**
     * Insert New Node at first position
     */
    public void insertFirst(T data) {
           Node<T> newNode = new Node<T>(data);  //Creation of New Node.
           newNode.next = first;   //newLink ---> old first
           first = newNode;  //first ---> newNode
    }
    
    //Display LinkedList
    
    public void displayLinkedList() {
           System.out.print("Displaying LinkedList [first--->last]: ");
           Node<T> tempDisplay = first; // start at the beginning of linkedList
           while (tempDisplay != null){ // Executes until we don't find end of list.
                  tempDisplay.displayNode();
                  tempDisplay = tempDisplay.next; // move to next Node
           }
           System.out.println();
           
    }
 
}
 

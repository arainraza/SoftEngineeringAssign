//import java.util.Random;
public class SinglyLinkedList{
     ListNode head;
     static class ListNode{
         int data;//Generic type
         ListNode next;
        
        public ListNode(int data){
        this.data=data;
        this.next=null;
        }
        
    }
   
    public int length(){
        if(head==null){
            return 0;
        }
        int count=0;
        ListNode current=head;
        while(current!=null){
            count++;
            current=current.next;
        }
        return count;
        
    }
    public void InsertFisrt(int value){
        ListNode newNode=new ListNode(value);
        newNode.next=head; 
        head=newNode;
            }    
    
    public void InsertLast(int value){
        ListNode newNode=new ListNode(value);
                if(head==null){
                    head=newNode;
                    return;
                }
        ListNode current=head;
            while(current.next!=null){
                current=current.next;
            }
        current.next=newNode; 
        }
   
      public void minNode() {  
        ListNode current = head;  
        int min;  
          
        if(head == null) {  
            System.out.println("List is empty");  
        }  
        else {   
            min = head.data;  
              
            while(current != null){  
                 if(min > current.data) {  
                     min = current.data;  
                 }  
                 current= current.next;  
            }          
            System.out.println("Minimum value  in the list is: "+ min);  
        }  
    }  
      public void maxNode() {  
        ListNode current = head;  
        int max;  
          
        if(head == null) {  
            System.out.println("List is empty");  
        }  
        else {
            max = head.data;  
              
            while(current != null){   
                 if(max< current.data) {  
                     max = current.data;  
                 }  
                 current= current.next;  
            }          
            System.out.println("Maximum value in the list is: "+ max);  
        }  
    }
      
       public void display(){
        ListNode current=head;
    while(current!=null){
    System.out.println(current.data+"-->");
    current=current.next;
}
    {
    //System.out.println("null!");
    }
    }
       public ListNode DeleteLast(){
     if(head==null&&head.next==null){
         return head;
     }      
     ListNode current=head;
     ListNode prevoius=null;
     
     while(current.next!=null){
         prevoius=current;
         current=current.next;
                 
     }
     prevoius.next=null;
     return current;
       }
       
       
        public void Remove(){
    ListNode current=head;
    ListNode temp=null;
         int key=30;
    while(current!=null && current.data!=key){
        temp=current;
        current=current.next;
    }
            if(current==null)
                return;
            temp.next=current.next;
    }
       
       

      
    public static void main(String[]args){
    SinglyLinkedList sll=new SinglyLinkedList();
    sll.head=new ListNode(20);
    ListNode second=new ListNode(30);
     ListNode third=new ListNode(40);
      ListNode fourth=new ListNode(50);
      ListNode fifth=new ListNode(60);
    
      sll.head.next=second;
      second.next=third;
      third.next=fourth;
      fourth.next=fifth;
   
      
      
   sll.display();
   sll.InsertFisrt(11);
   sll.InsertLast(15);
   sll.display();
   sll.minNode();
   sll.maxNode();
   sll.DeleteLast();
   sll.Remove();
   sll.display();
System.out.println("After deleting a node {15} And Removing a Node {30} now the Length of List is --> "+sll.length());
   
}}
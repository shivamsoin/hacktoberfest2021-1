import java.util.*;
class node<T>
{
 T data;
 node next;
 node(T data)
 {
  this.data=data;
 }
}
class DelFirstNode
{
 public static void printLL(node<Integer> head)
 {
  node<Integer> temp = head;
  while(temp!=null)
  {
   System.out.println(temp.data);
   temp=temp.next;
  }
 }
 public static node<Integer> DelNode(node<Integer> head)
 {
  head=head.next;
  return head;
 }
 public static node<Integer> createList()
 {
  Scanner sc = new Scanner(System.in);
  node<Integer> head = null;
  node<Integer> tail=null;
  int num=sc.nextInt();
  while(num!=-1)
  {
   node<Integer> newNode = new node<Integer>(num);
   if(head==null)
   {
    head=newNode;
    tail=newNode;
   }
   else
   {
    tail.next=newNode;
    tail=tail.next;
   }
   num=sc.nextInt();
  }
  return head;
 }
 public static void main(String args[])
 {
  node<Integer> head = createList();
  head=DelNode(head);
  printLL(head);

 }
}

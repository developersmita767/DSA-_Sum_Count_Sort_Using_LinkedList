import java.util.*;
class Node
{
	int data;
	Node next;
}
class SL
{
  static Node head;
  static Scanner sc=new Scanner(System.in);
  static void create()
  {
    Node cur=null,ptr=null;

    char ch='y';
    int c=0;
    while(ch=='y')
    {
      
       cur=new Node();
       if(cur==null)
       {
         System.out.println("some problem");
         break;
       }
       c++;
        System.out.println("enter node"+c+" data");
        cur.data=sc.nextInt();
        cur.next=null;
        if(head==null)
        {
          head=cur;
        }
        else
        {
          ptr.next=cur;
        }
        ptr=cur;
         System.out.println("to create new node press y");
         ch=sc.next().charAt(0);

      }
    }
    static void disp()
    {
        if(head==null)
      {
       System.out.println("no elements");
       return;
      }
       System.out.println("elements are");
       Node ptr=head;
       while(ptr!=null)
       {
          System.out.println(ptr.data);
          ptr=ptr.next;
       }
    }
    static void startinsert()
    {
      Node cur=new Node();
       System.out.println("enter 1st element");
       cur.data=sc.nextInt();
       cur.next=head;
       head=cur;
    }
    static void startdelete()
    {
      if(head==null)
      {
         System.out.println("no elements");
         return;
      }
       System.out.println("delete elements"+head.data);
       head=head.next;
    }
    static void endinsert()
    {
     Node cur=new Node();
      System.out.println("enter last elements");
      cur.data=sc.nextInt();
      if(head==null)
      {
        head=cur;
        return;
      }
      Node ptr=head;
      while(ptr.next!=null)
      {
        ptr=ptr.next;
      }
      ptr.next=cur;
    }
    static void enddelete()
    {
      if(head==null)
      {
        System.out.println("no elements");
        return;
      }
      Node temp,ptr;
      temp=head;
      ptr=head;
      while(temp.next!=null)
      {
       ptr=temp;
       temp=temp.next;
      }
       System.out.println("delete elements"+temp.data);
       ptr.next=null;
       temp=null;
    }
    static int sumele()
    {
      if(head==null)
      {
        System.out.println("no elements ");
        return 0;
      }
      Node temp=head;
      int s=0;
      while(temp!=null)
      {
        s=s+temp.data;
        temp=temp.next;
      }
      return s;
    }
    static int countele()
    {
      if(head==null)
      {
        System.out.println("no elements ");
        return 0;
      }
      Node temp=head;
      int c=0;
      while(temp!=null)
      {
        c++;
        temp=temp.next;
      }
      return c;
    }
    static void sort()
    {
      if(head==null)
      {
        System.out.println("no elements ");
        return ;
      }
      Node x=null;
      int t;
      Node y=null;
      for(x=head;x.next!=null;x=x.next)
      {
        for(y=x.next;y!=null;y=y.next)
        {
          if(x.data>y.data)
          {
            t=x.data;
            x.data=y.data;
            y.data=t;
          }
        }
      }
    }
}

class Test
{
	public static void main(String[] args)
	{
	  SL.create();
	  SL.disp();
    System.out.println("sum of elements= "+ SL.sumele());
     System.out.println("count of elements= "+ SL.countele());
    SL.sort();
    System.out.println("after sorting");
    SL.disp();
	  
  }
}
  


	

import java.io.IOException;


public class StackImp 
{
	public class Node
	{
		String value;
		Node next;		
	}
	
	public  Node top;
	
	public  String pop()
	{
		if(top!=null)
		{
			String item = top.value;
			top = top.next;
			return item;
		}
		
		return null;		
	}
	
	public  void push(String obj)
	{
		if(top!=null)
		{
			Node X = new Node();
			X.value = obj;
			X.next = top;
			top = X;
		}
		else
		{
			top = new Node();
			top.value = obj;
			top.next = null;
		}
	}
	
	public  String peek()
	{
		return top.value;
	}
	
}

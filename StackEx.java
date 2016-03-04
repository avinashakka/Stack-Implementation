import java.util.Scanner;


public class StackEx 
{
	public static void main(String[] args)
	{
		StackImp Stac = new StackImp();
		int x = 1;
		while(x > 0)
		{
			System.out.println("Enter a option to proceed.");
			System.out.println("1:Insert 2:Pop 3:Peek top element 0:exit");
		
			Scanner sc = new Scanner(System.in);
		     x = sc.nextInt();		
		
			switch(x)
			{
			case 1:System.out.println("Enter a String to push into the stack");
				   Stac.push(sc.next());
				   break;
			case 2: System.out.println("Popped element is: "+Stac.pop());
					break;
					
			case 3: System.out.println("Peeked top element is: "+Stac.peek());
					break;
			
			default:System.out.println("Bye Bye");
					break;
			}
		}

		System.exit(0);
	}

}

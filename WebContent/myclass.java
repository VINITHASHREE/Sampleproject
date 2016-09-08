package iteratorinterface;
import java.util.*;  
public class myclass
{

	public static void main(String[] args)
	{
		
  
ArrayList<String> al=new ArrayList<String>();  
al.add("vinitha");  
al.add("shree");  
al.add("harish");  
al.add("supriga");  
  
ListIterator<String> itr=al.listIterator();  
  
System.out.println("traversing elements in forward direction...");  
while(itr.hasNext())
  {  
System.out.println(itr.next());  
  }  
  
  
System.out.println("traversing elements in backward direction...");  
while(itr.hasPrevious())
  {  
System.out.println(itr.previous());  
  }  
	}  
}  
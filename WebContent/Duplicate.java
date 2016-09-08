package set;
import java.util.*; 

public class Duplicate {

  public static void main(String args[])
  {  
   
  HashSet<String> al=new HashSet<String>();  
  al.add("shree");  
  al.add("shree");  
  al.add("vinitha");  
 
  
  Iterator<String> itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}
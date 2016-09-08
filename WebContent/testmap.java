package mapinterface;
import java.util.*;

public class testmap 
{

	public static void main(String[] args)
	{
		
  HashMap<Integer,String> hm=new HashMap<Integer,String>();  
  
  hm.put(100,"DIARYMILK");  
  hm.put(101,"KITKAT");  
  hm.put(102,"MUNCH");  
  
  for(Map.Entry m:hm.entrySet())
  {  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
    }  
}
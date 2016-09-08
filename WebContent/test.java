package sample1;

import java.util.*; 

public class test {

	public static void main(String[] args) {

  ArrayList<String> al=new ArrayList<String>();  
  al.add("vinitha");  
  al.add("shree");  
  al.add("harish");  
    
  ArrayList<String> al2=new ArrayList<String>();  
  al2.add("vijay");  
  al2.add("nazriya");  
    
  al.addAll(al2);    
  
  Iterator itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  
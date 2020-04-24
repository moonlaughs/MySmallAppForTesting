package myPackage;

public class D { //division
	 
	public static boolean id(String S) {
		int n = S.length();     
		if (S.charAt(n - 1) != '5' && S.charAt(n - 1) != '0')         // last one is not 5 or 0 
			return false;     
		
		int sum = 0;     
			
		for(int i = 0; i < S.length(); i++)         //5645746   5+6+...
			sum += (int)S.charAt(i);         
			
		if(sum % 3 == 0)             
			return true;         
		else            
			return false; 
		} 
	
	
	public static boolean id2(String S) {
		int n = S.length();     
		if (!S.endsWith("5") && !S.endsWith("0"))         //it should be 5 or 0
			return false; 
		
		int sum = 0;  
		
		for(int i = 0; i < S.length(); i++)         
			sum += (int)S.charAt(i);         
			
		if(sum % 3 == 0)             
			return true;         
		else            
			return false; 
		} 
	
	
	
	
	public static boolean id3(String S) {
		
		if(Integer.parseInt(S) % 15 == 0)
			return true;
		else
			return false;
		
	}
	
	
	
	
	
	public static void main (String[] args) {     
		
		String S = args[0];     
		
		if(id(S) == true)         
			System.out.println("Yes");     
		else        
			System.out.println("No"); 
		}
}

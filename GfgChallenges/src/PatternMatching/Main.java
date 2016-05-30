package PatternMatching;

import java.util.HashMap;

public class Main {
	String string;

	public Main() {
		string = "";
	}
	public Main(String newString) {
		string = newString;
	}
	public static void main(String[] args) {
//		String givenString = "123 abcdesklf jdl .k/_ )(-+=&!@#$%^&*";
//		String startWith = "123";
//		
		
//		PatternMatching pattern = new PatternMatching(givenString, startWith);
		
//		System.out.println(pattern.isMatch());
		
//		isMath("(1234...!@#$%^&* 8888 abcdefg k)","");

//		int[] numbers = {3,5,1,6,1,4,1,0,8,9};
//		System.out.println(areRandom(numbers ));
		
		System.out.println(isPalin("asa"));
	}
	public static boolean isPalin(String string){
		while(!string.equals("") || string != null){
			if(string.length()==1|| string.equals("") || string == null)
				return true;
			if(string.charAt(0)!=string.charAt(string.length()-1)){
				return false;
			}else{
				string = string.substring(1,string.length()-1);
			}
		}
		return false;
	}
	
	//recursive
	public static boolean isPalindrom(String string){
		if(string==null || string.equals("")){
			return true;
		}
		else if(string.length()==1){
			return true;
		}
		else {
			if(string.charAt(0)!=string.charAt(string.length()-1)){
				return false;
			}else{
				return isPalindrom(string.substring(1,string.length()-1));
			}//
			 
		}
	}
	//(1234...!@#$%^&* 8888 abcdefg k)
	public static boolean isMath(String string, String pattern){
		if(!string.startsWith("(") || !string.endsWith(")")){
			return false;
		}
		string = string.substring(1, string.length()-2);
		if(!string.startsWith(pattern)){
			return false;
		}
		int i = pattern.length();
		
		if(!Character.isDigit(string.charAt(i))){
			return false;
		}
		else{
			i=i+1;
			for(int j=i;j<string.length();j++){
				if(!Character.isDigit(string.charAt(j))){
					i=j;
					break;
					
				}
			}
			
		}
		
		
		
		System.out.println(string);
		
		return true;
	}
	
	
	public static boolean areRandom(int numbers[]){
		HashMap<Integer, String> repeated = new HashMap();
		
		repeated.put(1, "2");
		System.out.println(repeated.get(1));
		
		repeated.put(1, repeated.get(1) + " abc");
		System.out.println(repeated.get(1));
		
		return true;
	}

}

package PatternMatching;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching {

	private static String string;
	private static String start;
	
	public PatternMatching(String string, String start) {
		this.string = string;
		this.start = start;
		
	}
	
	
	public static boolean isMatch(){
		int i;
		boolean isMatching;
		if(!string.startsWith(start)&&string.length()<string.length()){
			return false;
		}
		else{
			for(i=start.length();i<string.length();i++){
				if(Character.isDigit(string.charAt(i))){
					return false;
				}
			}
			isMatching = true;
		}
		
		return isMatching;
	}
	
	public static void main( String args[] ){

	      // String to be scanned to find the pattern.
	      String line = "This order was placed for QT3000! OK?";
	      String pattern = "[amn]{2}";

	      // Create a Pattern object
//	      Pattern r = Pattern.compile(pattern);

	      // Now create matcher object.
//	      Matcher m = r.matcher(line);
	      
	      boolean test = Pattern.matches(pattern, "amnamnamn");
	      
	      System.out.println(test);
	      
	      
//	      if (m.find( )) {
//	         System.out.println("Found value: " + m.group(0) );
//	         System.out.println("Found value: " + m.group(1) );
//	         System.out.println("Found value: " + m.group(2) );
//	      } else {
//	         System.out.println("NO MATCH");
//	      }
	   }
	

}

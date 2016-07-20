package StringOps;
import java.util.ArrayList;
import java.util.HashMap;

public class StringOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


//	System.out.println(solution("F s..S e . x x "));
	
	
		System.out.println(isPalin_iterative("aa"));
	
	}
	
	public static boolean isPalindrome(String str){
		if(str.length()<2) return true;
		if(str.charAt(0)!=str.charAt(str.length()-1)) 
			return false; 
		return isPalindrome(str.substring(1,str.length()-1));
	}
	
	public static boolean isPalin_iterative(String str){
		
		for(int i=0;i<str.length();i++)
			if(str.charAt(i)!=str.charAt(str.length()-1-i))
				return false;
		return true;
	}
	
	public static int fib(int n){
		int result=0, i=0, j=1;;
		if(n<=0){
			System.out.println("There is no 0th Fibonacci.");
			return -1;
		}
		else if(n==1){
			return 0;
		}
		else{
			for(int x=1; x<n;x++){
				result = i+j;
				i=j;
				j=result;
			}
		}
		return result;
	}
	
	public static int solution(String S) {
		 ArrayList<String> sentences = new ArrayList<String>();
		 int max=0;
		 int tempMax = 0;
		 
		 
		 int newIndex=0;
		 for(int i=0; i<S.length();i++){
			 if(S.charAt(i)=='.'||S.charAt(i)=='?'||S.charAt(i)=='!' || i==S.length()-1){
				 sentences.add(S.substring(newIndex,i));
				 newIndex = i+1;
				 System.out.println(sentences);
			 }
		 }
		 
		 tempMax = countWords(sentences.get(0));
		 
		 for(int j=1; j<sentences.size();j++){
			 tempMax = countWords(sentences.get(j));
			 if(tempMax > max)
				 max = tempMax;
		 }
		 
		 return max;
	    }


	private static int countWords(String sentence) {
		int counter=0;
		if(sentence.length()==0) return 0;
		for(int i=0; i<sentence.length();i++){
			if(sentence.charAt(i)==' '){
				counter = counter+1;
				 if(i<sentence.length()-1){
					 while(sentence.charAt(i+1)== ' '){ //To get the next noWhiteSpace char index
						 i=i+1;
					}
				 }
			}
//			System.out.println(sentence);
		}

		return counter;
	}
}

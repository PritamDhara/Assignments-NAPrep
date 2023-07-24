package stringassignments;

public class VariousStringOperations {
	public static void main(String[] args) {
		
		String str = "Java string pool refers to collections of String which are stored in heap memory";
		
		//opration-1-tolowercase
		System.out.println(str.toLowerCase());
		
		//opration-2-touppercase
		System.out.println(str.toUpperCase());
		
		//operation-3-replace characters
		System.out.println(str.replaceAll("[a]", "\\$"));
		
		//operation-4-check if contains a word
		String word="collections";
		System.out.println("Checking if the word is present or not : ------"+str.contains(word));
		
		//operation-5 - check equality
		String str2="java string pool refers to collections of string which are stored in heap memory";
		
		System.out.println("Checking the Two string are equal or not ----"+ str.equals(str2));
		
		System.out.println("Yes equalsIgnoreCase is there for checking if the strings are equals or not not bothering of case : -----"+str.equalsIgnoreCase(str2));
		
	}

}

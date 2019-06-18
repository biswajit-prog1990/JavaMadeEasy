/*
 * Implementation - I will be implementing it by changing into char array and then comparing each character
 * Developer - Biswajit Dutta
 */

package co.java.basicprograms;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class PrintRepeatedCharactersString {
	
	static void checkRepeatedCharacter(String myString) {
		char[] strArray = myString.toCharArray();
		
		Map<Character, Integer> charMap = new HashMap<Character,Integer>();
		for(Character ch: strArray) {
			if(charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch)+1);
			}
			else
				charMap.put(ch, 1);
		}
		
		Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
		System.out.printf("List of duplicate characters in String '%s' %n",myString);
		for(Map.Entry<Character, Integer> ch : entrySet) {
			if(ch.getValue()>1)
				System.out.printf("%s : %d %n", ch.getKey(),ch.getValue());
		}
	}

	public static void main(String[] args) {
		String testStr = "malayalam";
		checkRepeatedCharacter(testStr);
	}

}

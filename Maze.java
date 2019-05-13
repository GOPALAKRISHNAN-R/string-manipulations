//: object/Maze.java
package string.duplication;

import java.util.Scanner;

/**Displays a string  without duplicate character.
* @author R.GOPALAKRISHNAN
* @author www.rgopalakrishnanmca.simplesite.com 
**/

public class Maze 
{
	/** Entry point to class & application.
	* @param args array of string arguments
	* @throws exceptions No exceptions thrown
	*/	
	public static void main(String args[]) 
	{
	
		String s1="GOPALA";
		String s2="KRISHNAN";
		System.out.println(removeDuplicateCharacter(s1));
		System.out.println(removeDuplicateCharacter(s2));
				
	
	}
	public static String removeDuplicateCharacter(String str)
	{
		char ch[]=str.toCharArray();		
		String str1="";
		for (char val : ch) {
            if (str1.indexOf(val) == -1) {
            	str1 += val; 
            }
        }
				
		return str1;
	}
	

}

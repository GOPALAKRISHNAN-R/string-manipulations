//: object/Sample.java
package string;

/**Displays a string(string pre-build methods) 
* @author R.GOPALAKRISHNAN
* @author www.rgopalakrishnanmca.simplesite.com 
**/
public class Sample 
{
		
/** Entry point to class & application.
* @param args array of string arguments
* @throws exceptions No exceptions thrown
*/
	public static void main(String args[])
	{
			System.out.println("String Manipulation");
			System.out.println("------ ------------");
			
			String str=new String("Gopalakrishnan");
			
			StringBuilder str1=new StringBuilder("R");
			str+=" R";
			
			System.out.println("length of ("+str1+") is "+str1.length());
			
			System.out.println("Uppercase of str is ("+str+") is "+str.toUpperCase());
			
			System.out.println("Lowercase of str is ("+str+") is "+str.toLowerCase());
				
			str1.append(".Gopal");
			
			System.out.println("length of("+str1+") is "+str1.length());
			
			System.out.println(str1);
			
			System.out.println(str);
			
			System.out.println("LastIndex of a ("+str+") is "+str.lastIndexOf("a"));
			System.out.println("LastIndex of b ("+str+") is "+str.lastIndexOf("b"));
			System.out.println("CharAt of 3 ("+str+") is "+str.charAt(3));
			
	}
			
}

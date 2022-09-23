/**
 * 
 */
package daythree.stringexample;

/**
 * @author UD SYSTEMS
 *
 */
public class StringOperation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//             01234   --- start index position is 0 and end position is length-1
		String hello= "Hello";
		
		System.out.println("Length or size of the hello string----"+hello.length());
		System.out.println("Index of character 'e' in hello string----"+hello.indexOf('e'));
		System.out.println("Index of character 'l' in hello string----"+hello.indexOf('l'));
		System.out.println(hello.lastIndexOf('l'));
		System.out.println("Substring from the hello ----"+hello.substring(1));
		System.out.println("Substring from the hello ----"+hello.substring(1,3));
		
		String hi ="Hi   ";
		System.out.println(hi);
		System.out.println("Remove spaces ----"+hi.trim());
		
		//valueOf - Converts data to String
		int num = 12345;
		String numStr =String.valueOf(num);
		
		System.out.println(numStr instanceof String);
		Integer n = Integer.parseInt(numStr);
		System.out.println(n instanceof Integer);
		System.out.println(n*5);
		/**
		String emptyString=null;
		System.out.println(emptyString.isEmpty());
		**/
		
		String emptyString="";
		System.out.println(emptyString.isEmpty()); // Introduced in JDK 6
		
		System.out.println(hello.hashCode());
		hello=hello.concat(" Everyone");//Used to concatenate a string to an existing string.
		System.out.println(hello);
		System.out.println(hello.hashCode());
		
		String leadingSpace ="   Morning     ";
		System.out.println(leadingSpace.trim()); // trim() will remove Leading as well as trailing whitespace
		String strStrip = " Hello World !!   ";
		System.out.println(strStrip.strip());// It returns a string whose value is given string, with all leading and trailing white space removed.
		System.out.println(strStrip.stripLeading());
		System.out.println(strStrip.stripTrailing());
		System.out.println(strStrip.trim());// this will give you same results as strip() method
		System.out.println("****************************************");
		//strStrip=strStrip.replaceAll("\\s", "");
		strStrip=strStrip.replaceAll(" ", "");
		System.out.println("After removing all white spaces ----"+strStrip);
		System.out.println(strStrip.toLowerCase());
		System.out.println(strStrip.toUpperCase());
		
		String fruit ="Ap ple";
		System.out.println(fruit.length());
		System.out.println(fruit.indexOf('l'));
		System.out.println(fruit.indexOf("A", 0)+"---"+fruit.indexOf("l",1));
		
		//Api for paragraphs -- NO
		System.out.println("******************************************");
		String paragraph="Hello Everyone, today is very wonderful sunny day. We are learning String concepts. Here we are learning now about paragraph.";
		System.out.println(paragraph.split("[.]"));
		String[] splittedParagraph = paragraph.split("[.]");
		
		for(String sentence : splittedParagraph) {
			System.out.println(sentence);
		}
		
		
		
		
		
	}

}

package LOGICALPROGRAM;

public class REMOVESPECIALCHAR {

	public static void main(String[] args) {
		String str="hello@$%%^world";
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isLetterOrDigit(ch)|| Character.isWhitespace(ch)) {
			sb.append(ch);
		}}
		
String st=sb.toString();
System.out.println(st);
	}

}

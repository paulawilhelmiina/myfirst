package javaA;
import java.util.*;

public class ceasar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("write a message");
		String message = sc.nextLine();

		message = message.toLowerCase();
		int mesLen = message.length();
		char ch[] = message.toCharArray();
		
		System.out.println("enter the value that letters of the message will be shifted by: ");
		int shift = sc.nextInt();
		
		char alphabet;
		String chipmessage = "";
		
		for(int i = 0; i<mesLen; i++) {
			alphabet = message.charAt(i);
			  if(alphabet >= 'a' && alphabet <= 'z') 
	            {
	             // shift alphabet
	             alphabet = (char) (alphabet + shift);
	            }
			  chipmessage = chipmessage + alphabet;
		}
		System.out.println("Ceasars chipher message is: ");
		System.out.println(chipmessage);
		
	}

}

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.*;

public class uppgift3 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
	System.out.println("hur många siffror vill du ha i listan? ");
	int amount = Integer.parseInt(sc.nextLine());
	ArrayList<Integer> myList = new ArrayList<Integer>();
	for(int i = 0; i < amount; i++) {
		myList.add(0);
	}

	
	while(true) {
	try {
		System.out.println("vilken plats i listan?");
		int plats = Integer.parseInt(sc.nextLine());
		System.out.println("vilken värde?");
		int i = Integer.parseInt(sc.nextLine());
		
		myList.add(plats, i);
		
	}catch(InputMismatchException | IndexOutOfBoundsException | NumberFormatException e){
			System.out.println("bara int eller över listan");
			
		}
	System.out.println(myList);
	}

	}

}

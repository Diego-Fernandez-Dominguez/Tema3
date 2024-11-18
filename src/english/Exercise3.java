package english;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
	int arr[] = new int[10];
	
	int position;
	
	boolean fly = true;
	
	int ans;
	
	Random ramon = new Random();
	
	Scanner juanjo = new Scanner(System.in);
	
	
	do {
		Arrays.fill(arr, 0);
		position = ramon.nextInt(0, arr.length);
		arr[position] = 1;
		System.out.println(position);
		System.out.println("Where's the fly?");
		ans = juanjo.nextInt();
		
		if (ans == position) {
			System.out.println("You guessed it!");
			fly = false;
		} else if (ans == position -1 || ans == position +1) {
			System.out.println("Close but no, git gud");
			
		} else {
			System.out.println("Too far away, uninstall");
			
		}
	} while (fly);
	juanjo.close();
}
}

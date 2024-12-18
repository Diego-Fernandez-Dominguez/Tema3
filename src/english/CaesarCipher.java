package english;

import java.util.Scanner;

public class CaesarCipher {
	public static void main(String[] args) {
		
		//here we create the values variable that we will use to change the letters/numbers value on replace funtion
		char values [];
		
		//this will saves the message introduced by the user
		String message;
		
		int shift; 
		
		//el ecaner
		Scanner sc = new Scanner(System.in);
		
		//we ask the user's message and save it in message variable
		System.out.println("Tell me the message: ");
		message=sc.nextLine();
		
		//we ask for the shift
		System.out.println("Shift:");
		shift = sc.nextInt();
		//
		values = message.toUpperCase().toCharArray();
		
		replace(values,message, shift);
		
		System.out.println(String.copyValueOf(values));
	}

	static void replace(char[] values, String message, int shift) {
		
		for(int i=0;i<message.length();i++) {
		
			
			if(values[i]=='Z') {
				
				do {
				
					if(shift>25) {
						values[i]=(char) ('A' + 25);
					}else {
						values[i]=(char) ('A' + shift);
					}
				
				shift-=25;
				
				}while(((values[i]>'Z' && values[i]<'A')) && shift>0 && values[i]=='Z');
				
			}else if(values[i]=='9') {
				
				
				do {
					
					values[i]= (char) ('0' + shift);
					
					shift-=25;
					
					}while((values[i] > '9' && values[i] < '0') && shift>0 && values[i]=='9');
				
			}else if(values[i] < 'Z' && values[i] >= 'A') {
				
				do {
					
					values[i]+=shift;
					
					shift-=25;
					
					}while((values[i]>'Z' && values[i]<'A') || shift>0);
				
			}else if(values[i] < '9' && values[i] >= '0') {
				
				do {
					
					values[i]+=shift;
					
					shift-=10;
					
					}while((values[i] > '9' && values[i] < '0') || shift>0);
			}
				
		}	
			
		}
	}


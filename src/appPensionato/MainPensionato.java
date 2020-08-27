package appPensionato;

import java.util.Locale;
import java.util.Scanner;

import entities.BedRoom;

public class MainPensionato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		final int roons = 10;
		
		BedRoom[] vectRoom = new BedRoom[roons];
		
		System.out.print("Informe o número de hospedes: ");
		int n = sc.nextInt();
		sc.nextLine();		
		
		for(int i=0; i < n; i++) {					
			
			System.out.print("Guets name: ");
			String guestName = sc.nextLine();
			System.out.print("Guest email: ");
			String guestEmail = sc.nextLine();
			System.out.print("Quarto: ");
			int roomN = sc.nextInt();
			sc.nextLine();
			
			vectRoom[roomN] = new BedRoom(guestName, guestEmail);				
		}
		
		BedRoom room = new BedRoom();
		
		for(int i=0; i<vectRoom.length; i++) {
			if(vectRoom[i] != null) {
				System.out.printf("Bedroom: %d %s %n", i, vectRoom[i]);
			}
		}
		
		sc.close();

	}

}

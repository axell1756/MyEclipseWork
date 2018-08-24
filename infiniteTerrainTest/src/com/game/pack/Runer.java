package com.game.pack;

import java.util.Scanner;

public class Runer {

	public static Treasure t = new Treasure(4, 1);
	public static Player p = new Player(0, 0);
	
	public static void main(String[] args) {

		game();
		
	}

	public static void game() {

		Scanner sc = new Scanner(System.in);

		do {
			
			int playerSum = Math.abs(p.getPosX()) + Math.abs(p.getPosY());
			int treasureSum = Math.abs(t.getPosX()) + Math.abs(t.getPosY());
			int distance = Math.abs(playerSum - treasureSum);
			int distanceAfterStep = distance;
			
			System.out.print("Which way are you going?: ");
			String playerInput = sc.nextLine();

			switch (playerInput) {
			
			case "n": 
				p.setPosX(p.getPosX()+1);
				distanceAfterStep++;
				System.out.println("Current distance: " + String.valueOf((distanceAfterStep)));
				break;
				
			case "e":
				p.setPosX(p.getPosX()-1);
				distanceAfterStep--;
				System.out.println("Current distance: " + String.valueOf((distanceAfterStep)));
				break;
				
			case "w":
				p.setPosY(p.getPosY()+1);
				distanceAfterStep++;
				System.out.println("Current distance: " + String.valueOf((distanceAfterStep)));
				break;
				
			case "s":
				p.setPosY(p.getPosY()-1);
				distanceAfterStep--;
				System.out.println("Current distance: " + String.valueOf((distanceAfterStep)));
				break;
			}
			
			if (distance > distanceAfterStep) {
				System.out.println("You are getting closer!");
				continue;
			} else if (distanceAfterStep == 0){
				System.out.println("You have reacher your destination!");
				break;
			} else {
				System.out.println("You are getting further!");
				continue;
			}

		} while ((t.getPosX() != p.getPosX() || t.getPosY() != p.getPosY()) == true);

		sc.close();
	}

}

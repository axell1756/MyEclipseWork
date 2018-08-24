package com.game.pack;

import java.util.Scanner;

public class Runer {

	public static Treasure t = new Treasure(4, 0);
	public static Player p = new Player(0, 0);
	
	public static void main(String[] args) {

		game();
		
	}

	public static void game() {

		Scanner sc = new Scanner(System.in);

		do {
			
			int xDifference = Math.abs(Math.abs(p.getPosX()) - Math.abs(t.getPosX()));
			int yDifference = Math.abs(Math.abs(p.getPosY()) - Math.abs(t.getPosY()));
			
			int distanceBetween = Math.abs((Math.abs(p.getPosX()) + Math.abs(p.getPosY())) - (Math.abs(t.getPosX()) + Math.abs(t.getPosY()))) - 1;
			
			System.out.print("Which way are you going?: ");
			String playerInput = sc.nextLine();

			switch (playerInput) {
			
			case "n": 
				p.setPosX(p.getPosX()+1);
				System.out.println("Current distance X: " + String.valueOf((xDifference)));
				System.out.println("Current distance Y: " + String.valueOf((yDifference)));
				break;
				
			case "e":
				p.setPosX(p.getPosX()-1);
				System.out.println("Current distance X: " + String.valueOf((xDifference)));
				System.out.println("Current distance Y: " + String.valueOf((yDifference)));
				break;
				
			case "w":
				p.setPosY(p.getPosY()+1);
				System.out.println("Current distance X: " + String.valueOf((xDifference)));
				System.out.println("Current distance Y: " + String.valueOf((yDifference)));
				break;
				
			case "s":
				p.setPosY(p.getPosY()-1);
				System.out.println("Current distance X: " + String.valueOf((xDifference)));
				System.out.println("Current distance Y: " + String.valueOf((yDifference)));
				break;
			}
			/*
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
			 */
		} while ((t.getPosX() != p.getPosX() || t.getPosY() != p.getPosY()) == true);

		sc.close();
	}

}

package virtualPet;

import java.util.Scanner;

public class VirtualPetApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VirtualPet VirtualInstance = new VirtualPet();
		System.out.println("Welcome to Virtual Pet");
		System.out.println("Whats your dogs name?");
		VirtualInstance.Name = input.nextLine();
		System.out.println(
				"Your Dogs name is " + "" + VirtualInstance.getName() + "," + VirtualInstance.petStatus() + " .");

		while (!(VirtualInstance.turns == 0)) {
			VirtualPet.getStats();
			VirtualPet.actions();
			int choice = input.nextInt();
			switch (choice) {
			case 1:
				VirtualPet.play();
				System.out.println(
						VirtualInstance.getName() + "'s " + "happiness level is " + VirtualInstance.happinessLevel);
				System.out.println("You have " + VirtualInstance.turns + " left.");
				VirtualPet.tick();
				VirtualPet.getHappinessLevel();

				break;
			case 2:
				VirtualPet.feed();
				System.out.println(VirtualInstance.getName() + "'s " + "hunger level is " + VirtualInstance.foodLevel);
				System.out.println("You have " + VirtualInstance.turns + " left.");
				VirtualPet.tick();
				VirtualPet.getFoodLevel();

				break;
			case 3:
				VirtualPet.sleep();
				System.out.println(VirtualInstance.getName() + "'s " + "sleep level is " + VirtualInstance.sleepLevel);
				System.out.println("You have " + VirtualInstance.turns + " left.");
				VirtualPet.tick();
				VirtualPet.getSleepLevel();

				break;
			case 4:
				System.out.println("Quitter!!!");
				System.exit(0);
				input.close();
				break;
			default:
				System.out.println("Try again, you gotta to pick a number between 1 and 4");
				VirtualPet.actions();
				break;

			}

		}
		System.out.println("Game Over!!!");
		System.out.println("Sleep Level: " + VirtualInstance.sleepLevel);
		System.out.println("Hunger Level: " + VirtualInstance.foodLevel);
		System.out.println("Happiness Level: " + VirtualInstance.happinessLevel);

	}

}

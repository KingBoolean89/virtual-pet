package virtualPet;

public class VirtualPet {

	String Name;
	static String status;
	static int foodLevel = 25;
	static int sleepLevel = 25;
	static int happinessLevel = 25;
	static int turns = 10;

	public VirtualPet() {
		String Name = getName();
	}

	String getName() {
		return Name;
	}

	public static void getStats() {
		getFoodLevel();
		getSleepLevel();
		getHappinessLevel();
		turns();
	}

	public static int getFoodLevel() {
		return foodLevel;
	}

	public static int getSleepLevel() {
		return sleepLevel;
	}

	public static int getHappinessLevel() {
		return happinessLevel;
	}

	public static void tick() {
		foodLevel--;
		happinessLevel--;
		sleepLevel--;
		--turns;
	}

	public static int turns() {
		return turns;

	}

	public static void feed() {
		foodLevel += 10;
		happinessLevel++;
		sleepLevel--;
	}

	public static void play() {
		happinessLevel += 10;
		foodLevel--;
		sleepLevel--;

	}

	public static void sleep() {
		sleepLevel += 10;
		foodLevel--;
		happinessLevel++;
	}

	public static void actions() {
		System.out.println("What would you like to do?");
		System.out.println("1. Play");
		System.out.println("2. Eat");
		System.out.println("3. Sleep");
		System.out.println("4. Quit");

	}

	public static String petStatus() {
		if (foodLevel <= 10 && sleepLevel <= 10 && happinessLevel < 4) {
			status = "Your dog is hungry, tired, AND bored.";
		} else if (sleepLevel <= 10 && happinessLevel <= 10) {
			status = "Your dog is tired and bored.";
		} else if (sleepLevel <= 10 && foodLevel <= 10) {
			status = "Your dog is hungry and tired.";
		} else if (foodLevel <= 10 && happinessLevel <= 10) {
			status = "Your dog is hungry and bored.";
		} else if (foodLevel <= 10) {
			status = "Your dog is hungry.";
		} else if (happinessLevel <= 10) {
			status = "Your dog is bored.";
		} else if (sleepLevel <= 10) {
			status = "Your dog is tired.";
		}
		return status = "Your dog Feels Great!";
	}

}

import java.util.*;

public class Zork {
	static Scanner sc = new Scanner(System.in);
	static boolean isSecretFound = false;
	static int numbersOfRoomsVisited = 0;

	public static void Foyer() {
		numbersOfRoomsVisited++;
		System.out.println(
				"You are in the Foyer, There is dead Scorpio.\n You can (1)exit to the north or press Q to quit");
		if (sc.nextLine().equalsIgnoreCase("1")) {
			FrontRoom();

		}
		return;
	}

	public static void FrontRoom() {
		numbersOfRoomsVisited++;
		System.out.println(
				"You are in the Front Room, You see a Piano.\n You can choose :\n (1) Go to the Foyer in the South \n(2) Go to Library in the west \n(3) Go to the Kitchen in east");
		String tmp = (sc.nextLine());
		if (tmp.equalsIgnoreCase("1"))
			Foyer();
		else if (tmp.equalsIgnoreCase("2"))
			Library();
		else if (tmp.equalsIgnoreCase("3"))
			Kitchen();

	}

	public static void Library() {
		numbersOfRoomsVisited++;
		System.out.println(
				"You are in the Library, You see Spiders.\n You can choose :\n (1) Go to the Front room  in east  \n(2) Go to Dining Room in north");
		if (sc.nextLine().equalsIgnoreCase("1"))
			FrontRoom();
		else
			DiningRoom();
	}

	public static void Kitchen() {
		numbersOfRoomsVisited++;
		System.out.println(
				"You are in the Kitchen, You see bats.\n You can choose :\n (1) Go to the Front room  in west  \n(2) Go to Parlor in north ");
		if (sc.nextLine().equalsIgnoreCase("1"))
			FrontRoom();
		else
			Parlor();
	}

	public static void DiningRoom() {
		numbersOfRoomsVisited++;
		System.out.println("You are in Dining Room, You see dust and empty box.\n You can choose :\n (1) Enter library in the East");
		if (sc.nextLine().equalsIgnoreCase("1"))
			Library();
	}

	public static void Vault() {
		numbersOfRoomsVisited++;
		if (isSecretFound || percentChance()) {
			System.out.println(
					" You are in Vault, You see 3 walking Skeltons.\n You can choose :\n (1) Enter Parlor in the North \n (2) Go to Secret Room in the East");
			isSecretFound = true;
			if (sc.nextLine().equalsIgnoreCase("1"))
				Parlor();
			else
				SecretRoom();
		} else {
			System.out.println("You are in Vault, You see 3 walking Skeltons.\n You can choose :\n (1) Enter Parlor in the East \n");
			sc.nextLine();
			Parlor();
		}

	}

	public static void Parlor() {
		numbersOfRoomsVisited++;
		System.out.println(
				"You are in Parlor, You see treasure chest.\n You can choose :\n (1) Enter the vault in the West \n (2) Go to Kitchen in South");
		if (sc.nextLine().equalsIgnoreCase("1"))
			Vault();
		else
			Kitchen();

	}

	public static void SecretRoom() {
		numbersOfRoomsVisited++;
		System.out.println("You are in Secret Room, You see Piles of Gold. Collect as much as you can and when you are ready..\n You can choose :\n (1) To go back to the vault in the West");
		sc.nextLine();
		Vault();
	}

	public static boolean percentChance() {
		Random rand = new Random();
		if (rand.nextInt(4) == 3)
			return true;
		return false;

	}

	public static void main(String[] args) {

		Foyer();

		System.out.println("Number of rooms visited: " + numbersOfRoomsVisited);
		if(percentChance())
			System.out.println("You are being followed by a GHOST!!!");
			}

}

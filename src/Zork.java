import java.util.*;

public class Zork {
	static Scanner sc = new Scanner(System.in);
	static boolean isSecretFound = false, visited = false, gotLamp = false, giftCard = false, goldSilk = false,
			message = false, movie = false, map = false, pianoSong = false, food = false;
	static int numbersOfRoomsVisited = 0;
	static String hasLamp = null;

	public static void Foyer() {
		String ans = null;
		numbersOfRoomsVisited++;
		if (hasLamp.equalsIgnoreCase("Foyer") && !gotLamp) {

			System.out.println(
					"You are in the Foyer, There is dead Scorpio.\n You see a lamp! \n You can:\n Pick up the lamp by typing command \"Get Lamp\" \n exit to the FrontRoom in the North by typing \'N\' or \"Front Room\"   \n to quit type \"Quit\" or \'Q\' \n ");
			ans = sc.nextLine();

			if (ans.equalsIgnoreCase("Get Lamp")) {

				gotLamp = true;
				System.out.println("You got the Lamp, Great! , you can see more details");
			} else if (ans.equalsIgnoreCase("FrontRoom") || ans.equalsIgnoreCase("N")) {
				FrontRoom();
				return;

			} else if (ans.equalsIgnoreCase("Quit") || ans.equalsIgnoreCase("Q")) {
				return;
			}

		}

		if (gotLamp && !goldSilk) {
			System.out.println("Foyer has a spider web made from pure silk containing gold coins which you can take");
			System.out.println("Take the gold coins from the silk type \"Gold Coins\" ");
			ans = sc.nextLine();
			if (ans.equalsIgnoreCase("Gold Coins")) {
				goldSilk = true;
			}

		}

		else
			System.out.println(
					"You are in the Foyer, There is dead Scorpion.\n \n exit to the FrontRoom in the North by typing \'N\' or \"Front Room\"   \n to quit type \"Quit\" or \'Q\' \n ");

		ans = sc.nextLine();
		if (ans.equalsIgnoreCase("FrontRoom") || ans.equalsIgnoreCase("N"))
			FrontRoom();

	}

	public static void FrontRoom() {
		String ans = null;
		numbersOfRoomsVisited++;
		System.out.println("You are in the Front Room, You see a Piano.");
		if (hasLamp.equalsIgnoreCase("FrontRoom") && !gotLamp) {

			System.out.println(
					"You also found a Lamp \n You can take the Lamp by typing \"Get Lamp\" \n Or go to the Foyer in the South by typing \"Foyer\" or \"S\" \n Or go to Library in the west by typing \"Library\" or \"W\" \n Or go to the Kitchen in east by typing \"Kitchen\" or \"E\" \n ");
			ans = sc.nextLine();

			if (ans.equalsIgnoreCase("Get Lamp")) {

				gotLamp = true;
				System.out.println("You got the Lamp, Great! , you can see more details");
			} else if (ans.equalsIgnoreCase("Foyer") || ans.equalsIgnoreCase("S")) {
				Foyer();
				return;

			} else if (ans.equalsIgnoreCase("Library") || ans.equalsIgnoreCase("W")) {
				Library();
				return;
			} else if (ans.equalsIgnoreCase("Kitchen") || ans.equalsIgnoreCase("E")) {
				Kitchen();
				return;
			}
		}

		if ((gotLamp) && !pianoSong) {
			System.out.println("There is Piano, Play your fav Song.");
			pianoSong = true;
			System.out.println(
					"Go to the Foyer in the South by typing \"Foyer\" or \"S\" \n Go to Library in the west by typing \"Library\" or \"W\" \n Go to the Kitchen in east by typing \"Kitchen\" or \"E\" ");
		}

		else

			System.out.println(
					"Go to the Foyer in the South by typing \"Foyer\" or \"S\" \n Go to Library in the west by typing \"Library\" or \"W\" \n Go to the Kitchen in east by typing \"Kitchen\" or \"E\" ");

		ans = (sc.nextLine());
		if (ans.equalsIgnoreCase("Foyer") || ans.equalsIgnoreCase("S")) {
			Foyer();
			return;

		} else if (ans.equalsIgnoreCase("Library") || ans.equalsIgnoreCase("W")) {
			Library();
			return;
		} else if (ans.equalsIgnoreCase("Kitchen") || ans.equalsIgnoreCase("E")) {
			Kitchen();
			return;
		}
	}

	public static void Library() {
		numbersOfRoomsVisited++;
		String ans;
		System.out.println("You are in the Library, You see Spiders.");
		if (hasLamp.equalsIgnoreCase("Library") && !gotLamp) {

			System.out.println(
					"You see a Lamp \n You can get the lamp by typing \"Get Lamp\" \n Or you can go to the Front room in east by typing \"Front Room\" or 'E'  \n Or go to Dining Room in north by typing \"Dining Room\" or 'N' ");
			ans = sc.nextLine();

			if (ans.equalsIgnoreCase("Get Lamp")) {

				gotLamp = true;
				System.out.println("You got the Lamp, Great! , you can see more details");
			} else if (ans.equalsIgnoreCase("Front room") || ans.equalsIgnoreCase("E")) {
				FrontRoom();
				return;

			} else if (ans.equalsIgnoreCase("DiningRoom") || ans.equalsIgnoreCase("N")) {
				DiningRoom();
				return;
			}
		}
		if ((gotLamp) && !message) {

			System.out
					.println("You can Scroll on the wall with a secret message to get $10,000 more, type your message");
			ans = sc.nextLine();
			if (ans.equalsIgnoreCase("I love Java")) {
				message = true;
				System.out.println("Yay you got it");
			} else
				System.out.println("may be next time");
		}
		System.out.println(
				"You can go to the Front room  in east by typing \"Front Room\" or \"E\"  \n Or go to Dining Room in north by typing \"Dining Room\" or \"N\"");
		ans = sc.nextLine();
		if (ans.equalsIgnoreCase("Front room") || ans.equalsIgnoreCase("E")) {
			FrontRoom();
			return;
		} else if (ans.equalsIgnoreCase("DiningRoom") || ans.equalsIgnoreCase("N")) {
			DiningRoom();
			return;
		}

	}

	public static void Kitchen() {
		numbersOfRoomsVisited++;
		String ans;
		System.out.println("You are in the Kitchen,You see bats.");
		if (hasLamp.equalsIgnoreCase("Kitchen") && !gotLamp) {
			System.out.println(
					" You see a Lamp :\n You can get the lamp by typing \"Get Lamp\" \n You can go to the Front room  in west by typing \"Front Room\" or \"West\"  \n Go to Parlor in north by typing \"Parlor\" or \"North\" ");
			ans = sc.nextLine();
			if (ans.equalsIgnoreCase("Get Lamp")) {
				gotLamp = true;
				System.out.println("You got the Lamp, Great! , you can see more details");
			} else if (ans.equalsIgnoreCase("Front room") || ans.equalsIgnoreCase("W")) {
				FrontRoom();
				return;

			} else if (ans.equalsIgnoreCase("Parlor") || ans.equalsIgnoreCase("N")) {
				Parlor();
				return;
			}
		}
		if ((gotLamp) && !food) {
			System.out.println(
					" A refrigerator full of your favorite food/drink, you can have some if they type drink \"coke\" or \"cake\" or whatever.");
			ans = sc.nextLine();
			if (ans.equalsIgnoreCase("coke") || ans.equalsIgnoreCase("cake")) {
				food = true;
			}
		}
		System.out.println(
				"You can go to the Front room in west by typing \"Front Room\" or 'W'  \n Or go to Parlor in north by typing \"Parlor\" or 'N' ");
		ans = sc.nextLine();
		if (ans.equalsIgnoreCase("Front room") || ans.equalsIgnoreCase("W")) {
			FrontRoom();
		}

		else if (ans.equalsIgnoreCase("Parlor") || ans.equalsIgnoreCase("N")) {
			Parlor();
		}
	}

	public static void DiningRoom() {
		numbersOfRoomsVisited++;
		String ans;
		System.out.println("You are in the Dining Room,You see an empty box.");
		if (hasLamp.equalsIgnoreCase("DiningRoom") && !gotLamp) {

			System.out.println(
					"You see a Lamp \n You can get the lamp by typing \"Get Lamp\" \n You can go to the Library  \"Library\" or \"East\"");
			ans = sc.nextLine();

			if (ans.equalsIgnoreCase("Get Lamp")) {

				gotLamp = true;
				System.out.println("You got the Lamp, Great! , you can see more details");
			}

			else if (ans.equalsIgnoreCase("Library") || ans.equalsIgnoreCase("E")) {
				Library();
				return;
			}
		}
		if ((gotLamp) && !giftCard) {
			System.out.println(
					"The box is not actually empty, it contains an Amazon gift card which you can take if you type \"Get Gift Card\"");
			ans = sc.nextLine();
			if (ans.equalsIgnoreCase("Get Gift Card")) {
				System.out.println("You got Lamp and the Gift Card as well");
				giftCard = true;
			}
		}
		System.out.println("You can go to the Library  in East by typing \"Library\" or \"E\"");
		ans = sc.nextLine();
		if (ans.equalsIgnoreCase("Library") || ans.equalsIgnoreCase("E")) {
			Library();
			return;
		}

	}

	public static void Vault() {
		numbersOfRoomsVisited++;
		String ans;
		System.out.println("You are in the Vault, You see 3 walking Skeltons");

		if (hasLamp.equalsIgnoreCase("Vault") && !gotLamp) {

			if (isSecretFound || percentChance()) {
				System.out.println(
						"You see a Lamp .You can choose :\n  You can get the lamp by typing \"Get Lamp\" \n Type \"Parlor\" or 'N' to enter Parlor in the North \n Type \"SecretRoom\" or 'E' to enter Secret Room in the East");
				isSecretFound = true;
			} else
				System.out.println(
						"You see a Lamp .You can choose :\n  You can get the lamp by typing \"Get Lamp\" \n Type \"Parlor\" or 'N' to enter Parlor in the North ");
			ans = sc.nextLine();

			if (ans.equalsIgnoreCase("Get Lamp")) {

				gotLamp = true;
				System.out.println("You got the Lamp, Great! , you can see more details");
			} else if (ans.equalsIgnoreCase("Parlor") || ans.equalsIgnoreCase("N")) {
				Parlor();
				return;
			} else if (ans.equalsIgnoreCase("SecretRoom") || ans.equalsIgnoreCase("E")) {
				SecretRoom();
				return;
			}
		} else if (isSecretFound || percentChance()) {
			System.out.println(
					"You can choose to:\n Type \"Parlor\" or 'N' to enter Parlor in the North \n Type \"SecretRoom\" or 'E' to enter Secret Room in the East");
			isSecretFound = true;
			ans = sc.nextLine();
			if (ans.equalsIgnoreCase("Parlor") || ans.equalsIgnoreCase("N")) {
				Parlor();
				return;
			} else {
				SecretRoom();
				return;
			}
		}
		System.out.println("Type \"Parlor\" or 'N' to enter Parlor in the North");
		sc.nextLine();
		Parlor();
	}

	public static void Parlor() {

		numbersOfRoomsVisited++;
		String ans;
		System.out.println("You are in Parlor, You see treasure Chest");
		if (hasLamp.equalsIgnoreCase("Parlor") && !gotLamp) {

			System.out.println(
					"You see a Lamp \n  Enter the vault in the West by typing \"Vault\" or 'W' \n You can go to Kitchen in South by typing \"Kitchen\" or 'S' \n You can get the lamp by typing \"Get Lamp\" ");
			ans = sc.nextLine();

			if (ans.equalsIgnoreCase("Get Lamp")) {
				gotLamp = true;
				System.out.println("You got the Lamp, Great! , you can see more details");
			}

			else if (ans.equalsIgnoreCase("Vault") || ans.equalsIgnoreCase("W")) {
				System.out.println(ans);
				Vault();
				return;
			} else if (ans.equalsIgnoreCase("Kitchen") || ans.equalsIgnoreCase("S")) {
				Kitchen();
				return;
			}
		}
		if ((gotLamp) && !movie) {
			System.out.println(
					"There is a portrait of your favorite movie star and tickets to their latest movie which you can take in case you ever get out of the house, type \"Movie\" to get them");

			ans = sc.nextLine();

			if (ans.equalsIgnoreCase("movie")) {
				movie = true;
			}
			System.out.println(
					"You see treasure Chest\n .You can choose :\n  Enter the vault in the West by typing\"Vault\" or 'W' \n You can go to Kitchen in South by typing \"Kitchen\" or 'S' ");
		}

		else
			System.out.println(
					"You can enter the vault in the West by typing\"Vault\" or 'W' \n Or go to Kitchen in South by typing \"Kitchen\" or 'S' ");
		ans = sc.nextLine();
		if (ans.equalsIgnoreCase("Vault") || ans.equalsIgnoreCase("W")) {
			Vault();
			return;
		} else if (ans.equalsIgnoreCase("Kitchen") || ans.equalsIgnoreCase("S")) {
			Kitchen();
		}

	}

	public static void SecretRoom() {
		numbersOfRoomsVisited++;
		String ans;
		System.out.println("You are in Secret Room");
		if (hasLamp.equalsIgnoreCase("SecretRoom") && !gotLamp) {
			if (!visited) {
				System.out.println(
						"You see Piles of Gold. Collect as much as you can and when you are ready..\n You can get the lamp by typing \"Get Lamp\" \n Enter 'W' or \"Vault\" To go back to the vault in the West");
				visited = true;
			} else
				System.out.println(
						"Well..you took everything you can. now can take the lamp or go back.. \n You can get the lamp by typing \"Get Lamp\" \n Enter 'W' or \"Vault\" To go back to the vault in the West");
			ans = sc.nextLine();

			if (ans.equalsIgnoreCase("Get Lamp")) {

				gotLamp = true;
				System.out.println("You got the Lamp, Great! , you can see more details");
			}

			else if (ans.equalsIgnoreCase("Vault") || ans.equalsIgnoreCase("W")) {
				Vault();
				return;
			}
		}
		if ((gotLamp) && !map) {
			System.out.println(
					"You see a map of the house along with the piles of gold. you may can take the map or gold or both.Type \"Map\"");
			ans = sc.nextLine();
			if (ans.equalsIgnoreCase("Map")) {
				map = true;
			}
		}
		if (!visited) {
			System.out.println(
					"You see Piles of Gold. Collect as much as you can and when you are ready..\n Enter 'W' or \"Vault\" To go back to the vault in the West");
			visited = true;
		} else
			System.out.println(
					"Well..you took everything you can. now what are you doing here? \n Enter 'W' or \"Vault\" To go back to the vault in the West");
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
		switch (new Random().nextInt(8)) {
		case 1:
			hasLamp = "Foyer";
			break;
		case 2:
			hasLamp = "FrontRoom";
			break;

		case 3:
			hasLamp = "Kitchen";
			break;

		case 4:
			hasLamp = "DiningRoom";
			break;

		case 5:
			hasLamp = "Library";
			break;

		case 6:
			hasLamp = "Vault";
			break;

		case 7:
			hasLamp = "Parlor";
			break;

		default:
			hasLamp = "SecretRoom";
			break;

		}
		Foyer();

		System.out.println("Number of rooms visited: " + numbersOfRoomsVisited);
		if (goldSilk) {
			System.out.println("You got gold coins from the Silk in the Foyer");
		}
		if (giftCard) {
			System.out.println("You got Amazon Gift Card");
		}

		if (movie) {
			System.out.println("You got your fav movie tickets and Potrait of your favorite movie Star");
		}

		if (map) {
			System.out.println("You got map of the house along with the gold piles");
		}

		if (pianoSong) {
			System.out.println("You played your fav song on the piano");
		}

		if (food) {
			System.out.println("You had cake and some coke");
		}

		if (percentChance())
			System.out.println("You are being followed by a GHOST!!!");
	}

}

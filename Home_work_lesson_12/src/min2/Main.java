/*
 * LOGOS It academy
 * */

package min2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author Vasyl
 * @since java 1.8
 * @version 1.2
 */

public class Main {
	/*This is Main method*/
	public static void main(String[] args) throws WrongInputConsoleParametersException {
		List<Months> months = Arrays.asList(Months.values());
		List<Seasons> seasons = Arrays.asList(Seasons.values());
		Scanner sc = new Scanner(System.in);

		while (true) {
			menu();

			switch (sc.next()) {
			
			/*to check if there is a month*/
			case "1": {
				System.out.println("Enter month");
				sc = new Scanner(System.in);
				String month = sc.next().toUpperCase();

				boolean flag = false;

				for (Months m : months) {
					if (m.name().equalsIgnoreCase(month)) {
						System.out.println("Month exist");
						flag = true;
					}
				}

				if (!flag) {
					System.out.println("Month doesnt exist");
					throw new WrongInputConsoleParametersException("Month does not exist");
				}
				break;
			}
			
			/*to print all the months with the same time of year*/
			case "2": {
				System.out.println("Enter Season");
				sc = new Scanner(System.in);
				String seasonSc = sc.next().toUpperCase();

				boolean flag = false;

				for (Months m : months) {
					if (m.getSeasons().name().equals(seasonSc)) {
						System.out.println(m);
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("Month doesnt exist");
					throw new WrongInputConsoleParametersException("Incorrect data entered");
				}
				break;
			}
			/*to print all months that have the same number of days*/
			case "3": {
				System.out.println("Enter the number of days per month");
				sc = new Scanner(System.in);
				int daySc = sc.nextInt();

				boolean flag = false;

				for (Months m : months) {
					if (m.getDays() == daySc) {
						System.out.println(m);
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("Month doesnt exist");
					throw new WrongInputConsoleParametersException("Incorrect data entered");

				}
				break;
			}
			
			/*to print all months that have fewer days*/
			case "4": {
				System.out.println("Enter the number of days per month");
				sc = new Scanner(System.in);
				int daySc = sc.nextInt();

				boolean flag = false;

				for (Months m : months) {
					if (m.getDays() < daySc) {
						System.out.println(m);
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("Month doesnt exist");
					throw new WrongInputConsoleParametersException("Incorrect data entered");
				}
				break;
			}
			
			/*to print all months that have more days*/
			case "5": {
				System.out.println("Enter the number of days per month");
				sc = new Scanner(System.in);
				int daySc = sc.nextInt();

				boolean flag = false;

				for (Months m : months) {
					if (m.getDays() > daySc) {
						System.out.println(m);
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("Month doesnt exist");
					throw new WrongInputConsoleParametersException("Incorrect data entered");
				}
				break;
			}
			
			/*to print next season*/
			case "6": {
				System.out.println("Enter season");
				sc = new Scanner(System.in);
				String seasonSc = sc.next().toUpperCase();

				boolean flag = false;

				for (Seasons s : seasons) {
					if (s.name().equals(seasonSc)) {
						flag = true;
					}
				}
				if (flag) {
					Seasons s = Seasons.valueOf(seasonSc);
					int ordinal = s.ordinal();

					if (ordinal == seasons.size() - 1) {
						ordinal = 0;
						System.out.println(seasons.get(ordinal));
					} else {
						System.out.println(seasons.get(ordinal + 1));
					}
				}
				if (!flag) {
					System.out.println("Season doesnt exist");
					throw new WrongInputConsoleParametersException("Incorrect data entered");
				}
				break;
			}
			
			/*to print previous season*/
			case "7": {
				System.out.println("Enter season");
				sc = new Scanner(System.in);
				String seasonSc = sc.next().toUpperCase();

				boolean flag = false;

				for (Seasons s : seasons) {
					if (s.name().equals(seasonSc)) {
						flag = true;
					}
				}
				if (flag) {
					Seasons s = Seasons.valueOf(seasonSc);
					int ordinal = s.ordinal();

					if (ordinal == 0) {
						ordinal = seasons.size() - 1;
						System.out.println(seasons.get(ordinal));
					} else {
						System.out.println(seasons.get(ordinal + 1));
					}
				}
				if (!flag) {
					System.out.println("Season doesnt exist");
					throw new WrongInputConsoleParametersException("Incorrect data entered");
				}
				break;
			}
			
			/*to print all months that have an even number of days*/
			case "8": {
				for (Months m : months) {
					if (m.getDays() % 2 == 0) {
						System.out.println(m);
					}
				}
				break;
			}
			
			/*to print all months that have an odd number of days*/
			case "9": {
				for (Months m : months) {
					if (m.getDays() % 2 == 1) {
						System.out.println(m);
					}
				}
				break;
			}
			
			/*to print the month entered from the console has an even number of days*/
			case "10": {
				System.out.println("Enter month");
				sc = new Scanner(System.in);
				String mSc = sc.next().toUpperCase();

				boolean flag = false;

				for (Months m : months) {
					if (m.name().equalsIgnoreCase(mSc)) {
						if (m.getDays() % 2 == 0) {
							System.out.println("The month has an even number of days");
							flag = true;
						} else {
							System.out.println("The month does not have an even number of days");
						}
					}
				}
				if (!flag) {
					System.out.println("Month does not exist");
					throw new WrongInputConsoleParametersException("Incorrect data entered");
				}
				break;
			}

			}
		}
	}

	/*This is menu of program*/
	static void menu() {
		System.out.println("Press 1 to check if there is a month");
		System.out.println("Press 2 to print all the months with the same time of year");
		System.out.println("Press 3 to print all months that have the same number of days");
		System.out.println("Press 4 to print all months that have fewer days");
		System.out.println("Press 5 to print all months that have more days");
		System.out.println("Press 6 to print next season");
		System.out.println("Press 7 to print previous season");
		System.out.println("Press 8 to print all months that have an even number of days");
		System.out.println("Press 9 to print all months that have an odd number of days");
		System.out.println("Press 10 to print the month entered from the console has an even number of days");
	}

}

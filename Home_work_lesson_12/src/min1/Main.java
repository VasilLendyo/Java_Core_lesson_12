package min1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Random rnd = new Random();
		List<String> material = new ArrayList<>();
		material.add("Leather");
		material.add("Alcantara");

		List<Auto> auto = new ArrayList<>();

			auto.add(new Auto(80 + rnd.nextInt(520), 1959 + rnd.nextInt(70),
					new Helm(20 + rnd.nextInt(50), material.get(rnd.nextInt(2))), new Engine(2 + rnd.nextInt(10))));

		while (true) {

			menu();
			switch (new Scanner(System.in).nextLine()) {

			case "a": {
				System.out.println(auto);
				break;
			}
			case "b": {
				auto.clear();
				auto.add(new Auto(120, 2001, new Helm(45, material.get(1)), new Engine(4)));
			}
				break;

			default: {
				System.out.println("Please, press \"a\" or \"b\"");
				break;
			}
			}
		}
	}

	static void menu() {
		System.out.println("Press \"a\" to print toString () of the array data in the console. (deepToString ())");
		System.out.println("Press \"b\" to set the same object of class Auto (fill ()) for all objects in this array");
	}
}

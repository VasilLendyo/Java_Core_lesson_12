package max;



public class Main {
	public static void main(String[] args) {

		Simple<String> strings = new MyArrayList<>();
		strings.add("first");
		strings.add("second");
		strings.add("third");

		for (String s : strings) {
			System.out.println(s);
		}
		System.out.println("-----------");
		strings.remove(1);

		for (String s : strings) {
			System.out.println(s);
		}

	}

}

package min1;

public class Auto {
	private int numberOfHorsepower;
	private int graduationYear;
	private Helm helm;
	private Engine engine;

	public Auto(int numberOfHorsepower, int graduationYear, Helm helm, Engine engine) {
		super();
		this.numberOfHorsepower = numberOfHorsepower;
		this.graduationYear = graduationYear;
		this.helm = helm;
		this.engine = engine;
	}

	public int getNumberOfHorsepower() {
		return numberOfHorsepower;
	}

	public int getGraduationYear() {
		return graduationYear;
	}

	public Helm getHelm() {
		return helm;
	}

	public Engine getEngine() {
		return engine;
	}

	@Override
	public String toString() {
		return "Auto [numberOfHorsepower=" + numberOfHorsepower + ", graduationYear=" + graduationYear + ", helm="
				+ helm + ", engine=" + engine + "]";
	}

}

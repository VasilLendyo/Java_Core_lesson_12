package min1;

public class Helm {
	private int WheelDiameter;
	private String material;

	public Helm(int wheelDiameter, String material) {
		super();
		this.WheelDiameter = wheelDiameter;
		this.material = material;
	}

	public int getWheelDiameter() {
		return WheelDiameter;
	}

	public void setWheelDiameter(int wheelDiameter) {
		WheelDiameter = wheelDiameter;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Helm [WheelDiameter=" + WheelDiameter + ", material=" + material + "]";
	}

}


public class StringManipulations {
	public static void main(String[] args) {

		StringBuilder sbf = new StringBuilder("navin");
		sbf.append(" Reddy");
		sbf.replace(0, 5, "Manoj");
		sbf.delete(8, 10);

		System.out.println(sbf);

	}

}

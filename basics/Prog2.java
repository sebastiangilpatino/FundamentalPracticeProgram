public class Prog2 {

	public static void main(String[] args) {
		float x = 1.27f, y = 3.881f, z = 9.6f;

		int sumInt = (int) (x + y + z);
		int sumRound = Math.round(x + y + z);

		System.out.println(sumInt);
		System.out.println(sumRound);

	}

}

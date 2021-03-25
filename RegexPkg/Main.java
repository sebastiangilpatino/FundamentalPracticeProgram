package RegexPkg;

public class Main {

	public static void main(String[] args) {
		String s1 = "1234567891011121314151617181920";
		s1 = s1.replaceAll("[8]", "eigth");
		System.out.println(s1);
	}

}

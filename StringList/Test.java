package StringList;

public class Test {

	public static void main(String[] args) {
		MyStringList myStringList = new MyStringList();
		myStringList.add("s");
		myStringList.add("e");
		myStringList.add("b");
		myStringList.add("a");
		myStringList.add("s");
		myStringList.add("t");
		myStringList.add("tan");
		myStringList.remove("t");
		System.out.println(myStringList.get(0));
		System.out.println(myStringList.find("e"));
		System.out.println(myStringList.find("x"));
		System.out.println("size: " + myStringList.size());
		System.out.println(myStringList.toString());
	}

}

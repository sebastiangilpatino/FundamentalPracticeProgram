package StringList;

public class MyStringList {
	private String[] strArray;

	public void add(String s) {
		if (strArray == null) {
			strArray = new String[1];
			strArray[0] = s;
		} else {
			String[] temp = new String[strArray.length + 1];
			System.arraycopy(strArray, 0, temp, 0, strArray.length);
			temp[temp.length - 1] = s;
			strArray = null;
			strArray = temp;
		}
	}

	public String get(int i) {
		if (i >= 0 && i < strArray.length) {
			return strArray[i];
		} else {
			return "bad index";
		}
	}

	public boolean find(String s) {
		int cont = 0;
		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i] == s) {
				cont++;
			}
		}

		if (cont == 0) {
			return false;
		} else {
			return true;
		}
	}

	public boolean remove(String s) {
		int countNull = 0;
		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i] == s) {
				strArray[i] = null;
				countNull++;
			}
		}

		if (countNull > 0) {
			String[] temp = new String[strArray.length - countNull];
			int index = 0;
			for (int i = 0; i < strArray.length; i++) {
				if (strArray[i] != null) {
					temp[index] = strArray[i];
					index++;
				}
			}
			strArray = null;
			strArray = temp;
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		String strOut = "";
		for (int i = 0; i < strArray.length; i++) {
			strOut += strArray[i];
		}
		return strOut;
	}

	public int size() {
		return strArray.length;
	}

}

package stringassignments;

public class StringBuilderReplace {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("It is used to_at the specified index position");

		String rStr = " insert text ";

		int i = str.indexOf("_");
		str.replace(i, i + 1, rStr);

		System.out.println(str);
	}

}

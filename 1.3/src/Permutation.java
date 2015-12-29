public class Permutation {

	public static void main(String[] args) {
		System.out.println(Permutation.findPermutation("hello","elloh"));

	}

	private static boolean findPermutation(String string, String string2) {
		
		return Permutation.sort(string).equals(Permutation.sort(string2));
	}
    private static  String sort(String s1) {
		char[] str=s1.toCharArray();
		java.util.Arrays.sort(str);
		return new String(str);
	}
}

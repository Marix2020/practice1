package morePractice;

public class PracticeTest01 {

	public static void main(String[] args) {

		int numFish = 4;
		String fishType = "tuna";
		String anotherFish = "numFish" + 1;

		System.out.println(anotherFish + " " + fishType);
		System.out.println(numFish + " " + 1);

		String s = "Hello";
		String t = new String(s);
		if ("Hello".equals(s))
			System.out.println("one");
		if (t == s)
			System.out.println("two");
		if (t.equals(s))
			System.out.println("three");
		if ("Hello" == s)
			System.out.println("four");
		if ("Hello" == t)
			System.out.println("five");

		StringBuilder sb = new StringBuilder();
		sb.append("aaa").insert(1, "bb").insert(4, "ccc");

		System.out.println(sb);

//		String s1 = "java";
//		StringBuilder s2 = new StringBuilder ("java");
//		if ( s1 == s2)  
//			System.out.print("1");
//		if (s1.equals(s2)) System.out.println("2");

		String letters = "abcdef";
		System.out.println(letters.length());
		System.out.println(letters.charAt(3));
		System.out.println(letters.charAt(5));

		String a = "rumble";
		StringBuilder b = new StringBuilder("rumble");
		b.append(4).deleteCharAt(3).delete(3, b.length() - 1);
		System.out.println(b);

	}

}

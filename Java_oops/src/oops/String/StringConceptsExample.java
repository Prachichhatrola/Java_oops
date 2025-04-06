package oops.String;

public class StringConceptsExample {
	public static void main(String[] args) {

		// 1. String Creation
		String str1 = "Hello"; // using literals (stored in string pool)
		String str2 = new String("World"); // using new keyword (stored in heap)

		// 2. String Concatenation
		String result = str1 + " " + str2;
		System.out.println("Concatenated: " + result);

		// 3. String Length
		System.out.println("Length: " + result.length());

		// 4. charAt()
		System.out.println("First char: " + result.charAt(0));

		// 5. substring()
		System.out.println("Substring (0-5): " + result.substring(0, 5));

		// 6. equals() and equalsIgnoreCase()
		String str3 = "hello";
		System.out.println("Equals: " + str1.equals(str3));
		System.out.println("EqualsIgnoreCase: " + str1.equalsIgnoreCase(str3));

		// 7. compareTo()
		System.out.println("Compare: " + str1.compareTo(str3));

		// 8. toUpperCase(), toLowerCase()
		System.out.println("Upper: " + str1.toUpperCase());
		System.out.println("Lower: " + str2.toLowerCase());

		// 9. trim()
		String messy = "   Trim me!   ";
		System.out.println("Before Trim: '" + messy + "'");
		System.out.println("After Trim: '" + messy.trim() + "'");

		// 10. replace()
		String replaced = result.replace("World", "Java");
		System.out.println("Replaced: " + replaced);

		// 11. contains()
		System.out.println("Contains 'Java'? " + replaced.contains("Java"));

		// 12. startsWith() and endsWith()
		System.out.println("Starts with Hello? " + replaced.startsWith("Hello"));
		System.out.println("Ends with Java? " + replaced.endsWith("Java"));

		// 13. indexOf() and lastIndexOf()
		System.out.println("Index of 'l': " + str1.indexOf('l'));
		System.out.println("Last Index of 'l': " + str1.lastIndexOf('l'));

		// 14. split()
		String sentence = "Java is fun";
		String[] words = sentence.split(" ");
		System.out.println("Words:");
		for (String word : words) {
			System.out.println(word);
		}

		// 15. isEmpty() and isBlank() (Java 11+)
		String emptyStr = "";
		String blankStr = "   ";
		System.out.println("isEmpty: " + emptyStr.isEmpty());
		System.out.println("isBlank: " + blankStr.isBlank());

		// 16. StringBuilder Example (mutable)
		StringBuilder sb = new StringBuilder("Hello");
		sb.append(" Java");
		sb.insert(0, "Welcome ");
		sb.replace(0, 7, "Hi");
		sb.delete(3, 5);
		System.out.println("StringBuilder: " + sb);

		// 17. StringBuffer Example (thread-safe)
		StringBuffer buffer = new StringBuffer("Thread");
		buffer.append(" Safe");
		System.out.println("StringBuffer: " + buffer);
	}
}

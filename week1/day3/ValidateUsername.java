package week1.day3;

public class ValidateUsername {

	public static void main(String[] args) {
		String s5=".@gmail.com";
		String s1="Balaji_1";
		String s2="Testleaf$123";
		String regex="[a-zA-Z][a-zA-Z_.@$0-9]{8,}";
		System.out.println(s1.matches(regex)?"True":"false");
		System.out.println(s2.matches(regex)?"True":"false");
		System.out.println(s5.matches(regex)?"True":"false");

	}

}

package week1.day3;

public class RegexQ1 {

	public static void main(String[] args) {
		String s1="balaji.chandrasekaran@testleaf.com";
		String s2="balaji.c@tunatap.co.uk";
		String s3="naveen e@tl.com";
		String s4="_.@gmail.com";
		String s5=".@gmail.com";
		String regex="[a-zA-Z][a-zA-Z_.]*@[[a-zA-Z]*.[a-zA-z]*]*";
		System.out.println(s1.matches(regex)?"True":"false");
		System.out.println(s2.matches(regex)?"True":"false");
		System.out.println(s3.matches(regex)?"True":"false");
		System.out.println(s4.matches(regex)?"True":"false");
		System.out.println(s5.matches(regex)?"True":"false");
		
		

	}

}

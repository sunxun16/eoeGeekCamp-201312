package Exerciseday04;

public class Exercise29 {
	/**
	 * 不用第三个变量，交换两个String类型的变量值.
	 */
	public static void main(String[] args) {
		String s1="abcd";
		String s2="efg";
		System.out.println("s1="+s1+"  s2="+s2);
		s1+=s2;//s1=abcdefg
		s2=s1.substring(0,s1.length()-s2.length());
		//s1=abcdefg s2=abcd
		s1=s1.substring(s2.length());
		System.out.println("s1="+s1+"  s2="+s2);
	}
}

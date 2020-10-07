package Level1;

public class Hide_Number {
	public static void main(String[] args) {
		String phone_number = "01033334444";
		String ans = solution(phone_number);
		System.out.println(ans);
	}

	private static String solution(String phone_number) {
		return "*".repeat(phone_number.length()-4) + phone_number.substring(phone_number.length()-4);
	}
}

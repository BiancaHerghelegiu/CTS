package seminar11_facade;

public class ANAF {

	public static boolean areDatorii(String CNP) {
		return (CNP.charAt(12)%2==0);
	}
}

package seminar11_facade;

public class Politie {

	public static boolean esteUrmarita(String CNP) {
		return (CNP.charAt(12)%2==0);
	}
}

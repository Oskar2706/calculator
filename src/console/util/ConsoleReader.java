package console.util;

import java.util.Scanner;

/**
 * @author Simon Pirko on 17.01.23
 */
public final class ConsoleReader {

	private static final Scanner SCANNER = new Scanner(System.in);

	public static String readString() {
		return SCANNER.next();
	}

	public static double readDouble() {
		return SCANNER.nextDouble();
	}

	public static int readInt() {
		return SCANNER.nextInt();
	}
}

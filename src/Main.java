import console.ConsoleApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Simon Pirko on ${DATE}
 */
public class Main {
	public static void main(String[] args) {
		ConsoleApplication consoleApplication = new ConsoleApplication();
		consoleApplication.run();
	}
}

//		List<Integer> list = new ArrayList<>();
//		for (int i = 0; i < 100; i++) {
//			list.add(i);
//		}

//		List<Integer> temp = new ArrayList<>();
//		for (Integer integer : list) {
//			if (integer % 2 == 0) {
//				temp.add(integer);
//			}
//		}

//		List<String> collect = list.stream()
//				.map(integer -> integer + 2)
//				.filter(integer -> integer % 2 == 0)
//				.map(integer -> String.valueOf(integer))
//				.collect(Collectors.toList());
//
//		System.out.println(collect);
//	}
//}

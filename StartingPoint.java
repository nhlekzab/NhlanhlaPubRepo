import java.io.ObjectInputStream.GetField;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartingPoint {

	public static void main(String[] args) {
		
//		Toyota t = new Toyota();
//		t.tireSize(1991, "Celica");	
//		t.setUpComputer();
//		t.tireSize(2003, "Polo");
		
//		LocalDate startDate = LocalDate.of(2015, 2, 20);
//		
//		System.out.println(startDate);
		
		List<String> stringsExample = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		List<String> filtered = stringsExample.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

		System.out.println(stringsExample);
		System.out.println(filtered);
		
	}

}

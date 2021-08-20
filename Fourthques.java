package ibm.Training;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Fourthques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=Arrays.asList("3","1","2","4","7");
		List<String> sortedList=list.stream().sorted().collect(Collectors.toList());
		sortedList.forEach(System.out::println);

	}

}

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streamer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//find distinct and sort them
		int[] a = {4,6,3,4,7,4,2,5,66,44,1,11,5};
		List<Integer>as = Arrays.stream(a).boxed().collect(Collectors.toList());
		as.stream().distinct().sorted().forEach(s->System.out.println(s));
	}
}

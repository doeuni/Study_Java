package setExample;
import java.util.*;

public class SetExample {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("one");
		set.add("second");
		set.add(new Integer(4));
		System.out.println(set);
	}

}

package oops_task1.task1;
import java.util.ArrayList;
import java.util.List;
public class StringCaseConverter {

	public static void main(String[] args) {
		
		List<String> strings = new ArrayList<>();
		strings.add ("hello");
		strings.add ("good");
		strings.add ("good");
		strings.add ("morning");
		
		List<String> UpperCaseString = new ArrayList<>();
		for(String str:strings) {
			UpperCaseString.add(str.toUpperCase());
		}
		List<String> LowerCaseString = new ArrayList<>();
		for(String str: strings) {
			LowerCaseString.add(str.toLowerCase());
		}
		{
	      System.out.println("Original List: " + strings);
	        System.out.println("Uppercase List: " + UpperCaseString);
	        System.out.println("Lowercase List: " + LowerCaseString);
	    }
		}

}

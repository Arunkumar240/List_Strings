package oops_task1.task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCaseLower {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Tutor", "Joes", "Education", "Computer");
		List<String> upr_str = strings.stream().map(str -> str.toUpperCase()).collect(Collectors.toList());
		List<String> lwr_str = strings.stream().map(str -> str.toLowerCase()).collect(Collectors.toList());
		System.out.println("THE UPPERCASE =" + upr_str);
		System.out.println("THE LOWERCASE =" + lwr_str);
	}
}

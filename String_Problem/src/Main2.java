import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the xml input");
		
		String xml = sc.nextLine();
		
		String pattern  = "\\{(.*?)\\}";
		
		Pattern p = Pattern.compile(pattern);
		Matcher match  = p.matcher(xml);
		
		System.out.format("%-15s %-15s\n","Tag Name","Length");
		String temp = "";
		while(match.find()){
			temp = xml.substring(match.start()+1,match.end()-1);
			if('/' != temp.charAt(0)){
				System.out.println(String.format("%-15s %-15s",temp, temp.length()));
			}
		}
	}

}

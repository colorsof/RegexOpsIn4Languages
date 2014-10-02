import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MatchRegex{
public static void main(String[] args){
	String str="var s = me am var";
	Pattern pattern = Pattern.compile("var");
	Matcher matcher =pattern.matcher(str);
		if (matcher.find()){
System.out.println("matches found are: "+matcher.group());}
	else System.out.println("no matches found: ");
	}

}

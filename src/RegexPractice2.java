import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] data = {"bat", "baby", "bonus", "c", "cA", "ca", "co", "c.", "c0", "c#", "car", "combat", "count", "date", "disc"};
		
		String[] pattern = {".*", "c[a-z]*", "c[a-z]", "c[a-zA-Z]", "c[a-zA-Z0-9]", "c.", "c.*", "c\\.", "c\\w", "c\\d", "c.*t", "[b|c].*",
				".*a.*", ".*a.+", "[b|c].{2}"};
		
		for(int i=0; i < pattern.length; i++) {
			Pattern p = Pattern.compile(pattern[i]);
			System.out.print("Pattern : " + pattern[i] + "result: ");
			for(int x=0; x < data.length; x++) {
				Matcher m = p.matcher(data[x]);
				if(m.matches())
					System.out.print(data[x] + ",");
			}
			System.out.println();
		}
	}

}

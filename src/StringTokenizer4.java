import java.util.StringTokenizer;

public class StringTokenizer4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String data = "100,,,200,300";
		
		String[] result = data.split(",");
		StringTokenizer st = new StringTokenizer(data, ",");
		
		for(int i=0; i < result.length; i++) {
			System.out.print(result[i] + "|");
		}
		System.out.println("����: " + result.length);
		
		int i=0;
		for(;st.hasMoreTokens();i++) {
			System.out.print(st.nextToken()+"|");
		}
		System.out.println("����: " + i);
	}

}

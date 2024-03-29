
public class RandomPractice3 {

	final static int RECORD_NUM = 10;
	final static String TABLE_NAME = "TEST_TABLE";
	final static String[] CODE1 = {"010", "011", "017", "018", "019"};
	final static String[] CODE2 = {"man", "woman"};
	final static String[] CODE3 = {"10s", "20s", "30s", "40s", "50s"};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0; i < RECORD_NUM; i++) {
			System.out.println(" INSERT INTO " + TABLE_NAME + " VALUES (" + " '" + getRandArr(CODE1) + "'" + ", '" + getRandArr(CODE2) + "'" + ", '" + getRandArr(CODE3) + 
					"'" + ", " + getRand(100, 200) + "); ");
		}
	}
	
	public static String getRandArr(String[] arr) {
		return arr[getRand(arr.length-1)];
	}
	
	public static int getRand(int n) {
		return getRand(0, n);
	}
	
	public static int getRand(int from, int to) {
		return (int)(Math.random() * (Math.abs(to-from)+1)) + Math.min(from, to);
	}

}

package javaTextbookVol2;
import java.util.*;
public class Iterator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList original = new ArrayList(10);
		ArrayList copy1 = new ArrayList(10);
		ArrayList copy2 = new ArrayList(10);
		
		for(int i=0; i < 10; i++) {
			original.add(i+"");
		}
		
		Iterator it = original.iterator();
		
		while(it.hasNext()) {
			copy1.add(it.next());
		}
		
		System.out.println("= Original에서 copy1로 복사 =");
		System.out.println("original:" + original);
		System.out.println("copy1:" + copy1);
		System.out.println();
		
		it = original.iterator();	//Iterator는 재상용이 안되므로 다시 얻어와야 한다.
		
		while(it.hasNext()) {
			copy2.add(it.next());
			it.remove();
		}
		
		System.out.println("= Original에서 copy2로 이동 =");
		System.out.println("original:" + original);
		System.out.println("copy2:" + copy2);
	}

}

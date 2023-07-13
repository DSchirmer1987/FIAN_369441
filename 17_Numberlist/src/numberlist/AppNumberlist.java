package numberlist;

import java.util.ArrayList;

import numberlist.model.NumberArrayList;
import numberlist.model.Numberlist;

public class AppNumberlist {

	public static void main(String[] args) {
		Numberlist nl = new Numberlist();
		nl.add(3);
		nl.add(4);
		nl.add(3);
		System.out.println(nl);
		nl.remove(2);
		System.out.println(nl);
		for (Number number : nl) {
			System.out.println(number);
		}

		System.out.println(Integer.MAX_VALUE);
		
		NumberArrayList nal = new NumberArrayList();
		nal.add(3);
		nal.add(4);
		System.out.println(nal);
	}

}

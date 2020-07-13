package 숙제.d20200713.김현배;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class NumAutoArray {

	List<Integer> arrayer(Set<Integer> set) {
		List<Integer> numList = new ArrayList<>();
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			numList.add(it.next());
		}
		List<Integer> tmpList = new ArrayList<>();
		for(int i=0;i<numList.size();i++) {
				tmpList.add(numList.get(i));
			for(int j=0;j<tmpList.size();j++) {
				if(tmpList.get(j)>tmpList.get(i)) {
					tmpList.remove(i);
					tmpList.add(j,numList.get(i));
				}
			}
		}
		return tmpList;

	}
	
}

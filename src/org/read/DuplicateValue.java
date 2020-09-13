
package org.read; 
import java.util.LinkedHashMap;
import java.util.Map. Entry; 
import java.util.Set;


public class DuplicateValue { 
	public static void main(String[] args) {
	 String s=" my name syed and my brother name syed and  "; 
	 LinkedHashMap<String, Integer>map=new LinkedHashMap<>(); 
	 String[] split = s.split(" "); 
	 for (String eachword : split) { 
		 if(map.containsKey( eachword)) { 
			 Integer count = map.get(eachword); map.put(eachword, count+1);
			 } 
		 else {
			 map.put(eachword, 1);
		 }
	 }
			 Set<Entry<String, Integer>> e = map.entrySet(); 
			 for (Entry<String, Integer> entry : e) {
				Integer value = entry.getValue();
		      if (value>1) {
		String key=entry.getKey();
		System.out.println(key+"occurred"+value+"times");
			 }

}
}
}
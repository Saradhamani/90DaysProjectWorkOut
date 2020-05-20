package week2.day3;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapLearning {

	public static void main(String[] args) {

		Map<String, Integer> sampleMap= new LinkedHashMap<String, Integer>();
		sampleMap.put("A", 1);
		sampleMap.put("B", 2);
		sampleMap.put("C", 3);
		sampleMap.put("D", 4);
		sampleMap.put("E", 5);
		
		System.out.println("Printing Map using Iterator over the EntrySet:");
		Iterator<Entry<String, Integer>>itr= sampleMap.entrySet().iterator();
		while(itr.hasNext()) {
			Entry<String, Integer> entry=itr.next();
			System.out.println(entry.getKey()+"->"+entry.getValue());
		}
		
		System.out.println("Printing Map using Lambda Expression over the Map:");
		sampleMap.forEach((key,value)->{
		System.out.println(key+"->"+value);}		
		);
		
		System.out.println("Printing Map using Lambda Expression over the KeySet");
		Set<String> keySet =  sampleMap.keySet();
		keySet.forEach((key)->{System.out.println(key+"->"+sampleMap.get(key));});
		
		System.out.println("Printing the Map using normal Foreach loop on the Keyset");
		for(String key:keySet) {
			System.out.println(key+"->"+sampleMap.get(key));
		}
		
		System.out.println("Printing the Map using the do while loop");
		int i=0;
		LinkedList<String> keyList=new LinkedList<String>(keySet);
		do {
			System.out.println(keyList.get(i)+"->"+sampleMap.get(keyList.get(i)));
			i++;
		}while(i<keyList.size());
		//ComputeIfPresent will set the value as 10 if Key is A
		sampleMap.computeIfPresent(("A"), (k,v)->v=10);

		System.out.println("Using Iterator's forEachRemaining method");
		sampleMap.entrySet().iterator().forEachRemaining(entry->{System.out.println(entry.getKey()+"->"+entry.getValue());});
	}

}

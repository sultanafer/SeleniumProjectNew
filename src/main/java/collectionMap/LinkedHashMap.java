package collectionMap;

import java.security.KeyStore.Entry;
import java.util.Map;

public class LinkedHashMap {

	public static void main(String[] args) {
	// Maintains order of put/insert
		
		Map<String, Integer> list=new LinkedHashMap<String, Integer>();
		list.put("Books", 123);
		list.put("Pens", 123);
		list.put("Pencil", 123);
		list.put("Notebook", 123);
		list.put("Papers", 123);
		list.put("Erazers", 123);
		list.put("Sherpners", 123);
		list.put("PostIts", 123);
		list.put("Binders", 123);
		list.put("Folders", 123);
		
		System.out.println(list.size());
        System.out.println(list.entrySet());
        
        for(Entry<String, Integer> eachlist:list.entrySet()) {
        	System.out.println(eachlist.getKey()+" "+eachlist.getValue());
        	
        	list.clear();
    		System.out.println(list.isEmpty());
    		System.out.println(list.size());
	}

}
}

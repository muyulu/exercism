import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class WordCount {
	
	public Map<String, Integer> phrase (String word) {
		
		if(word.startsWith("'"))
			word.replaceFirst("'", "\"");
		
		word = word.replace(" '", " \"");
		word = word.replace("' ", "\" ");
		word = word.replace("' ", "\" ");
		word = word.toLowerCase();
		word = word.trim();
		
		String[] array = word.split("[^\\w']+");
		
		Set<String> set = new HashSet(Arrays.asList(array));
		
		Map<String, Integer> map =  set.stream().collect(Collectors.toMap(x -> x,  x -> 0));
		
		int temp = 0;
		
		for(int i = 0; i < array.length; i++) {
			temp = map.get(array[i]);
			map.put(array[i], ++temp);
		}
		
		return map;
	}
	
}

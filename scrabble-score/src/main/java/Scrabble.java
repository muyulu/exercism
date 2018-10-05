import java.util.HashMap;
import java.util.Map;

final class Scrabble {

	private String word;
	private int result;
	private int i;
	
    Scrabble(String word) {
        this.word = word;
    }

    int getScore() {
    	
    	word = word.toUpperCase();
    	
    	Map<String, Integer> map = new HashMap<>();
	    	map.put("AEIOULNRST", 1);
	    	map.put("DG", 2);
	    	map.put("BCMP", 3);
	    	map.put("FHVWY", 4);
	    	map.put("K", 5);
	    	map.put("JX", 8);
	    	map.put("QZ", 10);
	    	
    	for(i = 0; i < word.length(); i++) {
    		map
			.entrySet()
		    .stream()
		    .filter(e -> e.getKey().contains(String.valueOf(word.charAt(i))))
		    .forEach(e -> {
		        result += e.getValue();
		    });
    	}
    	
    	return result;
    }
}

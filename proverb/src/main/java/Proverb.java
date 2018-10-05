class Proverb {

	String[] words;
	
    Proverb(String[] words) {
        this.words = words;
    }

    String recite() {
        
    	String recite = "";
    	String firstPart = "For want of a ";
    	String secondPart = " the ";
    	String thirdPart = " was lost.\n";
    	String fourthPart = "And all for the want of a ";
    	String fifthPart = ".";
    	
    		if(words.length == 0) return "";
    	
    	String firstWord = words[0];
    	
	    	if(words.length == 1) return fourthPart + firstWord + fifthPart;
	    	
	    	for(int i = 0; i < words.length - 1; i++)
	    		recite += firstPart + words[i] + secondPart + words[i + 1] + thirdPart;
	    		
	    		recite += fourthPart + firstWord + fifthPart;
        
        return recite;
        
    }

}

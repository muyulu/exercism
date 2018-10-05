class ReverseString {

    String reverse(String inputString) {
        
    	char[] charReversed = new char[inputString.length()];
    	String reversed = null;
    	int j = 0;
    	
    	if(inputString.isEmpty()) return "";
    	
    	for(int i = inputString.length() - 1; i >= 0; i--) {
    		
    		charReversed[j++] = inputString.charAt(i);
    		
    	}
    	
    	reversed = String.valueOf(charReversed);
    	
    	return reversed;
    }
  
}
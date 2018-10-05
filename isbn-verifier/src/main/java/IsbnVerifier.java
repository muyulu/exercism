class IsbnVerifier {

    boolean isValid(String stringToVerify) {
    	
    	stringToVerify = stringToVerify.replace("-", "");
    	
    	if(!(stringToVerify.length() == 10)) return false;
    	
    	stringToVerify = stringToVerify.replace("X", "10");
    	
    	
    	try {
    		if(isbnCheck(Long.parseLong(stringToVerify)) == 0) return true;
    	}catch(NumberFormatException e) {
    		return false;
    	}
    	
    	return false;
    }
    
    private int isbnCheck(long isbn) {
    	int result = 0;
    	for(int i = 1; i <= 10; i++) {
    		if(String.valueOf(isbn).length() == 11 && i == 1) {
    			result += 10;
    			isbn /= 100;
    		}else {
        		result += ((isbn % 10) * i);
        		isbn /= 10;
    		}
    	}
    	
    	return result % 11;
    }

}

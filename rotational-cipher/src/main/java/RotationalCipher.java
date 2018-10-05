final class RotationalCipher {
	
	private int shiftKey;
	
    RotationalCipher(int shiftKey) {
        this.shiftKey = shiftKey;
    }

    String rotate(String data) {
    	
    	String result = "";
    	
    	for(int i = 0; i < data.length(); i++) {
    		if(Character.isAlphabetic(data.charAt(i))) {
    			if(Character.isLowerCase(data.charAt(i)))
        			result = result + ( char ) ( ( data.charAt(i) + shiftKey - 'a' ) % 26 + 'a' );
        		else
        			result = result + ( char ) ( ( data.charAt(i) + shiftKey - 'A' ) % 26 + 'A' );
    		}else 
    			result = result + data.charAt(i);
    	}
        
        return result;
    }

}

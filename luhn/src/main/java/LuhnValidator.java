class LuhnValidator {

    boolean isValid(String candidate) {
        
    	String regex = "\\d+";
    	
    	candidate = candidate.replace(" ", "");
    	
    	if(candidate.matches(regex) && candidate.length() > 1) {
    		
    		int tmp = 0;
    		int length = candidate.length();
    		int intAtChar = 0;
    		
    		for(int i = length - 1; i >= 0; i--) {
    			intAtChar = Character.getNumericValue(candidate.charAt(i));
    			
    			if(length % 2 == 0) {
    				
    				if(i % 2 == 0) {
    					
    					if((intAtChar * 2) >= 9) 
    						tmp += ((intAtChar * 2) - 9);
    					else 
    						tmp += ((intAtChar * 2));
    					
    				}else 
    					tmp += intAtChar;
    				
    			}else {
    				
    				if(i % 2 != 0) {
    					
    					if((intAtChar * 2) >= 9) 
    						tmp += ((intAtChar * 2) - 9);
    					else 
    						tmp += ((intAtChar * 2));
    					
    				}else 
    					tmp += intAtChar;
    				
    			}
    			
    		}
    		
    		if(tmp % 10 == 0) return true;
    		
    	}
    	
    	return false;
    }

}

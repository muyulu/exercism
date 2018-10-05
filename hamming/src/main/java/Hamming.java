final class Hamming {
	
	private String leftStrand;
	private String rightStrand;
	
    Hamming(String leftStrand, String rightStrand) {
    	if(leftStrand.length() != rightStrand.length()) {
    		throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
    	}
    	
    	this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
    }

    int getHammingDistance() {
        
    	int hammingDistance = 0;
    	int endOfChain = leftStrand.length();
    	
		for(int i = 0; i < endOfChain; i++)
			if(leftStrand.charAt(i) != rightStrand.charAt(i))
				hammingDistance++;
    	
    	return hammingDistance;
    	
    }

}

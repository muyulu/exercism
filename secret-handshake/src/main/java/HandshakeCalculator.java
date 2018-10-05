import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        
    	List<Signal> handShake = new ArrayList<>();
    	
    	int binary = Integer.parseInt(Integer.toBinaryString(number));
        int length = Integer.parseInt(String.valueOf(binary));
        
    	if(binary % 10 == 1) 
    		handShake.add(Signal.WINK);
    	
    	if(length > 1) {
    		binary /= 10;
        	if(binary % 10 == 1) 
        		handShake.add(Signal.DOUBLE_BLINK);
    	}
    	
    	if(length > 2) {
    		binary /= 10;
        	if(binary % 10 == 1) 
        		handShake.add(Signal.CLOSE_YOUR_EYES);
    	}
    	
    	if(length > 3) {
    		binary /= 10;
        	if(binary % 10 == 1) 
        		handShake.add(Signal.JUMP);
    	}
    	
    	if(length > 4) {
    		binary /= 10;
    		if(binary % 10 == 1)
    			Collections.reverse(handShake);
    	}
        
        return handShake;
    }

}

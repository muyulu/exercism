import java.util.ArrayList;
import java.util.List;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {
        
    	String Methionine = "Methionine";
    	String Phenylalanine = "Phenylalanine";
    	String Leucine = "Leucine";
    	String Serine = "Serine";
    	String Tyrosine = "Tyrosine";
    	String Cysteine = "Cysteine";
    	String Tryptophan = "Tryptophan";
    	
    	String AUG = "AUG"; //Methionine
    	String UUU = "UUU"; //Phenylalanine
    	String UUC = "UUC"; //Phenylalanine
    	String UUA = "UUA"; //Leucine
    	String UUG = "UUG"; //Leucine
    	String UCU = "UCU"; //Serine
    	String UCC = "UCC"; //Serine
    	String UCA = "UCA"; //Serine
    	String UCG = "UCG"; //Serine
    	String UAU = "UAU"; //Tyrosine
    	String UAC = "UAC"; //Tyrosine
    	String UGU = "UGU"; //Cysteine
    	String UGC = "UGC"; //Cysteine
    	String UGG = "UGG"; //Tryptophan
    	String UAA = "UAA"; //STOP
    	String UAG = "UAG"; //STOP
    	String UGA = "UGA"; //STOP
    	
    	String temp = "";
    	
    	List<String> translated = new ArrayList<>();
    	
    	int i = 0;
    	while(i < rnaSequence.length()) {
    		
    		temp = rnaSequence.substring(i, i + 3);
    		
    		if(temp.equals(AUG))
    			translated.add(Methionine);
    		
    		if(temp.equals(UUU) || temp.equals(UUC))
    			translated.add(Phenylalanine);
    		
    		if(temp.equals(UUA) || temp.equals(UUG))
    			translated.add(Leucine);
    		
    		if(temp.equals(UCU) || temp.equals(UCC) || temp.equals(UCA) || temp.equals(UCG))
    			translated.add(Serine);
    		
    		if(temp.equals(UAU) || temp.equals(UAC))
    			translated.add(Tyrosine);
    		
    		if(temp.equals(UGU) || temp.equals(UGC))
    			translated.add(Cysteine);
    		
    		if(temp.equals(UGG))
    			translated.add(Tryptophan);
    		
    		if(temp.equals(UAA) || temp.equals(UAG) || temp.equals(UGA))
    			return translated;
    		
    		i += 3;
    		
    	}
    	
    	return translated;
    	
    }
}
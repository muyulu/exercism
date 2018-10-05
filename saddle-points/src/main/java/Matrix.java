import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.sun.org.apache.bcel.internal.generic.ISHL;

class Matrix {
	
	private final List<List<Integer>> values;
	
    Matrix(List<List<Integer>> values) {
        this.values = values;
    }

    public Set<MatrixCoordinate> getSaddlePoints() {
    	
    	Set<MatrixCoordinate> saddlePoints = new HashSet();
    	
    	for(int i = 0; i < values.size(); i++) {
    		for(int j = 0; j < values.get(i).size(); j++) 
    			if(isGERow(i, j) && isLEColumn(i, j))
    				saddlePoints.add(new MatrixCoordinate(i, j));
    	}
    	
    	return saddlePoints;
    	
    }
    
    private boolean isGERow(int row, int column) {
    	
    	int temp = values.get(row).get(column);
    	
    	for(int i = 0; i < values.get(row).size(); i++) {
    		if(temp < values.get(row).get(i))
    			return false;
    	}
    	
    	return true;
    }
    
    private boolean isLEColumn(int row, int column) {
    	
    	int temp = values.get(row).get(column);
    	
    	for(int i = 0; i < values.size(); i++) {
    		if(values.get(i).get(column) < temp)
    			return false;
    	}
    	
    	return true;
    }
    
}

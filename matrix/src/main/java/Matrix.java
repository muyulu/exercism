import java.util.stream.Stream;

final class Matrix {

	private String matrixAsString;
	
    Matrix(String matrixAsString) {
        
    	this.matrixAsString = matrixAsString;
    	
    }

    int[] getRow(int rowNumber) {
        
    	
    	String[] split = matrixAsString.split("\n");
    	int[] result = Stream.of(split[rowNumber].split(" ")).mapToInt(Integer::parseInt).toArray();
    	
    	return result;
    }

    int[] getColumn(int columnNumber) {
    	
    	int numsPerRow = 1;
    	
    	if(matrixAsString.indexOf("\n") > -1)
    		numsPerRow = (int)matrixAsString.substring(0, matrixAsString.indexOf("\n")).codePoints().filter(ch -> ch == ' ').count() + 1;
    	
    	int totalNums = (int)matrixAsString.replace("\n", " ").codePoints().filter(ch -> ch == ' ').count() + 1;
    	
    	int[] result = new int[totalNums / numsPerRow];
    	int i = columnNumber;
    	int j = 0;
    	
    	matrixAsString = matrixAsString.replace("\n", " ");
    	
    	String[] matrixArray = matrixAsString.split(" ");
    	
    	while(i < totalNums) {
    		
    		result[j++] = Integer.parseInt(matrixArray[i]);
    		
    		i += numsPerRow;
    		
    	}
    	
    	return result;
    }
}

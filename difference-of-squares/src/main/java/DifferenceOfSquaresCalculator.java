final class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        
    	int sum = input * (input + 1) / 2;
    	
    	return sum * sum;
    	
    }

    int computeSumOfSquaresTo(int input) {
    	
    	float inputToFloat = (float)input;
        
    	return (int)Math.round((inputToFloat / 6 * (inputToFloat + 1) * (2 * inputToFloat + 1)));
    	
    }

    int computeDifferenceOfSquares(int input) {
        
    	return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    	
    }

}

class RaindropConverter {

    String convert(int number) {
        
    	String convert = "";
    	
    	String Pling = "Pling";
    	String Plang = "Plang";
    	String Plong = "Plong";
    	
    	if(number % 3 == 0) convert = Pling;
    	if(number % 5 == 0) convert += Plang;
    	if(number % 7 == 0) convert += Plong;
    	
    	if(convert.isEmpty()) convert = Integer.toString(number);
    	
    	return convert;
    	
    }

}

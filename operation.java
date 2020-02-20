package Icalculator;

public class operation implements ICalculator{
	 public int x;
	 public int y;
	    @Override
	    public int add(int x, int y) {
	        return x+y;
	    }

	    @Override
	    public float divide(int x, int y) throws RuntimeException{
	        if(y==0){
	            throw new RuntimeException("can not divide by zero");
	   
	        }
	        else 
	        {
	        	return (float)x/y;
	        }
	    }

}


public class Multiplier implements Runnable {
	private static int[][] first; 
	private static int[][] second; 
	static int[][] result;
	
	private int row; 
	private int column; 
	
	public Multiplier(int[][] first, int[][] second, int[][] result, int i, int j) {
	//Constructor 
	//row of the first matrix, 
	// column of the second matrix 
	this.result = result;
	this.first = first; 
	this.second = second;
	// row variation for first matrix
	this.row = i; 
	// column variation for second matrix 
	this.column  = j; 
	}
	
	public void multiply() {
		int sum = 0;
		
		for (int k = 0; k< first[0].length; k++) {
			
			sum+= first[row][k]*second[k][column]; 
			
			
		}
		result[row][column] = sum;
		

		
		
	}
	
	
	public int[][] getResult() {
        return this.result;
    }
	
		

	@Override 

	public void run() {
	//
		multiply(); 
		System.out.println("new thread");
		

	}


}


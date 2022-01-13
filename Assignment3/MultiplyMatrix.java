import java.util.Scanner;

public class MultiplyMatrix {
	// store the  three operands as static variables 
	  static int [][] first; 
	  static int [][] second; 
	  static int firstRow; 
	  static int firstCol; 
	  static int secondRow; 
	  static int secondCol; 
	  int [][] result;
	  // Function to read matrix
	  public static int[][] readMatrixByUser()
	  {
	      int m, n;
	      Scanner in = null;

	          in = new Scanner(System.in);
	          System.out.println("Enter the number "
	                             + "of rows of the  matrix");
	          m = in.nextInt();
	          System.out.println("Enter the number "
	                             + "of columns of the  matrix");
	          n = in.nextInt();

	          // Declare the matrix
	          int first[][] = new int[m][n];

	          // Read the matrix values
	          System.out.println("Enter the elements of the matrix");
	          for (int i = 0; i < m; i++)
	              for (int j = 0; j < n; j++)
	                  first[i][j] = in.nextInt();

	          // Display the elements of the matrix
	          System.out.println("Elements of the matrix are");
	          for (int i = 0; i < m; i++) {
	              for (int j = 0; j < n; j++)
	                  System.out.print(first[i][j] + "  ");
	              System.out.println();
	          }
	          

	      

	      
	      return first;
	  }

	  // Driver code
	  public static void main(String[] args)
	  {
	      int[][] first = readMatrixByUser();
	      int[][] second = readMatrixByUser(); 
	      
	
	      if(first[0].length!=second.length) {
	    	  // if the number of columns in the first matrix ! = number of rows in the second matrix 
			  System.out.println("The matrices are not commutable. Multiplication is not possible"); 
			  System.exit(-1);
		  }

	      int[][] result = new int[first.length][second[0].length];
	      
	      for (int i = 0; i < first.length; i++) { //vary rows in the first matrix 
	            for (int j = 0; j < second[0].length; j++) { // vary columns in the second matrix 
	                Multiplier mult  = new Multiplier(first, second, result, i, j);
	                Thread myThr = new Thread(mult);
	                
	                myThr.start();
	                //System.out.print(result[i][j] + "  ");
	                try { myThr.join(); } // wait until runnerOne terminates
	                catch(InterruptedException ie) {}

	                
	                
	            }
	      
	      }
	      
	     
	      System.out.println("Resulting matrix");
          for (int i = 0; i < result.length; i++) {
              for (int j = 0; j < result[0].length; j++) {
            	  
                  System.out.print(result[i][j] + "  ");
                  System.out.println();
              }
          }
          
          System.out.println("The resulting matrix has " + result.length  + "rows and " + result[0].length + "columns");
	  }
	  
	  // size of the resultant matrix 


}


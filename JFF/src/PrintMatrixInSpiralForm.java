
public class PrintMatrixInSpiralForm {
	public static void main(String[] args) {
		  new PrintMatrixInSpiralForm();
		  
		 }
		 
		 public  PrintMatrixInSpiralForm() {
		  int[][] matrix = {
				  {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				  {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				  {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				  {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				  {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				  {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				  {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				  {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				  {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				  {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				  {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				  {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				  {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				  {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				  {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				  {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				  {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				  {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				  {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};
		   
		  recursiveSpiral(matrix,0,0,matrix[0].length-1,matrix.length-1);
		  for (int i = 0; i < matrix.length; i++) {
			    for (int j = 0; j < matrix[i].length; j++) {
			        System.out.print(matrix[i][j] + " ");
			    }
			    System.out.println();
			}
		 }
		  
		 private void recursiveSpiral(int[][] matrix, int x, int y, int colLength,  int rowLength){
			 System.out.println(x +" "+y+" "+colLength+" "+rowLength);
			 matrix[x][y] = 5;
			 x += 1;
			 y += 1; 
			 colLength -= 1;
			 rowLength -= 1;
			 for (int i = x; i <= colLength; i++) {
				 //System.out.print(matrix[rowStart][i] + "a ");
				 matrix[x][i] = 2;
			 }
			 for (int i = x+1; i <= rowLength; i++) {
				 //System.out.print(" \n " + matrix[i][colLength] + "b");
				 matrix[i][colLength] = 3;
			 }
		   
			 if(x+1 <= rowLength){
				 for (int i = colLength-1; i >= y; i--) {
					 //System.out.print(matrix[rowLength][i] + "c ");
					 matrix[rowLength][i] = 4;
				 } 
			 }
		   
			 if(y+1 <= colLength){
				 for (int i = rowLength-1; i > x; i--) {
					 //System.out.print(" \n " + matrix[i][colStart] + "d");
					 matrix[i][y] = 5;
				 }
			 }
		   
			 if(x+1 <= rowLength-1 && y+1 <= colLength-1){
				 recursiveSpiral(matrix, x+1, y+1, colLength-1, rowLength-1);
			 }
		 }
}


public class SetZero {

	public static void main(String[] args) {
		
	}
	
	public void matrixZero(int[][] matrix)
	{
		boolean[] row=new boolean[matrix.length];
		boolean[] col=new boolean[matrix[0].length];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if(matrix[i][j]==0)
				{
					row[i]=true;
					col[j]=true;
				}
			}
		}
		
		for (int i = 0; i < row.length; i++) {
			if(row[i]) setZeroRow(matrix,i);
		}
		
		for (int i = 0; i < col.length; i++) {
			if(col[i]) setZeroCol(matrix,i);
		}
		
	}

	private void setZeroCol(int[][] matrix, int i) {
		for (int j = 0; j < matrix.length; j++) {
			matrix[j][i]=0;
		}
	}

	private void setZeroRow(int[][] matrix, int i) {
		for (int j = 0; j < matrix[0].length; j++) {
			matrix[i][j]=0;
		}
	}

}

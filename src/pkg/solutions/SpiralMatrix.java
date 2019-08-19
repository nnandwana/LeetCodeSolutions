package pkg.solutions;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
	
//    1    2   3   4
//    5    6   7   8
//    9   10  11  12
//    13  14  15  16
//	  17  18  19  20
	
	//o/p : 1 2 3 4 8 12 16 20 19 18 17 13 9 5 6 7 11 15 14 10  
	public List<Integer> spiralMatrix(int matrix[] []) {
		List <Integer> l = new ArrayList<Integer>();
		int i, rowJ=0,colK=0;
		int row= matrix.length;
		int col = matrix[0].length;
		while(rowJ<row && colK<col) {
		for (i=colK;i<col;i++) {
			l.add(matrix[rowJ][i]);
		}
		rowJ++;
		for(i=rowJ;i<row;i++) {
			l.add(matrix[i][col-1]);
		}
		col--;
		
		for(i=col-1;i>=colK;i--) {
		l.add(matrix[row-1][i]);
		}
		row--;
		
		for(i=row-1;i>=rowJ;i--) {
			l.add(matrix[i][colK]);
		}
		colK++;
		}
		return l;
		
		
	}
	public static void main(String args[]) {
		SpiralMatrix s = new SpiralMatrix();
		List <Integer> l;
		int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
		l=s.spiralMatrix(arr);
		System.out.println("List returned " +l);
	}

}

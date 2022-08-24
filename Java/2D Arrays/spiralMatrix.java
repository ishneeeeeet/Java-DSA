
public class spiralMatrix {

public static void printSpiral(int matrix[][]){

    int startRow = 0;
    int startCol = 0;
    int endRow = matrix.length-1;
    int endCol = matrix[0].length-1;
     

    while (startRow <= endRow && startCol <= endCol) {
        // Top
        for(int j = startCol; j<=endCol; j++) {
           System.out.println(matrix[startRow][j]); 
        }

        // Right
        for(int i = startRow+1; i <= endRow; i++ ) {
            System.out.println(matrix[i][endCol]);
        }
        // bottom 
        for(int k = endCol-1; k >=startCol; k--) {
            System.out.println(matrix[endRow][k]);
        }

        // left from bottom to top
        
        for(int h = endRow-1; h >= startRow+1; h--) {
            System.out.println(matrix[h][startCol]);
        }
        startCol++;
        startRow++;
        endCol--;
        endRow--;
    }
    
    System.out.println();
}

    public static void main(String args[]) {

        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        printSpiral(matrix);
    }
}

inverseublic double[][] inverse3x3(int[][] matrix) {
    double det = det3x3(matrix);

    // Throw an expection if det is zero
    if (det == 0) {
        throw new ArithmeticException("Matrix is singular and cannot be inverted.");
    }

    // Calculate inverse
    double[][] inverse = new double[3][3];
    inverse[0][0] = (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) / det;
    inverse[0][1] = (matrix[0][2] * matrix[2][1] - matrix[0][1] * matrix[2][2]) / det;
    inverse[0][2] = (matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1]) / det;
    inverse[1][0] = (matrix[1][2] * matrix[2][0] - matrix[1][0] * matrix[2][2]) / det;
    inverse[1][1] = (matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0]) / det;
    inverse[1][2] = (matrix[0][2] * matrix[1][0] - matrix[0][0] * matrix[1][2]) / det;
    inverse[2][0] = (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]) / det;
    inverse[2][1] = (matrix[0][1] * matrix[2][0] - matrix[0][0] * matrix[2][1]) / det;
    inverse[2][2] = (matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0]) / det;
    return inverse;
}

// Create a method to display a matrix
public void printMatrix(int[][] matrix) {
    // Print the matrices
    for (int[] row : matrix) {
        for (int val : row) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}

// Create a method to display a double matrix (for inverses)
public void printInverseMatrix(double[][] matrix) {
    for (double[] row : matrix) {
        for (double val : row) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}

public static void main(String[] args) {

    // Create an object CalculatorForMatrix class
    CalculatorForMatrix getResult = new CalculatorForMatrix();

    // Create two 2D array matrix1 and matrix2
    int[][] matrix1 = getResult.createRandomMatrix(2, 2);
    int[][] matrix2 = getResult.createRandomMatrix(2, 2);

    // Print the matrix
    System.out.println("Matrix 1:");
    getResult.printMatrix(matrix1);
    System.out.println("Matrix 2:");
    getResult.printMatrix(matrix2);

    // Print the result of Addition and call a method
    System.out.println("Addition of Matrices:");
    getResult.printMatrix(getResult.additionMatrices(matrix1, matrix2));

    // Print the result of Subtraction and call a method
    System.out.println("Subtraction of Matrices:");
    getResult.printMatrix(getResult.subtractMatrices(matrix1, matrix2));

    // Print the result of Multiplication and call a method
    System.out.println("Multiplication of Matrices:");
    getResult.printMatrix(getResult.multiplicationMatrices(matrix1, matrix2));

    // Print the result of Transpose and call a method
    System.out.println("Transpose of Matrix 1:");
    getResult.printMatrix(getResult.transposeMatrix(matrix1));

    // Print the result of det and call a method
    System.out.println("det of Matrix 1:");
    System.out.println(getResult.det2x2(matrix1));

    // Print the result of Inverse and call a method
    System.out.println("Inverse of Matrix 1:");
    getResult.printInverseMatrix(getResult.inverse2x2(matrix1));

}

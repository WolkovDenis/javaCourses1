package lesson9Matrix;

public class Main1 {
    public static void main(String[] args) {

        double[][] forMatrix1 = {{3, 6, 4},
                {4, 7, 3},
                {4, 3, 4},
                {2, 6, 1},};
        double[][] forMatrix2 = {{6, 1, 4},
                {3, 5, 8},
                {8, 3, 5},
                {6, 2, 1},};
        Matrix matrix1= new Matrix(forMatrix1);
        Matrix matrix2= new Matrix(forMatrix2);

        IMatrix matrixAdd = matrix1.add(matrix2);
        try {
            matrixAdd.add(matrixAdd);
        } catch (Exception e) {
            e.printStackTrace();
        }

        IMatrix matrixSub = matrix1.sub(matrix2);
        try {
            matrixSub.add(matrixSub);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


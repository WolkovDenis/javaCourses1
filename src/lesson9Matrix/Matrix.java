package lesson9Matrix;

public class Matrix implements IMatrix {

    private double[][] numbers;


    public Matrix(int rows, int cols) {
        numbers = new double[rows][cols];
    }

    public Matrix(double[][] numbers) {
        this.numbers = numbers;
    }

    @Override
    public int getRows() {
        return numbers.length;
    }

    @Override
    public int getColumns() {
        return numbers[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        if (this.getRows() <= rowIndex) {
            throw new IndexOutOfBoundsException("У нас нет такого кол-ва строк!!!");
        }
        if (this.getColumns() <= colIndex) {
            throw new IndexOutOfBoundsException("У нас нет такого кол-ва колонок!!!");
        }
        return this.numbers[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        if (this.getRows() <= rowIndex) {
            throw new IndexOutOfBoundsException("У нас нет такого кол-ва строк!!!");
        }
        if (this.getColumns() <= colIndex) {
            throw new IndexOutOfBoundsException("У нас нет такого кол-ва колонок!!!");
        }
        this.numbers[rowIndex][colIndex] = value;
    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        // this-> matrix1
        //otherMatrix-> matrix2

        if (this.getRows() != otherMatrix.getRows()) {
            throw new IllegalArgumentException("Не совместимое кол-во строк");
        }
        if (this.getColumns() != otherMatrix.getColumns()) {
            throw new IllegalArgumentException("Не совместимое кол-во столбцов");
        }
        if (otherMatrix == null) {
            throw new NullPointerException("Вторая матрица Null");
        }
        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) + otherMatrix.getValueAt(i, j));
            }
        }
        return result;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getRows() != otherMatrix.getRows()) {
            throw new IllegalArgumentException("Не совместимое кол-во строк");
        }
        if (this.getColumns() != otherMatrix.getColumns()) {
            throw new IllegalArgumentException("Не совместимое кол-во столбцов");
        }
        if (otherMatrix == null) {
            throw new NullPointerException("Вторая матрица Null");
        }
        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) - otherMatrix.getValueAt(i, j));
            }
        }
        return result;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getColumns() != otherMatrix.getRows()) {
            throw new IllegalArgumentException("Матрицы умножать нельзя!Кол-во столбцов первой матрицы не равно кол-ву строк второй матрицы");
        }
        if (this.getRows() != otherMatrix.getColumns()) {
            throw new IllegalArgumentException("Матрицы умножать нельзя!Кол-во строк первой матрицы не равно кол-ву столбцов второй матрицы");
        }
        if (otherMatrix == null) {
            throw new NullPointerException("Вторая матрица не должна быть null");
        }
        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                for (int k = 0; k < otherMatrix.getColumns(); k++) {
                    result.setValueAt(i, j, this.getValueAt(i, k) * otherMatrix.getValueAt(j, k));
                }
            }
        }
        return result;
    }

    @Override
    public IMatrix mul(double value) {
        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                result.setValueAt(i, j, getValueAt(i, j) * value);
            }
        }
        return result;
    }

    @Override
    public IMatrix transpose() {
        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                result.setValueAt(i, j, getValueAt(i, j));
            }
        }
        System.out.println();
        for (int i = 0; i < this.getColumns(); i++) {
            for (int j = 0; j < this.getRows(); j++) {
                result.setValueAt(i, j, getValueAt(j, i));
            }
        }
        return result;
    }

    @Override
    public IMatrix fillMatrix(double value) {
        Matrix result = new Matrix(getRows(), getColumns());
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                result.setValueAt(i, j, value);
            }
        }
        return result;
    }

    @Override
    public double determinant() {
        return 0;
    }

    @Override
    public boolean isNullMatrix() {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                if (this.numbers[i][j] != 0) {
                    System.out.println("Матрица не является нулевой!");
                    return false;
                } else {
                    System.out.println("Матрица является нулевой!");
                    return true;
                }
            }
        }
        return true;
    }

    @Override
    public boolean isIdentityMatrix() {
        if (this.getRows() != this.getColumns()) {
            System.out.println("Матрица должна быть квадратной!");
            return false;
        }
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                if (i == j && this.numbers[i][j] != 1) {
                    System.out.println("Матрица не является единичной!");
                    return false;
                } else {
                    if(numbers[i][j] != 0){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override
    public boolean isSquareMatrix() {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                if (this.getRows() == this.getColumns()) {
                    System.out.println("Матрица является квадратной!");
                    return true;
                } else {
                    System.out.println("Матрица не является квадратной!");
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void printToConsole() {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < getColumns(); j++) {
                System.out.print(this.getValueAt(i, j) + " ");
            }
            System.out.println();
        }
    }
}

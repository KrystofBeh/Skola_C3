public class Matrix implements IMatrix{

    private double[][] matrix;

    public Matrix(double[][] matrix) {
        this.matrix = matrix;
    }

    @Override
    public IMatrix times(IMatrix matrix) {
        double[][] matTimes = new double[this.getRows()][matrix.getColumns()];

        for (int i=0; i<this.getRows(); i++) {
            for (int j = 0; j < matrix.getColumns(); j++) {
                for (int k = 0; k < this.getColumns(); ++k) {
                    matTimes[i][j] += this.matrix[i][k] * matrix.get(k, j);
                }
            }
        }
        return new Matrix(matTimes);
    }

    @Override
    public IMatrix times(int scalar){
        double[][] scalarMatrix = new double[this.getRows()][this.getColumns()];

        for(int i=0; i<this.getRows(); i++){
            for(int j=0; j<this.getColumns(); j++){
                scalarMatrix[i][j] = matrix[i][j] * scalar;
            }
        }
        return new Matrix(scalarMatrix);
    }

    @Override
    public IMatrix add(IMatrix matrix) {
        double[][] addMatrix = new double[this.getRows()][this.getColumns()];
        for (int i=0; i<this.getRows(); i++){
            for (int j=0; j<this.getColumns(); j++){
                addMatrix[i][j] = this.matrix[i][j] + matrix.get(i,j);
            }
        }
        return new Matrix(addMatrix);
    }

    @Override
    public IMatrix transpose() {
        double[][] transposeMatrix = new double[this.getColumns()][this.getRows()];

        for (int i=0; i<this.getRows(); i++){
            for (int j=0; j<this.getColumns(); j++){
                transposeMatrix[j][i] = this.matrix[i][j];
            }
        }


        return new Matrix(transposeMatrix);
    }

    @Override
    public boolean isSquare() {
        if (this.getRows() != this.getColumns()) {
            return false;
        }
        return true;
    }

    @Override
    public Number getTrace(){
        if (!this.isSquare()) return 0;

        double sum = 0;
        for (int i=0; i<this.getRows(); i++) {
            sum += this.matrix[i][i];
        }
        return sum;
    }



    @Override
    public int getRows(){
        return matrix.length;
    }

    @Override
    public int getColumns(){
        return matrix[0].length;
    }


    @Override
    public double get(int i, int m) {
        return matrix[i][m];
    }




}

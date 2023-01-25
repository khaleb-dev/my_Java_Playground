package doubleDim;

public class DoubleDimArray {
    private int[][] array;
    private int rows;
    private int columns;

    public DoubleDimArray(double[][] data, int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        array = new int[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public int get(int row, int column) {
        return array[row][column];
    }

    public void set(int row, int column, int value) {
        array[row][column] = value;
    }
    
    
    // private double[][] data;
    // private int rows;
    // private int cols;

    // public DoubleDimArray(double[][] data, int rows, int cols) {
    //     this.data = data;
    //     this.cols = cols;
    //     this.rows = rows;
    // }

    public double myRowAverage(int row) {
        return row;
    }
}

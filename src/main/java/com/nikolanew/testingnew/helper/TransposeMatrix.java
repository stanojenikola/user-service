package com.nikolanew.testingnew.helper;

import java.util.Scanner;

public class TransposeMatrix {

    public static void main(String[] args) {
        System.out.println("Welcome to Java program to transpose a Matrix");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter details of matrix");
        System.out.print("Please Enter number of rows: ");
        int row1 = scanner.nextInt();
        System.out.print("Please Enter number of columns: ");
        int col1 = scanner.nextInt();
        System.out.println();
        System.out.println("Enter first matrix elements");


        TransposeMatrix transposeMatrix = new TransposeMatrix(row1, col1);
        transposeMatrix.read(scanner);

        System.out.println("original matrix: ");
        transposeMatrix.print();

        transposeMatrix.transpose();
        System.out.println("transpose of the matrix is ");

        transposeMatrix.print();
        scanner.close();

    }

    private int rows;
    private int columns;
    private int[][] data;

    public TransposeMatrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.data = new int[rows][columns];
    }

    public TransposeMatrix(int[][] data) {
        this.data = data;
        this.rows = data.length;
        this.columns = data[0].length;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public void read(Scanner scanner) {
        System.out.println("rows: " + rows);
        System.out.println("columns: " + columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                data[i][j] = scanner.nextInt();
            }
        }
    }

    // preokkreni
    public void transpose() {
        int[][] temp = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                temp[j][i] = data[i][j];
            }
        }

        data = temp;
    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }


}

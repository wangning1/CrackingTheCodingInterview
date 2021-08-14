package com.winner;

import java.util.HashSet;
import java.util.Set;

public class _01_08_ZeroMatrix {
    public void setZeroes(int[][] matrix) {
        Set<Integer> rowZero = new HashSet<>();
        Set<Integer> colZero = new HashSet<>();
        //做标记
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    rowZero.add(i);
                    colZero.add(j);
                }
            }
        }

        //行清0
        for (int row : rowZero){
            int col = 0;
            while (col < matrix[0].length) {
                matrix[row][col] = 0;
                col++;
            }
        }

        //列清0
        for (int col : colZero){
            //列清0
            int row = 0;
            while (row < matrix.length) {
                matrix[row][col] = 0;
                row++;
            }
        }
    }
}

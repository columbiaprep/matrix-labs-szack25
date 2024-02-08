public class Main {
    public static void main(String[] args) {

    }

    int[][] scaleNumbers(int[][] array, int scale) {
        // Create a new 2d array called output w/ row and col count same as input
        int[][] output = new int[array.length][array[0].length];
        // Iterate through the 2d array input
        for (int r = 0; r < output.length; r++) {
            for (int c = 0; c < output[r].length; c++) {
                // For each value, multiply it by the scaling factor
                // Place that value in the output array in the same spot
                output[r][c] *= scale;
            }
        }
        return output;
    }
    int multiplyMatrices(int[][] matrix1, int[][] matrix2) {

    }
}

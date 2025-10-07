public class HourglassSums {

    public static void printAllHourglassSums(int[][] arr) {
        // There are 16 hourglasses (4 rows × 4 columns)
        for (int i = 0; i <= 3; i++) {       // rows
            for (int j = 0; j <= 3; j++) {   // cols
                int sum = calculateHourglassSum(arr, i, j);
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }

    private static int calculateHourglassSum(int[][] arr, int row, int col) {
        int sum = 0;
        // Top row
        sum += arr[row][col];
        sum += arr[row][col + 1];
        sum += arr[row][col + 2];

        // Middle
        sum += arr[row + 1][col + 1];

        // Bottom row
        sum += arr[row + 2][col];
        sum += arr[row + 2][col + 1];
        sum += arr[row + 2][col + 2];

        return sum;
    }

    public static void main(String[] args) {
        int[][] arr = {
            {-9, -9, -9,  1,  1,  1},
            { 0, -9,  0,  4,  3,  2},
            {-9, -9, -9,  1,  2,  3},
            { 0,  0,  8,  6,  6,  0},
            { 0,  0,  0, -2,  0,  0},
            { 0,  0,  1,  2,  4,  0}
        };

        printAllHourglassSums(arr);
    }
}

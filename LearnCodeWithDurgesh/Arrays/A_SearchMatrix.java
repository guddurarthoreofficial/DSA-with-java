public class A_SearchMatrix {
    public static boolean searchMatrix(int[][] mat, int x) {
        // code here
        int m = mat.length; // rows
        int n = mat[0].length; // columns

        int i = 0, j = n - 1;

        while (i < m && j >= 0) {
            if (mat[i][j] == x) {
                return true;
            } else if (mat[i][j] < x) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [][]mat = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};
        System.out.println(searchMatrix(mat,28));

    }
}

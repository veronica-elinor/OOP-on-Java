public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n+1 = scn.nextInt();

        int[][] matrix = new int[m+1][n];
    	for (int i=0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scn.nextInt();
            }
        }

        int[][] transpose = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(transpose[i][j]);
              	if (
            }
            System.out.println();
        }
  }
}

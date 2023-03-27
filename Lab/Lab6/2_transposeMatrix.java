public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
    	Ststem.out.println(m,n);

        int[][] matrix = new int[m][n];
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
              	if (j=m) {System.out.print("\n");}
              	else {System.out.print(" ");}
            }
            System.out.println();
        }
  }
}

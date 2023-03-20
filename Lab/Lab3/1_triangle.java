public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
    int N;
    int i,j;
    N=scn.nextInt();
    	for(i=1;i<=N;i++)
        {
          for(j=1;j<=i;j++)
          {
          	System.out.print("*");
            }
          System.out.print("\n");
        }
    }

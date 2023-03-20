public static void main(String[] args) {
Scanner scn=new Scanner(System.in);
    int i;
    i=scn.nextInt();
    int sum=0;
    
    if (i%2!=0 && i>0)
	i=i-1;
	while (i!=0) {
	sum=sum+i;
	i=i-2;
	}
	System.out.println(sum);
}

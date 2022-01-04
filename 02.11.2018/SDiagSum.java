import java.util.*;
class SDiagSum
{
  public static void main(String args[]) {
  Scanner sc=new Scanner(System.in);
  int r=sc.nextInt();
  int c=sc.nextInt();
  int a[][]= new int[r][c];
  int i, j, sum=0, te=c-1;
  for(i=0;i<r;i++) {
  for(j=0;j<c;j++) {
  a[i][j]=sc.nextInt();
  }
  }
for(i=0;i<r;i++) {
if(te>=0) {
sum=sum+a[i][te];
te--;
}
}
System.out.println("Sum of secondary diagonal is "+ sum);
}
}

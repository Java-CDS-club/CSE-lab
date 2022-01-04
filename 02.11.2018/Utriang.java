import java.util.*;
class Utriang
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
for(j=i+1;j<c;j++) {
a[i][j]=0;
}
}
System.out.println("The result is \n");
for(i=0;i<r;i++) {
  for(j=0;j<c;j++) {
 System.out.print(a[i][j]+" ");
  }
System.out.print("\n");
  }
}
}

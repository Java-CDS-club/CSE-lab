import java.util.*;
class Zigzag2D
{
  public static void main(String args[]) {
  Scanner sc=new Scanner(System.in);
  int r=sc.nextInt();
  int c=sc.nextInt();
  int a[][]= new int[r][c];
  int i, j;
  for(i=0;i<r;i++) {
  for(j=0;j<c;j++) {
  a[i][j]=sc.nextInt();
  }
  }
  for(i=0;i<r;i++) {
  if(i%2==1) 
   for(j=c-1;j>=0;j--) {
    System.out.print(a[i][j]+" ");
   }
else 
for(j=0;j<c;j++) {
System.out.print(a[i][j]+" ");
}
}
}
}
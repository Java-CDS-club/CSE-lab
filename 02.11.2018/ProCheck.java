import java.util.*;
class ProCheck
{
  public static void main(String args[]) {
  Scanner sc=new Scanner(System.in);
  int r=sc.nextInt();
  int c=sc.nextInt();
  int a[][]= new int[r][c];
  int i, j, k, l, pro;
  for(i=0;i<r;i++) {
  for(j=0;j<c;j++) {
  a[i][j]=sc.nextInt();
  }
  }
System.out.println("Product: ");
int p=sc.nextInt();
for(i=0;i<r;i++)
{
 for(j=0;j<c;j++) 
  {
   for(k=0;k<r;k++) 
   {
    for(l=0;l<c;l++)
    {
if(i==k && j==l)
continue;
else {
     pro=a[i][j]*a[k][l];
     if(pro==p)
    System.out.println("Yes");
    break;
    } }
   }
  }
}
} 
}

     

import java.util.*;
class ArrayFunctionSum
{
 public static void main (String args[]) {
 Scanner sc=new Scanner(System.in);
 int a=sc.nextInt();
 int n[]=new int[a];

  for(int i=0;i<n.length;i++)
   {
    System.out.println("Enter "+(i+1));
    n[i]=sc.nextInt();
   }
  int b=add(n,n.length);
  System.out.println("The value is "+b);
}
   public static int add(int a[], int n) { 
   int c=0;
    for(int i=0;i<a.length;i++)
  {
    c=c+a[i];
  }
  return c;
  }
}


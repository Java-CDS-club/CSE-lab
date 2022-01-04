import java.util.*;
class ArrayRecSum
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
  int b=add(n,a);
  System.out.println("The value is "+b);
}
   public static int add(int a[], int n) { 
   if(n==0)
   return 0;
else 
return a[n-1]+add(a, n-1);
  }
}


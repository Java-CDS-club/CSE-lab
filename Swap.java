import java.util.*;
class Swap
{
public static void main(String args[]) 
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int n[]=new int[a];
int temp;
for(int i=0;i<n.length;i++)
{
System.out.println("Enter "+(i+1));
n[i]=sc.nextInt();
}
for(int j=0;j<n.length;j++) {
for (int k=j+1;k<n.length;k++)
{
if(n[j] > n[k]) {
 temp=n[j];
n[j]=n[k];
n[k]=temp;
}
}
}
System.out.println(Arrays.toString(n));
}} 
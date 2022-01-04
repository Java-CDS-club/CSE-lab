import java.util.*;
class AscDscArray
{
public static void main(String args[]) 
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int n[]=new int[a];
int x[]=new int[a];
int y[]=new int[a];
int temp;
int i=0;
int k=0;
for(i=0;i<n.length;i++)
{
System.out.println("Enter "+(i+1));
n[i]=sc.nextInt();
}
for(i=0;i<a;i++) {
x[i]=n[i];
}
for(int j=0;j<x.length;j++) {
for (k=j;k<x.length;k++)
{
if(x[j] > x[k]) {
 temp=x[j];
x[j]=x[k];
x[k]=temp;
}
}
}
System.out.println("Ascending order is "+Arrays.toString(x));
for(i=0;i<a;i++) {
y[i]=n[i];
}
for(int j=0;j<y.length;j++) {
for (k=j;k<y.length;k++)
{
if(y[j] < y[k]) {
 temp=y[j];
y[j]=y[k];
y[k]=temp;
}
}
}
System.out.println("Decending order is "+Arrays.toString(y)); 
}} 
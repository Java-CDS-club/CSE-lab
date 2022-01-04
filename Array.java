import java.util.*;
class Array{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n[]=new int[8];
for(int i=0;i<8;i++)
{
System.out.println("Enter class for periods"+(i+1));
n[i]=sc.nextInt();
}
for(int j=0;j<8;j++)
{
System.out.println("class for period "+(j+1)+" is "+n[j]);
}
}
}
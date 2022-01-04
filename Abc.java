import java.io.*;
class Abc
{
static int a=1;
public static void main (String args[]) 
{
int i=4;
trian(i);
}
public static void trian(int k)
{
if(a<=4)
{
for(int j=1;j<=a;j++)
{
System.out.print(a+" ");
}
System.out.print("\n");

trian(a++);
}
}
}
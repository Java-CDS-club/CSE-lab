import java.io.*;
class SumDigit
{
static int sum(int n)
{
if(n==0)
return 0;
else 
return n%10+sum(n/10);
}
public static void main(String args[])
{
int n=5721;
int c=sum(n);
System.out.println(c);
}}
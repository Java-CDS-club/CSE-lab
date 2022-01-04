import java.io.*;
class Example1
{
static int rev=0;
public static void main(String args[])
{
int num=432;

revNum(num);
System.out.println(rev);
}
static void revNum(int n)
{
if(n>0){
rev=rev*10+n%10;
revNum(n/10);
}
}} 

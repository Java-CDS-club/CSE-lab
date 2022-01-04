import java.io.*;
class Frequecy
{
public static void main(String args[])
{
int n=12223444, i=0, j=0, k=0, l=0;
while(n>0)
{
int a=n%10;
switch (a)
{
case 1:
i++;
break;
case 2:
j++;
break;
case 3:
k++;
break;
case 4:
l++;
break;
}
n=n/10;
}
System.out.println("1= "+i+"; 2="+j+";3="+k+";4="+l);
}}
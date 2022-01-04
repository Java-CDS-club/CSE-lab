import java.io.*;
import java.util.*;
class Overloading
{

public static void main(String args[])
{
System.out.println("Enter the radius of the circle : ");
Scanner sc=new Scanner(System.in);
double r=sc.nextDouble();
System.out.println("Enter the side of the square : ");
int l=sc.nextInt();

System.out.println("Enter the side of the cube : ");
long a=sc.nextLong();
double ar_c= area(r);
int ar_s=area(l);
long v_c=area(a);
System.out.println("Area of circle is "+ar_c); 
System.out.println("Area of Square is "+ar_s); 
System.out.println("volume of cube is "+v_c); 

}



static int area(int x)
{
return x*x;
}
static double area(double y)
{
return 3.14*y*y;
}
static long area(long z)
{
return z*z*z;
}
}
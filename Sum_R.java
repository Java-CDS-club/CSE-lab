import java.io.*;
import java.util.*;
class Sum_R
{
static int sum=0;

public static void main(String args[])
{
System.out.println("Enter the number of natural numbers ");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
add(num);
System.out.println("The result is "+sum); 

}
static void add(int a)
{

if(a>0){
sum=sum+a;
add(a-1);

}

}
}

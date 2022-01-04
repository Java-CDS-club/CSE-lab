import java.util.*;
class Leap_year
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
Boolean b=check(a);
System.out.println(b);
}
public static Boolean check(int x){
if(x%4==0 && x%100!=0)
{
Boolean k=true;
return k;
}
else if(x%4==0 && x%100==0 && x%400==0)
{
Boolean l=true;
return l;
}
else
{
Boolean m=false;
return m;
}
}
}





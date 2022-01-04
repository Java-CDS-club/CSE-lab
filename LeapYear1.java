import java.util.*;
class LeapYear1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
String b=check(a);
System.out.println(b);
}
public static String check(int x){
if(x%4==0 && x%100!=0)
{
String k="Leap Year";
return k;
}
else if(x%4==0 && x%100==0 && x%400==0)
{
String l="Leap Year";
return l;
}
else
{
String m="Non Leap Year";
return m;
}
}
}




